package com.Arrays;
import java.util.Scanner;

public class ArrayLength {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Length");
			int len = sc.nextInt();
			int arr[] = new int[len];
			
			for(int i=0;i<arr.length;i++) {
				System.out.println("Enter "+i+"th position value: ");
				arr[i]=sc.nextInt();
			}
			for(int i:arr) {
				System.out.println(i);
			}
			sc.close();
		}

	}
