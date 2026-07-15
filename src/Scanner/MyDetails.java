package Scanner;

import java.util.Scanner;

public class MyDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.print("Enter Phone Number: ");
        long phno = sc.nextLong();

        sc.nextLine();

        System.out.print("Enter Location: ");
        String loc = sc.nextLine();

        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
        System.out.println("CGPA      : " + cgpa);
        System.out.println("Phone No. : " + phno);
        System.out.println("Location  : " + loc);

        sc.close();
    }
}