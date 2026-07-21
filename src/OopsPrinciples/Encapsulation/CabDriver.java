package OopsPrinciples.Encapsulation;

public class CabDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.setEmpId(101);
		e1.setEmpName("Ram");
		
		System.out.println("Empid: "+e1.getEmpId()+"\nEmployee name: "+e1.getEmpName());
	}

}
