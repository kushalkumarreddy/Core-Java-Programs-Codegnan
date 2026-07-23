package OopsPrinciples.Encapsulation;

public class Car {
	private String Model;
	private int Year;
	
	public String getmodel() {
		return Model;
	}
	
	public void setmodel(String Model) {
		this.Model=Model;
	}
	
	
	public int getyear() {
		return Year;
	}
	
	public void setyear(int Year) {
		this.Year = Year;
	}

}
