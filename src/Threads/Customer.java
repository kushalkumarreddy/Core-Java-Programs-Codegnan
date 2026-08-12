package Threads;

public class Customer implements Runnable {
	  Account ac;
	  Customer(Account ac){
		   this.ac=ac;
	  }
		@Override
		public void run() {
			try {
				ac.withDraw(1100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
