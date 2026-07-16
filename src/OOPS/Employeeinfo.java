package OOPS;

public class Employeeinfo {
	static String Cname = "ABC Technologies";
	
	int empid;
	String ename;
	double salary;
	
	static {
		System.out.println("Company Information Loaded\n");
	}
	
	{
		System.out.println("Employee Onject Created");
	}
	
	public static void main(String[] args) {
		Employeeinfo e1 = new Employeeinfo();
		e1.empid = 101;
		e1.ename = "Rahul";
		e1.salary = 45000;
		
		Employeeinfo e2 = new Employeeinfo();
		e2.empid = 102;
		e2.ename = "Sneha";
		e2.salary = 52000;
		
		Employeeinfo e3= new Employeeinfo();
		e3.empid = 103;
		e3.ename = "Arjun";
		e3.salary = 60000;
		
		
		System.out.println("\nCompany : "+Cname);
		
		System.out.println("\nEmployee 1\nID : "+e1.empid+"\nName : "+e1.ename+"\nSalary : "+e1.salary);
		System.out.println("\nEmployee 1\nID : "+e2.empid+"\nName : "+e2.ename+"\nSalary : "+e2.salary);
		System.out.println("\nEmployee 1\nID : "+e3.empid+"\nName : "+e3.ename+"\nSalary : "+e3.salary);
		
	}

}
