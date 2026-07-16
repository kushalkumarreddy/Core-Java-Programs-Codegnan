package If;

import java.util.Scanner;

public class ElseIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks: ");
		int marks = sc.nextInt();
		char res;
		
		if(marks>=85) {
			res='A';
		} else if(marks>=75) {
			res='B';
		} else if(marks>=35) {
			res ='c';
		} else {
			res = 'F';
		}
		
		System.out.println("My Grade is: "+res);
		sc.close();
	}

}
