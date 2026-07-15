//using this keyword
package Constructor;

public class Student1{
	int age;
	String name;
	
	public Student1(int age,String name) {
		this.age=age;
		this.name=name;
	}
	
	void display() {
		System.out.println("Name: "+name+"\nAge: "+age+"\n");
	}
	
	
	public static void main(String[] args) {
		Student1 s1 = new Student1(23,"ram");
		s1.display();
		
		Student1 s2 = new Student1(24,"sam");
		s2.display();
		
	}

}