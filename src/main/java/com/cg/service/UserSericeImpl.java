package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.repository.UserProfileRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class UserSericeImpl implements  UserService{

	@Autowired
	UserProfileRepository userProfileRepository;
	
	@Override
	public String deleteByUsername(String username) {
		userProfileRepository.deleteByUsername(username);
		return "user is deleted";
		
	}

}
