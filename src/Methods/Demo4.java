//method with parameters and no return type.

package Methods;

public class Demo4 {
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Demo4 d = new Demo4();
		d.add(10,20);
	}

}
