package com.ty.hospital.controller;

import com.ty.hospital.dao.ItemDao;
import com.ty.hospital.dto.Items;

public class TestItem {

	public static void main(String[] args) {
		
		Items item=new Items();
		
		item.setName("paracetmol");
		item.setMessage("fever");
		item.setPrice(25);
		item.setQuantity(1);
		
		ItemDao itemDao=new ItemDao();
		itemDao.createItem(1, item);
		
	}
}
