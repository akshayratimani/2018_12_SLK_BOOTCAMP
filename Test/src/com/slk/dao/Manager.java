package com.slk.dao;

import com.slk.entity.OrdersClass;

public class Manager {
	
	OrdersClass orders[];
	int i=0;
	
	public Manager() {
		orders = new OrdersClass[8];
		
	}
	
	public void addOrder(OrdersClass obj)
	{
		orders[obj.getTableNumber()]=obj;
		
		System.out.println("Add");
		
		for (int i = 0; i < orders.length; i++) {
				System.out.println("array:"+orders[i]);
			
		}
	
	}
	
	public OrdersClass[] displayOrders()
	{
		for (int j = 0; j < orders.length; j++) {
			System.out.println(orders[j]);
		}
		
		
		return orders;
	}

}
