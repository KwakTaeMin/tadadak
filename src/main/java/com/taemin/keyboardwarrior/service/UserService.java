package com.taemin.keyboardwarrior.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taemin.keyboardwarrior.model.User;
import com.taemin.keyboardwarrior.repository.UserRepository;
import com.taemin.keyboardwarrior.service.impl.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void save(User user) {
		userRepository.save(user);
	}

}
