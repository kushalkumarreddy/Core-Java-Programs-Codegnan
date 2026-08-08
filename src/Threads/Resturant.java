package Threads;

public class Resturant extends Thread{
	
	public void run() {
		System.out.println("Prearing item");
	}
	
	public static void main(String[] args) {
		Resturant r = new Resturant();
		Thread t = new Thread(r);
		
		System.out.println(t.getState());
		System.out.println("Order Taken");
		
		t.start();
		System.out.println("Order is ready to prepare");
		
		try {
			t.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Order is ready");
	}

}
