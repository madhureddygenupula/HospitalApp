package com.ty.hospital.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.ty.hospital.dao.EncounterDao;
import com.ty.hospital.dto.Encounter;

public class TestEncounter {

	public static void main(String[] args) {
		
     	Encounter encounter=new Encounter();
		encounter.setCreatorName("madhu");
		encounter.setCreatedDateTime(LocalDate.now());
		encounter.setReason("person is ill");
		
		EncounterDao dao=new EncounterDao();
		dao.createEncounter(1, 1, encounter);

		
	}
}