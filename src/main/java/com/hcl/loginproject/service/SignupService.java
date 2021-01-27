package com.hcl.loginproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.loginproject.model.UserEntity;
import com.hcl.loginproject.model.UserEntityCrudRepository;

@Service
public class SignupService {

	@Autowired
	UserEntityCrudRepository userEntityCrudRepository;
	
	public void addUser(UserEntity user) {
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		userEntityCrudRepository.save(user);
	}
	
}
