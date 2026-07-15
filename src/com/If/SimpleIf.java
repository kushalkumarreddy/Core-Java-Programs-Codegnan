package com.If;

import java.util.Scanner;

public class SimpleIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marks: ");
		int marks = sc.nextInt();
		
		if(marks>=35) {
			System.out.println("Result: Pass");
		} else {
			System.out.println("Result: Fail");
		}
		System.out.println("Completed My Program");
		sc.close();
	}

}
