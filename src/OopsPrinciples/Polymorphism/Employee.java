package OopsPrinciples.Polymorphism;

public class Employee {
	
	void EmpSalary(int salary) {
		int sal = salary;
		System.out.println("Basic Salary: "+sal);
	}
	
	void EmpSalary(int salary, int bonus) {
		int sal = salary + bonus;
		System.out.println("Salary with Bonus: "+sal);
	}
	
	void EmpSalary(int salary, int bonus, int ot) {
		int sal = salary + bonus + ot;
		System.out.println("Salary with Bonus and Overtime: "+sal);
	}

}
