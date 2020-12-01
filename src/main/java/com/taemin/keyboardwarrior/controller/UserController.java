package com.taemin.keyboardwarrior.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taemin.keyboardwarrior.model.User;
import com.taemin.keyboardwarrior.service.impl.IUserService;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	@GetMapping("/users/{userId}")
	public User getUser(String userID) {
		return userService.getUser(userID);
	}
	
	@PostMapping("/user")
	public User createUser(User user) {
		return userService.createUser(user);
	}
	
	@PutMapping("/user")
	public User modifyUser(User user) {
		return userService.modifyUser(user);
	}
	
	
}