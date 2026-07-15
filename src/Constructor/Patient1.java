package Constructor;

public class Patient1 {
	int pid;
	String name;
	String disease;
	float bill;
	
	public Patient1(int pid) {
		this.pid=pid;
		System.out.println("Patient Registration Started\nPatient id: "+pid);
	}
	
	public Patient1(int pid,String name) {
		this(pid);
		this.name=name;
		System.out.println("Patient name: "+name);
	}
	
	public Patient1(int pid, String name,String disease) {
		this(pid,name);
		this.disease = disease;
		System.out.println("Disease: "+disease);
	}
	
	public Patient1(int pid,String name,String disease,float bill) {
		this(pid,name,disease);
		this.bill = bill;
		System.out.println("Bill Amount: "+bill);
	}
	
	public static void main(String[] args) {
		Patient1 p1 = new Patient1(101, "Rahul","Fever",2500);
	}

}
