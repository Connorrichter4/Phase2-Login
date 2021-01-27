package com.hcl.loginproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.loginproject.model.UserEntity;
import com.hcl.loginproject.model.UserEntityCrudRepository;

@Service
public class SignupService {

	@Autowired
	UserEntityCrudRepository userEntityCrudRepository;
	
	public boolean addUser(UserEntity user) {
		// Checking to see if a user with the same name already exists
		if(checkIfUserExists(user)) {
			userEntityCrudRepository.save(user);
			return true;
		} else {			
			return false;
		}
	}
	
	private boolean checkIfUserExists(UserEntity user) {
		Iterable<UserEntity> allUsers = userEntityCrudRepository.findAll();
		
		for (UserEntity userEntity : allUsers) {
			if(userEntity.getName().equals(user.getName())) {
				return false;
			}
		}
		return true;
	}
	
}
