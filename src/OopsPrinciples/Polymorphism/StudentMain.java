package OopsPrinciples.Polymorphism;

public class StudentMain {
	public static void main(String[] args) {
		
		Student s1 = new Student("Kushal");
		Student s2 = new Student("Pavan","CSE");
		Student s3 = new Student("Sai","ISE",100);
		
		s1.display();
		s2.display();
		s3.display();
	}

}
