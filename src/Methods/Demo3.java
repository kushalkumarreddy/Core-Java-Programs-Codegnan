//Add two integers
//method with parameters and a return type.

package Methods;

public class Demo3 {
	public int add(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Demo3 d = new Demo3();
		int sum = d.add(10,20);
		System.out.println(sum);
	}

}
