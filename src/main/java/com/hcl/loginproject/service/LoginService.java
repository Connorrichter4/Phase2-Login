package com.hcl.loginproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.loginproject.model.UserEntity;
import com.hcl.loginproject.model.UserEntityCrudRepository;

@Service
public class LoginService {

	@Autowired
	UserEntityCrudRepository userEntityCrudRepository;

	public boolean loginUser(UserEntity user) {
		
		Iterable<UserEntity> allUsers = userEntityCrudRepository.findAll();

		for (UserEntity userEntity : allUsers) {
			if (userEntity.getName().equals(user.getName()) && userEntity.getPassword().equals(user.getPassword())) {
				return true;
			}
		}
		return false;
	}

}
