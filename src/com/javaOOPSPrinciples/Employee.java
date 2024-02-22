package com.javaOOPSPrinciples;

//Inheritance: extends
public class Employee extends Department
{
	
	public Employee() {
		id = 2200;
		name = "Dev";
	}

	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	

}
