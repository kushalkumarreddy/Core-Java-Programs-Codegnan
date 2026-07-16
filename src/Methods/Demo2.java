//Random number generator
//method with no parameters and a return type.

package Methods;


public class Demo2 {
	public int generateNumber() {
		return 100;
	}
	
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		int num = d.generateNumber();
		System.out.println(num);
	}

}
