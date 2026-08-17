package comparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDemo {
	public static void main(String[] args) {
		List<Student> slist = new ArrayList<>();
		
		Student s1=new Student(101,"ram",45);		
		slist.add(s1);
		
		slist.add(new Student(117,"teja",23));
		slist.add(new Student(113,"keerthi",24));
		System.out.println(slist); //prints reference
		
		for(Student s : slist) {
			System.out.println(s);
		}
		
		Collections.sort(slist);
		System.out.println(slist);
		
	}

}
