package com.javaOOPSPrinciples;

public class TestClass {

	public static void main(String[] args) {
		
		Product product = new Product(1990, "FastTrack Watch", 3500.78);
		System.out.println(product.getProductDetails());
		
		System.out.println("==================================");
		
		Product product1 = new Product(8899, "Sonata Watch", 2400.78);
		System.out.println(product1.getProductDetails());

	}

}
