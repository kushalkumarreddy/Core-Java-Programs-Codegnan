package EmployeeCRUD;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCRUD {
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(101,"kushal",300000,"IT"));
		emp.add(new Employee(456,"arjun",200000,"CSE"));
		emp.add(new Employee(222,"karthik",250000,"Finance"));
		
		System.out.println("Created Employee data list\n");
		System.out.println("Read Employee Details\n");	
		
		
		for(Employee e : emp) {
			System.out.println(e);
		}
		
		System.out.println("\nUpdated\n");
		for(Employee e : emp) {
			if(e.id == 101) {
				e.salary = 350000;
				e.dept = "HR";
			}
		}
		
		for(Employee e : emp) {
			System.out.println(e);
		}
		
		System.out.println("\nDeleted Employee id 456\n");
		
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).id == 456) {
				emp.remove(i);
				break;
			}
		}
		
		for(Employee e : emp) {
			System.out.println(e);
		}
		
	}

}
