package com.cg.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.service.UserService;

@RestController
@RequestMapping("/profileController")
public class ProfileController {

	@Autowired
	UserService userService;

	@DeleteMapping("/delete")
	@PreAuthorize("hasAnyAuthority('Admin')")
	public ResponseEntity<?> deleteByUsername(Principal principal) {
		String userName = principal.getName();
		userService.deleteByUsername(userName);
		return new ResponseEntity<String>("user is deleted", HttpStatus.OK);
	}
}
