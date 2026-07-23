package OopsPrinciples.Polymorphism;

public class Student {
	String Sname;
	String course;
	double fee;
	
	public Student(String Sname) {
		this.Sname = Sname;
	}
	
	public Student(String Sname, String course) {
		this.Sname = Sname;
		this.course = course;
	}
	
	public Student(String Sname, String course, double fee) {
		this.Sname = Sname;
		this.course = course;
		this.fee = fee;
	}
	
	void display() {
		System.out.println("Student Name: "+Sname);
		
		if(course != null) {
		System.out.println("Course: "+course);
		}
		
		if(fee != 0) {
			System.out.println("Fees: "+fee);
		}
		
		System.out.println();
	}

}
