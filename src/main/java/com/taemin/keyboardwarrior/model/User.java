package com.taemin.keyboardwarrior.model;

import java.util.Date;

public class User {

	private String authenticationCode;
	private String nickName;
	private Date createDate;
	
	
	public User(String authenticationCode, String nickName, Date createDate) {
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
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
}
