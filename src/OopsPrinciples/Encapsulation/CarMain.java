package OopsPrinciples.Encapsulation;

import java.util.Scanner;

public class CarMain {
	public static void main(String[] args) {
		Car c = new Car();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter car model: ");
		String model = sc.nextLine();
		System.out.println("Enter car year: ");
		int year = sc.nextInt();
		
		c.setmodel(model);
		c.setyear(year);
		
		System.out.println("Model: "+c.getmodel());
		System.out.println("Year: "+c.getyear());
		
		sc.close();
	}

}