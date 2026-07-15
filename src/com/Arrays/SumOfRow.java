package com.Arrays;

import java.util.Scanner;

public class SumOfRow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][3];

        System.out.println("Enter 12 elements:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }

            System.out.println("Row " + (i + 1) + " Sum = " + sum);
        }

        sc.close();
    }

}
