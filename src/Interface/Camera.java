package Interface;

public interface Camera {
	
	int a = 15;
	
	void click();
	
	static void m1() {
		System.out.println("It is a static method in camera interface");
	}
	
	default void m2(){
		System.out.println("It is a default method in camera interface");
	}
	
	

}
