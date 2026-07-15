package com.If;

import java.util.Scanner;

public class Admission {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrance Exam Rank: ");
		int eer = sc.nextInt();
		System.out.println("Inter Percent: ");
		int ip = sc.nextInt();
		System.out.println("Your Age: ");
		int age = sc.nextInt();
		
		if(eer<=1000 && ip>=75) {
			if(age>=17) {
				System.out.println("Admission Conformed");
			}
		} else {
			System.out.println("Admission Canclled");
		}
		sc.close();
	}

}
