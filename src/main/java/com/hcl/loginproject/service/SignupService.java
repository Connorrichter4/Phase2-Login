package com.hcl.loginproject.service;

import org.springframework.stereotype.Service;

import com.hcl.loginproject.model.UserEntity;
import com.hcl.loginproject.model.UserEntityCrudRepository;

@Service
public class SignupService {

	UserEntityCrudRepository userEntityCrudRepository;
	
	public void addUser(UserEntity user) {
		userEntityCrudRepository.save(user);
	}
	
}
