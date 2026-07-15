package com.OOPS_Java;

public class StudMgmt {
	int id;
	String name;
	String course;
	
	static {
		System.out.println("Student Management System Started\n");
	}
	
	{
		System.out.println("Studenr object created");
	}
	
	public static void main(String[] args) {
		StudMgmt s1 = new StudMgmt();
		s1.id = 101;
		s1.name = "Ravi";
		s1.course = "Java";
		
		StudMgmt s2 = new StudMgmt();
		s2.id = 102;
		s2.name = "Priya";
		s2.course = "Python";
		
		System.out.println("\nStudent 1\nID : "+s1.id+"\nName : "+s1.name+"\nCourse : "+s1.course);
		System.out.println("\nStudent 2\nID : "+s2.id+"\nName : "+s2.name+"\nCourse : "+s2.course);
		
		
	}

}
