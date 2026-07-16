package If;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		String name = "Kushal";
		int password =123;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter UserName: ");
		String uname = sc.next();
		
		System.out.println("Enter Password: ");
		int upw = sc.nextInt();
		
		if(name.equals(uname)) {
			if(password == upw) {
				System.out.println("Login Sucessful");
			} else {
				System.out.println("Login Failed");
			}
		} else {
			System.out.println("Invalid Creditionals");
		}
		sc.close();
	}

}
