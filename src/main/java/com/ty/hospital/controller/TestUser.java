package com.ty.hospital.controller;

import com.ty.hospital.dao.UserDao;
import com.ty.hospital.dto.User;

public class TestUser {

	public static void main(String[] args) {
		
		User user=new User();
		user.setEmail("Madhu@mail.com");
		user.setName("madhu");
		user.setPhone(8765432l);
		user.setPassword("13427");
		user.setRole("Nurse");
		
		UserDao dao =new UserDao();
		dao.craeteUser(user,1);
	}
}
