package com.OOPS_Java;

public class Mobileinfo {
	static String brand = "Samsung";
	
	String model;
	int price;
	String color;
	
	static {
		System.out.println("Mobile Store Opened");
	}
	
	{
		System.out.println("Mobile Object Created");
	}
	public static void main(String[] args) {
		
	
	Mobileinfo m1 = new Mobileinfo();
	m1.model = "Galaxy A55";
	m1.price = 35000;
	m1.color = "Black";
	
	Mobileinfo m2 = new Mobileinfo();
	m2.model = "Galaxt S24";
	m2.price = 75000;
	m2.color = "Blue";
	
	System.out.println("\nBrand : "+brand);
	System.out.println("\nMobile 1\nModel : "+m1.model+"\nPrice : "+m1.price+"\nColor : "+m1.color);
	System.out.println("\nMobile 2\nModel : "+m2.model+"\nPrice : "+m2.price+"\nColor : "+m2.color);
	
	
	}

}
