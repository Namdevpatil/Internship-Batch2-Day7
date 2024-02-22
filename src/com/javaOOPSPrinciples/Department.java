package com.javaOOPSPrinciples;

public class Department {
	
	int id;
	String name;
	
	public Department() {
		id = 300;
		name = "QA";
	}

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Object object;
	
	@Override
	public String toString() //overrides java.lang.Object.toString
	{
		return "Department [id=" + id + ", name=" + name + "]";
	}
	

}
