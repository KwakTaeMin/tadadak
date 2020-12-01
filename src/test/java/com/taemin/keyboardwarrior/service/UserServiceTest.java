package com.taemin.keyboardwarrior.service;

import java.util.ArrayList;
import java.util.List;

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
	public void _createUser() {
		User user = new User();
		user.setId("taemin");
		user.setNickName("곽태민");
		userService.createUser(user);
	}
	
	@DisplayName("User 수정")
	@Test
	public void _modifyUser() {
		User user = new User();
		user.setId("taemin");
		user.setNickName("곽태민2");
		userService.createUser(user);
	}
	
	@DisplayName("User 전체 가져오기")
	@Test
	public void _getUsers() {
		List<User> users =  userService.getUsers();
	}
	
	@DisplayName("User 가져오기 (특정 ID)")
	@Test
	public void _getUser() {
		User user = userService.getUser("taemin");
	}
}
