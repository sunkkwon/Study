package Chap14;

public class ExceptionEx2 {
	public static void main(String[] args) {
		int a = 10, b = 0, c;

		try {
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
