package org.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernates.DOAproduct;
import org.hibernates.DOAuser;
import org.hibernates.Product;
import org.hibernates.Users;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	

	@RequestMapping(value="/home")
	public ModelAndView home()
	{	ModelAndView model = new ModelAndView();
		model.setViewName("index");
		if(SecurityContextHolder.getContext().getAuthentication().getName().equals("anonymousUser"))
		{
			model.addObject("slog","<a href=\"login\"><button class=\"btn-special\"><b>Sign-in</b></button></a>");
		}
		else
		{
			if(SecurityContextHolder.getContext().getAuthentication().getName().equals("admin"))
			{
				model.addObject("admin","<a href=\"admin\"><button class=\"btn-normal\"><b>Admin</b></button></a>");
			}
			else
			{
			model.addObject("acc", "<a href=\"account\"><button class=\"btn-normal\"><b>Account</b></button></a>");
			}
			model.addObject("slog","<a href=\"j_spring_security_logout\"><button class=\"btn-special\"><b>Logout</b></button></a>");
		}
		
		List<Product> pro =DOAproduct.pdetails();
		
		model.addObject("product",pro);
		return model ;
	}
	@RequestMapping(value="/")
	public ModelAndView index()
	{	ModelAndView model = new ModelAndView();
		model.setViewName("index");
		if(SecurityContextHolder.getContext().getAuthentication().getName().equals("anonymousUser"))
		{
			model.addObject("slog","<a href=\"login\"><button class=\"btn-special\"><b>Sign-in</b></button></a>");
		}
		else
		{
			if(SecurityContextHolder.getContext().getAuthentication().getName().equals("admin"))
			{
				model.addObject("admin","<a href=\"admin\"><button class=\"btn-normal\"><b>Admin</b></button></a>");
			}
			else
			{
			model.addObject("acc", "<a href=\"account\"><button class=\"btn-normal\"><b>Account</b></button></a>");
			}
			model.addObject("slog","<a href=\"j_spring_security_logout\"><button class=\"btn-special\"><b>Logout</b></button></a>");
		}
		
		List<Product> pro =DOAproduct.pdetails();
		
		model.addObject("product",pro);
		return model ;
	}
	@RequestMapping(value="/product")
	public ModelAndView product()
	{
		ModelAndView model = new ModelAndView();
		if(SecurityContextHolder.getContext().getAuthentication().getName().equals("anonymousUser"))
		{
			model.addObject("slog","<a href=\"login\"><button class=\"btn-special\"><b>Sign-in</b></button></a>");
		}
		else
		{
			model.addObject("acc", "<a href=\"account\"><button class=\"btn-normal\"><b>Account</b></button></a>");
			model.addObject("slog","<a href=\"j_spring_security_logout\"><button class=\"btn-special\"><b>Logout</b></button></a>");
		}
		if(SecurityContextHolder.getContext().getAuthentication().getName().toString().equals("admin"))
		{
			model.addObject("admin","<a href=\"admin\"><button class=\"btn-normal\"><b>Admin</b></button></a>");
		}
		List<Product> pro =DOAproduct.pdetails();
		model.setViewName("product");
		model.addObject("product",pro);
		return model ;
	}
	@RequestMapping(value="/login")
	public ModelAndView login()
	{
		
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		return model;
	}
	@RequestMapping(value="/loginerror")
	public ModelAndView loginerror()
	{
		
		ModelAndView model = new ModelAndView();
		model.setViewName("loginerror");
		return model;
	}

	@RequestMapping(value="/register")
	public ModelAndView register()
	{
		return new ModelAndView("register");
	}
	
	@RequestMapping(value="/userregister")
	public ModelAndView userregister(HttpServletRequest req)
	{
		ModelAndView model = new ModelAndView();
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
		String pass = encoder.encode(password);
		int a =DOAuser.duser(username, pass);
		if(a==1)
		{
			model.addObject("message",1);
			model.setViewName("login");
		}
		else{
			model.addObject("message",1);
			model.setViewName("register");
		}
		return model;
	}
	@RequestMapping(value="/account")
	public ModelAndView account()
	{
		ModelAndView model = new ModelAndView();
		model.setViewName("account");
		Users user = DOAuser.getuser(SecurityContextHolder.getContext().getAuthentication().getName().toString());
		model.addObject("user",user);
		if(SecurityContextHolder.getContext().getAuthentication().getName().equals("anonymousUser"))
		{
			model.addObject("slog","<a href=\"login\"><button class=\"btn-special\"><b>Sign-in</b></button></a>");
		}
		else
		{
			model.addObject("acc", "<a href=\"account\"><button class=\"btn-normal\"><b>Account</b></button></a>");
			model.addObject("slog","<a href=\"j_spring_security_logout\"><button class=\"btn-special\"><b>Logout</b></button></a>");
		}
		
		
		return model;
	}
	@RequestMapping(value="/admin")
	public ModelAndView admin()
	{
		ModelAndView model = new ModelAndView();
		model.setViewName("admin");
		if(SecurityContextHolder.getContext().getAuthentication().getName().equals("anonymousUser"))
		{
			model.addObject("slog","<a href=\"login\"><button class=\"btn-special\"><b>Sign-in</b></button></a>");
		}
		else
		{
			
			model.addObject("slog","<a href=\"j_spring_security_logout\"><button class=\"btn-special\"><b>Logout</b></button></a>");
		}
		if(SecurityContextHolder.getContext().getAuthentication().getName().equals("admin"))
		{
			model.addObject("admin","<a href=\"admin\"><button class=\"btn-normal\"><b>Admin</b></button></a>");
		}
		return model;
	}
	
	@RequestMapping(value="/admineu")
	public ModelAndView admineu()
	{
		ModelAndView model = new ModelAndView();
		model.setViewName("admineu");
		List<Users> user = DOAuser.getup();
		model.addObject("admin","<a href=\"admin\"><button class=\"btn-normal\"><b>Admin</b></button></a>");
		model.addObject("slog","<a href=\"j_spring_security_logout\"><button class=\"btn-special\"><b>Logout</b></button></a>");
		model.addObject("user", user);
		return model;
	}
	@RequestMapping(value="/adminep")
	public ModelAndView adminep()
	{
		ModelAndView model = new ModelAndView();
		model.setViewName("adminep");
		List<Product> pro =DOAproduct.pdetails();	
		model.addObject("product",pro);
		model.addObject("admin","<a href=\"admin\"><button class=\"btn-normal\"><b>Admin</b></button></a>");
		model.addObject("slog","<a href=\"j_spring_security_logout\"><button class=\"btn-special\"><b>Logout</b></button></a>");
		return model;
	}

	@RequestMapping(value="/admindelp")
	public ModelAndView delp(HttpServletRequest req)
	{
		ModelAndView model = new ModelAndView();
		model.setViewName("adminep");
		String id = req.getParameter("id");
		DOAproduct.del(id);
		List<Product> pro =DOAproduct.pdetails();	
		model.addObject("product",pro);
		model.addObject("admin","<a href=\"admin\"><button class=\"btn-normal\"><b>Admin</b></button></a>");
		model.addObject("slog","<a href=\"j_spring_security_logout\"><button class=\"btn-special\"><b>Logout</b></button></a>");
		return model;
	}
	
	@RequestMapping(value="/admindel")
	public ModelAndView deluser( HttpServletRequest req)
	{
		String username = req.getParameter("user");
		DOAuser.del(username);
		ModelAndView model = new ModelAndView();
		model.setViewName("admineu");
		List<Users> user = DOAuser.getup();
		model.addObject("admin","<a href=\"admin\"><button class=\"btn-normal\"><b>Admin</b></button></a>");
		model.addObject("slog","<a href=\"j_spring_security_logout\"><button class=\"btn-special\"><b>Logout</b></button></a>");
		model.addObject("user", user);
		return model;
	}
}
