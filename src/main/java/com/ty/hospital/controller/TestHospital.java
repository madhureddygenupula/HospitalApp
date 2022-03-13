package com.ty.hospital.controller;

import com.ty.hospital.dao.HospitalDao;
import com.ty.hospital.dto.Hospital;

public class TestHospital {

	public static void main(String[] args) {
		
		Hospital hospital=new Hospital();
		hospital.setName("Srinisa");
		hospital.setWebsite("www.srinivasa.com");
		hospital.setGst(25.0);
		
		HospitalDao dao=new HospitalDao();
		dao.createHospital(hospital);
		
		
		
	}
}
