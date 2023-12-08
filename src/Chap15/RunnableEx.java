package Chap15;

public class RunnableEx implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "==>" + i);
		}
	}
	
	public static void main(String[] args) {
		RunnableEx e1 = new RunnableEx();
		
		Thread t1 = new Thread(e1, "Thread 1");
		Thread t2 = new Thread(e1, "Thread 2");
		t1.start();
		t2.start();
	}
}
