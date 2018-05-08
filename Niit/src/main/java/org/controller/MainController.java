package org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
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
}
