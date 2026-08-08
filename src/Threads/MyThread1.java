package Threads;

public class MyThread1 implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Running");
	}
	
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		
		Runnable r1 = new Thread(t1);
		((Thread)r1).start();
		
	}

}
