package com.If;

import java.util.Scanner;

public class UniScholarship {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter CGPA: ");
		double cgpa = sc.nextDouble();
		System.out.println("Attendence Percentage: ");
		int ap = sc.nextInt();
		System.out.println("Annual Family Income: ");
		double fi = sc.nextDouble();
		
		if(cgpa>=85 && ap>=85 && fi<300000) {
			System.out.println("Scholarship Awarded");
		} else {
			System.out.println("Rejected");
		}
		sc.close();
		
	}

}