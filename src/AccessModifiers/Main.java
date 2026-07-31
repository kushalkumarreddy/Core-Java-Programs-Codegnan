package AccessModifiers;

public class Main {
	public static void main(String[] args) {
		Demo d = new Demo();
		
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
//		System.out.println(s.d);  //d is in protected so can't use
	}

}
