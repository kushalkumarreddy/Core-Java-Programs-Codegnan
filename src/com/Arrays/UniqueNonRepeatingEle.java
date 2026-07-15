package com.Arrays;

public class UniqueNonRepeatingEle {
	public static void main(String[] args) {
		int arr[] = {4,6,8,4,9,2,1,3,0};
		
		for(int i=0;i<arr.length;i++) {
			boolean nrepeating = true;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]&&i!=j) {
					nrepeating = false;
					break;
				}
			}
			
			if(nrepeating) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}