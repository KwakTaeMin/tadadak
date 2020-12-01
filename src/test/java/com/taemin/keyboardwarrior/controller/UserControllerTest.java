package com.taemin.keyboardwarrior.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.taemin.keyboardwarrior.model.User;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest extends AbstractControllerTest{

	@Autowired
	private UserController userController;
	
	@Autowired
	private ObjectMapper mapper;
	
	@Override
	protected Object controller() {
		return userController;
	}
	
	@Test
	public void getUsers() throws Exception{
		mockMvc.perform(get("/users"))
		.andExpect(MockMvcResultMatchers.status().isOk())
;	}
	
	@Test
	public void getUser() throws Exception {
		String userId = "taemin";
		mockMvc.perform(get("/users/{userId}", userId))
		.andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	public void createUser() throws JsonProcessingException, Exception {
		User user = new User();
		user.setId("joohye");
		user.setNickName("주혜연");
		mockMvc.perform(post("/user")
		.content(mapper.writeValueAsString(user))
		.contentType(MediaType.APPLICATION_JSON));
	}
	
	@Test
	public void modifyUser() throws JsonProcessingException, Exception {
		User user = new User();
		user.setId("taemin");
		user.setNickName("곽태민2");
		mockMvc.perform(put("/user")
		.content(mapper.writeValueAsString(user))
		.contentType(MediaType.APPLICATION_JSON));
	}
	
	@Test
	public void deleteUser() throws Exception {
		mockMvc.perform(delete("/users/{userId}", "taemin"));
	}
	

	
}
