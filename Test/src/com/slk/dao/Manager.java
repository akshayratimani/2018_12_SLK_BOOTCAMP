package com.slk.dao;

import com.slk.entity.OrdersClass;

public class Manager {

	static OrdersClass orders[] = new OrdersClass[9];
	int i = 0;

	public Manager() {

	}

	public void addOrder(OrdersClass obj) {
		
		
		orders[obj.getTableNumber()-1] = obj;
	
	}

	public OrdersClass[] displayOrders() {
		try {
		
			
		} catch (Exception e) {
			
		}
		return orders;
	}
	
	public void removeOrder(int tno) {
		
		orders[tno-1]=null;
		if(orders[tno-1]==null) {
			System.out.println("working");
		}
	}

}
