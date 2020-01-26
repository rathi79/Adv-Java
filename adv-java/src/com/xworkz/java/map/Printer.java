package com.xworkz.java.map;

public class Printer {
	int id;
	String name;
	double price;
	
	public Printer(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Printer [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
