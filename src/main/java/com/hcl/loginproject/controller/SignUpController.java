package com.hcl.loginproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcl.loginproject.model.UserEntity;
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
		
		if(user != null && user.getName() != "" && user.getPassword() != "") {
			if(service.createUser(user)) {				
				return "welcome";
			}else {
				model.addAttribute("error", "Username taken!");
				return "signup";
			}
		}else {
			model.addAttribute("error", "Fill in all details");
			return "signup";
		}
	}
	
}
