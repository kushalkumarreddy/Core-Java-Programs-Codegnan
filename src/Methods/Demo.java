//methods with no parameters and no return type.

package Methods;

public class Demo {
	public void display() {
		System.out.println("Welcome Codegnan");
		return;
	}
	public static void display1() {
		System.out.println("All the Best");
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		display1();
		d.display();
		display1();
	}

}
