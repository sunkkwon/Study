package Chap14;

public class ThrowsEx {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
