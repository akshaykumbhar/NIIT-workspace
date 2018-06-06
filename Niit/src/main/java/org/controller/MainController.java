package org.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.hibernate.DOAuser;
@Controller
public class MainController {
	DOAuser du;
	@RequestMapping(value="/home")
	public ModelAndView home()
	{
		return new ModelAndView("index");
	}
	@RequestMapping(value="/product")
	public ModelAndView product()
	{
		return new ModelAndView("product");
	}
	@RequestMapping(value="/login")
	public ModelAndView login()
	{
		return new ModelAndView("login");
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
		
		int a =du.duser(username, password);
		if(a==1)
		{
			model.setViewName("login");
		}
		else{
			model.setViewName("register");
		}
		return model;
	}
}
