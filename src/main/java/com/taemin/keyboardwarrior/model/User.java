package com.taemin.keyboardwarrior.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="user")
@Entity
@Data
public class User {

	@Id
	@Column(name="id")
	private String id;
	@Column(name="nickName")
	private String nickName;
	
	
}
