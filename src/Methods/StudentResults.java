package Methods;

import java.util.Scanner;

public class StudentResults {
	int m1, m2, m3, m4, m5;
    int total;
    double average;
    String grade;

    public void acceptMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks of Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        m3 = sc.nextInt();

        System.out.print("Enter Marks of Subject 4: ");
        m4 = sc.nextInt();

        System.out.print("Enter Marks of Subject 5: ");
        m5 = sc.nextInt();
    }

    public void calculateTotal() {
        total = m1 + m2 + m3 + m4 + m5;
    }

    public void calculateAverage() {
        average = total / 5.0;
    }

    public void findGrade() {
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else {
            grade = "Fail";
        }
    }

    public void displayResult() {
        System.out.println("\n----- Student Result -----");
        System.out.println("Subject 1 Marks : " + m1);
        System.out.println("Subject 2 Marks : " + m2);
        System.out.println("Subject 3 Marks : " + m3);
        System.out.println("Subject 4 Marks : " + m4);
        System.out.println("Subject 5 Marks : " + m5);
        System.out.println("Total Marks     : " + total);
        System.out.println("Average         : " + average);
        System.out.println("Grade           : " + grade);
    }

    public static void main(String[] args) {

        StudentResults s = new StudentResults();

        s.acceptMarks();
        s.calculateTotal();
        s.calculateAverage();
        s.findGrade();
        s.displayResult();
    }
	
}
