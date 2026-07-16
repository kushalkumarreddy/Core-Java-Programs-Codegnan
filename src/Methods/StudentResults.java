package Methods;

import java.util.Scanner;

public class StudentResults {
	int[] marks = new int[5];
	int total;
	double average;
	String grade;
	
	public void acceptMarks() {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter Marks of 5 Subjects: ");
		for(int i=0;i<5;i++) {
			System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();			
		}
	}
	
	public void calculateTotal() {
		total = 0;
		for(int i=0;i<5;i++) {
			total = total + marks[i];
		}
	}
	
	public void average() {
		average = total/5.0;
	}
	
	public void findGrade() {
		if(average >=90){
			grade = "A+";
		} else if(average >=80){
			grade = "A";
		} else if(average >= 70) {
			grade = "B";
		} else if(average >= 60) {
			grade = "C";
		} else {
			grade = "Fail";
		}
	}
	
	public void displayResult() {
		System.out.println("Student Result");
		
		for(int i=0;i<5;i++) {
			System.out.println("Subject "+(i+1)+" Marks: "+marks[i]);
		}
		
		System.out.println("Total Marks: "+total);
		System.out.println("Average: "+average);
		System.out.println("Grade: "+grade);
	}
	
	public static void main(String[] args) {
		StudentResults s = new StudentResults();
		
		s.acceptMarks();
		s.calculateTotal();
		s.average();
		s.findGrade();
		s.displayResult();
	}
	
}
