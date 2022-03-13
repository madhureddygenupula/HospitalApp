package com.ty.hospital.controller;

import java.util.Scanner;

import com.ty.hospital.dao.AddressDao;
import com.ty.hospital.dto.Address;

public class TestAddress {

	public static void main(String[] args) {
	
		Address address=new Address();
		address.setAdress("Kadapa");
		address.setState("Andhra Pradesh");
		address.setPin(516502);
		
		
		AddressDao addressDao=new AddressDao();
		addressDao.createAddress(1, address);

		
	}
}

