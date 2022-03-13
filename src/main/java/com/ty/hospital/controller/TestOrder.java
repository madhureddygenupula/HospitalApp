package com.ty.hospital.controller;

import java.time.LocalDateTime;

import com.ty.hospital.dao.OrderDao;
import com.ty.hospital.dto.Orders;

public class TestOrder {

	public static void main(String[] args) {
		
		Orders order=new Orders();
		order.setCreatedDateTime(LocalDateTime.now());
		order.setCreatorName("madhu");
		order.setMessage("fever");
		
		OrderDao orderDao=new OrderDao();
		orderDao.createOrder(1, order);
		
		 
	}
}
