package Chap15;

public class SingleThread {
	void print() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		SingleThread st = new SingleThread();
		st.print();
		st.print();
	}
}
