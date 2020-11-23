package com.taemin.keyboardwarrior.model;

import java.util.Date;

import com.google.firebase.database.IgnoreExtraProperties;
@IgnoreExtraProperties
public class User {

	private String authenticationCode;
	private String nickName;
	private Long createDate;
	
	
	public User(String authenticationCode, String nickName, Long createDate) {
		super();
		this.authenticationCode = authenticationCode;
		this.nickName = nickName;
		this.createDate = createDate;
	}
	public String getAuthenticationCode() {
		return authenticationCode;
	}
	public void setAuthenticationCode(String authenticationCode) {
		this.authenticationCode = authenticationCode;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Long getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Long createDate) {
		this.createDate = createDate;
	}
	
	
	
}
