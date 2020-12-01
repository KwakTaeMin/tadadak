package com.taemin.keyboardwarrior.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.taemin.keyboardwarrior.model.User;
import com.taemin.keyboardwarrior.service.impl.IUserService;

@SpringBootTest
public class UserServiceTest {

	@Autowired
	IUserService userService;
	
	@DisplayName("User 생성")
	@Test
	void _createUser() {
		User user = new User();
		user.setId("taemin");
		user.setNickName("곽태민");
		userService.save(user);
	}
}
