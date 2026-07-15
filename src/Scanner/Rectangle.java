package Scanner;
import java.util.Scanner;
public class Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Length: ");
		double length = sc.nextDouble();
		
		System.out.println("Width: ");
		double width = sc.nextDouble();
		
		double area = length*width;
		
		System.out.println("Area of Rectangle: "+area);
		
		sc.close();
		
	}

}
