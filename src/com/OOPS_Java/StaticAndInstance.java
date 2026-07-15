package com.OOPS_Java;

public class StaticAndInstance {
	int id;
	String name;
	static String instituteName;
	static {
		System.out.println("Static block 1");
	}
	
	static{
		System.out.println("Static block 2");
	}
	
	
	{
		System.out.println("Instance block 1");
	}
	
	{
		System.out.println("Instance block 2");
	}
	
	
	
	public static void main(String[] args) {
		StaticAndInstance s1 = new StaticAndInstance();
		s1.id = 20;
		s1.name ="ramu";
		System.out.println(s1.id+" "+s1.name);
		
		StaticAndInstance s2 = new StaticAndInstance();
		s2.id = 10;
		s2.name ="sita";
		System.out.println(s2.id+" "+s2.name);
	}

}