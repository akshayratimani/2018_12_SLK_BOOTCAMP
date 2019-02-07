package com.slk.dao;

import com.slk.entity.OrdersClass;

public class Manager {

	static OrdersClass orders[] = new OrdersClass[8];
	int i = 0;

	public Manager() {

	}

	public void addOrder(OrdersClass obj) {
		
		
		orders[obj.getTableNumber()-1] = obj;
		System.out.println("After adding:"+orders[0].toString());
	}

	public OrdersClass[] displayOrders() {
		try {
			System.out.println("Displaying:"+orders[0].toString());
			
		} catch (Exception e) {
			
		}
		return orders;
	}

}
