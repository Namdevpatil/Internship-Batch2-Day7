package com.javaOOPSPrinciples;

//Encapsulation
public class Product 
{
	//non-static fields
	private int id;
	private String name;
	private double price;
	
	
	//constructor: to initialize an object(fields/variables) 
	public Product()//default constructor
	{
		
	}

	//parameterized constructor
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	//method
	public String getProductDetails()
	{
		return this.id+" | "+this.name+" | "+this.price;
	}

}
