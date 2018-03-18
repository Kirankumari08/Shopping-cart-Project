package com.shoppingcart.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/register")
public class RegistrationController {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView registrationPage() {
 
		ModelAndView mv = new ModelAndView("registration");
		mv.addObject("msg", "Enter user name password");
		
		return mv;
	}

}
