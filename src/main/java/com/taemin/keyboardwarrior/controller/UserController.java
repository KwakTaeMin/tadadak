package com.taemin.keyboardwarrior.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.taemin.keyboardwarrior.model.User;
import com.taemin.keyboardwarrior.service.impl.IUserService;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@GetMapping("users")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	@GetMapping("users/{userId}")
	public User getUser(@PathVariable(value="userId") String userId) throws Exception {
		return userService.getUser(userId);
	}
	
	@DeleteMapping("users/{userId}")
	public void deleteUser(@PathVariable(value="userId") String userId) throws Exception {
		userService.deleteUser(userId);
	}
	
	@PostMapping("user")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@PutMapping("user")
	public User modifyUser(@RequestBody User user) {
		return userService.modifyUser(user);
	}
	
	
}