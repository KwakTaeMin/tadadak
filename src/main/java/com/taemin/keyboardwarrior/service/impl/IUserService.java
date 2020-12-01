package com.taemin.keyboardwarrior.service.impl;

import java.util.List;

import com.taemin.keyboardwarrior.model.User;

public interface IUserService {
	public User createUser(User user);
	public User modifyUser(User user);
	public User getUser(String userId) throws Exception;
	public void deleteUser(String userId);
	public List<User> getUsers();
}
