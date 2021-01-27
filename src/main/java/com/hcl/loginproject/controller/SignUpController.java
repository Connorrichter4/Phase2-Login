package com.hcl.loginproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcl.loginproject.model.UserEntity;
import com.hcl.loginproject.model.UserEntityCrudRepository;
import com.hcl.loginproject.service.SignupService;

@Controller
public class SignUpController {
	
	@Autowired
	SignupService service;

	@RequestMapping(value="/signup", method = RequestMethod.GET)
	public String showSignUpPage(ModelMap model){
		return "signup";
	}
	
	@RequestMapping(value="/signup", method = RequestMethod.POST)
	public String postSignUp(Model model, @ModelAttribute("user") UserEntity user) {
		
//		https://www.onlinetutorialspoint.com/spring-boot/spring-boot-mvc-example-tutorials.html
		if(user != null && user.getName() != null && user.getPassword() != null) {
			service.addUser(user);
			model.addAttribute("name", user.getName());
			return "welcome";
		}else {
			return "signup";
		}
	}
	
}
