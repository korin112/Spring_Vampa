package com.vam.model;

import lombok.Data;

@Data
public class UserDTO {
	private String id;
	private String password;
	private String name;
	private String birth;
	private String gender;
}
