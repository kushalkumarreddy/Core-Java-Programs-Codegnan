package OopsPrinciples.Polymorphism;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e = new Employee();
		
		e.EmpSalary(500000);
		e.EmpSalary(500000, 200000);
		e.EmpSalary(500000, 200000, 10000);
	}

}