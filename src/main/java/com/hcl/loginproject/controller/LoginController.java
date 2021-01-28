package com.hcl.loginproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcl.loginproject.model.UserEntity;
import com.hcl.loginproject.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(Model model, @ModelAttribute("user") UserEntity user) {
		
		if (user != null && user.getName() != "" && user.getPassword() != "") {
			if (service.loginUser(user)) {
				return "welcome";
			}
		}
		model.addAttribute("error", "Invalid Details!");
		return "login";

	}

}
