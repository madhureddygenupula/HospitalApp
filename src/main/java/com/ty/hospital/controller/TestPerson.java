package com.ty.hospital.controller;

import com.ty.hospital.dao.PersonDao;
import com.ty.hospital.dto.Person;

public class TestPerson {

	public static void main(String[] args) {
		
	   Person person=new Person();
	   person.setName("Madhu");
	   person.setEmail("madhu@mail.com");
	   person.setAge(23);
	   person.setGender("male");
	   person.setPhone(5467328l);
	   
	  PersonDao dao=new PersonDao();
	  dao.createPerson(person);
	}
}
