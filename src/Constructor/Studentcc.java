//COPY CONSTRUCTOR
package Constructor;

public class Studentcc {
	int age;
	String name;
	
	public Studentcc(int sage,String sname) {
		age = sage;
		name = sname;
	}
	
	public Studentcc(Studentcc s1) {
		age = s1.age;
		name = s1.name;
	}
	
	public void display() {
		System.out.println("age: "+age);
		System.out.println("name: "+name);
	}
	
	public static void main(String[] args) {
		Studentcc s1 = new Studentcc(23,"ram");
		
		Studentcc s2 = new Studentcc(s1);
		
		s1.display();
		s2.display();
	}

}
