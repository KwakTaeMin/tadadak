package com.taemin.keyboardwarrior.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taemin.keyboardwarrior.model.User;

@RestController
public class UserController {
	@GetMapping("/users")
	public String getUsers() {
		return "taemin";
	}
	
	@PostMapping("user")
	public void createUser(User user) {
		
	}
}