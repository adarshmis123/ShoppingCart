package com.cg.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

	String deleteByUsername(String username);

}
