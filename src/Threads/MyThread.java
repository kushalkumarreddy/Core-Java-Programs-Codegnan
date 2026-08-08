package Threads;

public class MyThread extends Thread {
	
	public void run() {
		System.out.println("Thread is Running");
	}
	
	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		
		Thread t1 = new Thread(m1);
		
		System.out.println(t1.getState());
		System.out.println("Thread Creation");
		t1.start();
		System.out.println("Runnable state is ready for Execution");
		
		try {
			t1.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Program completed");
		
	}

}
