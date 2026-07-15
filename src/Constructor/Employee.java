package Constructor;

public class Employee {
	int empid;
	String ename;
	String edept;
	int esalary;
	
	public Employee(int id,String name,String dept, int sal) {
		empid = id;
		ename = name;
		edept = dept;
		esalary = sal;		
	}
	
	public void display() {
		System.out.println("Employee Id: "+empid);
		System.out.println("Name: "+ename);
		System.out.println("Department: "+edept);
		System.out.println("Salary: "+esalary+"\n");
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee(101,"Ravi","HR",35000);
		emp.display();
		Employee emp2 = new Employee(102,"Priya","Developer",55000);
		emp2.display();
		Employee emp3 = new Employee (103,"Kiran","Testing",42000);
		emp3.display();
	}

}
