package EmployeeCRUD;

public class Employee {
	int id;
	String name;
	int salary;
	String dept;
	
	public Employee(int id, String name, int salary, String dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "[id: "+id+" name: "+name+" salary: "+salary+" Department: "+dept+"]";
	}

}