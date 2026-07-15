package com.OOPS_Java;

public class Rectangle {
	double length;	//instance variables
	double breath;
	
	public static void main(String args[]) {
		Rectangle rect1 = new Rectangle();
		rect1.length = 20;
		rect1.length = 30;
		
		Rectangle rect2 = new Rectangle();
		rect2.length = 10;
		rect2.length = 20;
		
		System.out.println(rect1); // stores reference address
		System.out.println(rect2);
		
		System.out.println(rect1.length+" "+rect1.breath);
		System.out.println(rect2.length+" "+rect2.breath);
		
	}

}
