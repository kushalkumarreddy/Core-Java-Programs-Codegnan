package OopsPrinciples.Encapsulation;

public class Employee {
	private int empid;
	private String empname;
	
	
	public int getEmpId() {
		return empid;
	}
	
	public String getEmpName() {
		return empname;
	}
	
	
	public void setEmpId(int empid) {
		if(empid>0) {
			this.empid = empid;
		} else {
			System.out.println("Invalid user id");
		}
	}
	
	public void setEmpName(String empname) {
		this.empname = empname;
	}

}
