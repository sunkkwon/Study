package Chap15;

public class ThreadEx1 extends Thread {
	public ThreadEx1(String name) {
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i <= 9; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

	public static void main(String[] args) {
		ThreadEx1 e1 = new ThreadEx1("thread 1");
		ThreadEx1 e2 = new ThreadEx1("thread 2");
		ThreadEx1 e3 = new ThreadEx1("thread 3");

		e1.start();
		e2.start();
		e3.start();
	}
}
