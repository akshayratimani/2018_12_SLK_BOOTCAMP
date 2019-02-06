package com.slk.entity;

public class OrdersClass {
	
	private int tableNumber;
	private String dish;
	
	public OrdersClass() {
		// TODO Auto-generated constructor stub
	}

	public OrdersClass(int tableNumber, String orders) {
		super();
		this.tableNumber = tableNumber;
		this.dish = orders;
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public String getDish() {
		return dish;
	}

	public void setDish(String orders) {
		this.dish = orders;
	}

	@Override
	public String toString() {
		return "OrdersClass [tableNumber=" + tableNumber + ", orders=" + dish + "]";
	}
	
}
