package com.shoppingcart.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class UserController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView loginPage() {

		ModelAndView mv = new ModelAndView("login");
		mv.addObject("msg", "Enter user name password");

		return mv;
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public ModelAndView loginPagePost(@RequestParam(value = "emailid", required = true) String email,
			@RequestParam(value = "password", required = true) String password) {
		ModelAndView mv;
		System.out.println(email);
		if (email.equals("name")) {
			 mv = new ModelAndView("login");
			mv.addObject("msg", "Method not allowed");
		}else {
			 mv = new ModelAndView("helloworld");
			 mv.addObject("msg", "welcome");
		}
		return mv;
	}

}
