package OopsPrinciples.Encapsulation;

public class Customer {
	
	private int cid;
	private String cname;
	private double bal;
	private int Withdrawamt;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		if(cid>0) {
			this.cid = cid;
		} else {
			System.out.println("Invalid user id");
		}
	}
	
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	
	
	public int getWithdrawamt() {
		return Withdrawamt;
	}
	public void setWithdrawamt(int withdrawamt) {
		if(bal>=withdrawamt) {
		Withdrawamt = withdrawamt;
		} else { 
			System.out.println("Low Balance");
			System.out.println("Available Balance: "+bal);
		}
	}
	
}
