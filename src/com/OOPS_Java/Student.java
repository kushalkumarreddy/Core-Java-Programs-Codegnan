package com.OOPS_Java;

public class Student {
	String name;
	int id;
	char gender;
	String InstituteName = "Codegnan";
	
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.name = "Sai";
		stu1.id = 123;
		stu1.gender = 'M';
		
		Student stu2 = new Student();
		stu2.name = "Kushal";
		stu2.id = 1;
		stu2.gender = 'M';
		
		System.out.println(stu1.name+" "+stu1.id+" "+stu1.gender+" "+stu1.InstituteName);
		System.out.println(stu2.name+" "+stu2.id+" "+stu2.gender+" "+stu1.InstituteName);
		
	}

}
