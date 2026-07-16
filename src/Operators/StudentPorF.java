package Operators;

public class StudentPorF {
	public static void main(String[] args) {
		int marks = 75;
		int attendence = 80;
		
		String m = (marks >= 35 && attendence >= 75 )? "Pass":"Fail";
		System.out.println(m);
	}

}
