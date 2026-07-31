package mypack1;

public class StudentMain {
	public static void main(String[] args) {
		Student s = new Student();
		
		System.out.println(s.a);
		System.out.println(s.b);
		System.out.println(s.c);
//		System.out.println(s.d);  //d is in protected so can't use
	}

}
