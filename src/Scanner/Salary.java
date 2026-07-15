package Scanner;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Employee name: ");
		String name = sc.nextLine();
		
		System.out.print("Employee id: ");
		int id = sc.nextInt();
		
		System.out.print("Monthly Salary: ");
		double sal = sc.nextDouble();
		
		System.out.println("Employee name: "+name);
		System.out.println("Employee id: "+id);
		System.out.println("Monthly Salary: "+sal);
		
		sc.close();
	}

}
