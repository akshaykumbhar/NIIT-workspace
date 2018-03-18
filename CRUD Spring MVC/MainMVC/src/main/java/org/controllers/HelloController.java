package org.controllers;




import javax.servlet.http.HttpServletRequest;

import org.hibernate.Main;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="/home")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping(value="/login")
	public String login()
	{
		return "login";
	}
	@RequestMapping(value="/hello")
	public ModelAndView hello()
	{
		return new ModelAndView("hello");
	}

	@RequestMapping(value="/reg")
	public ModelAndView reg(HttpServletRequest req)
	{
		ModelAndView model = new ModelAndView("Done");
		String rollno = req.getParameter("rollno");
		String name= req.getParameter("fname");
		String dep = req.getParameter("department");
		Main.login(rollno,name,dep);
		return model;
	}
	
	@RequestMapping(value="/view")
	public ModelAndView view()
	{
		ModelAndView model = new ModelAndView("view");
		String data =Main.view();
		
		model.addObject("message", data);
		return model;
		
	}
	@RequestMapping(value="/del")
	public ModelAndView del()
	{
		return new ModelAndView("del");
	}
	@RequestMapping(value="/delmet")
	public ModelAndView delmet( HttpServletRequest req)
	{
		String Rollno = req.getParameter("rollno");
		Main.del(Rollno);
		return new ModelAndView("Done");
	}
	@RequestMapping(value="/update")
	public ModelAndView update()
	{
		return new ModelAndView("update");
	}
	@RequestMapping("/updatemet")
	public ModelAndView updatemet( HttpServletRequest req)
	{
		ModelAndView model =  new ModelAndView("Done");
		Main.update(req.getParameter("rollno"),req.getParameter("fname"),req.getParameter("department"));
		return model;
	}
}
