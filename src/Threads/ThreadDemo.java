package Threads;

public class ThreadDemo implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Thread is running: "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		ThreadDemo tp = new ThreadDemo();
		
		Thread t1 = new Thread(tp,"t1 thread");
		t1.setPriority(t1.MIN_PRIORITY);
		
		Thread t2 = new Thread(tp,"t2 thread");
		t2.setPriority(t2.MAX_PRIORITY);
		
		Thread t3 = new Thread(tp,"t3 thread");
		t3.setPriority(t3.NORM_PRIORITY);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
	}

}
