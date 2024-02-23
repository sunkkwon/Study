package Chap18;

public class InputStreamEx {
	public static void main(String[] args) {
		int a = 0;
		try {
			System.out.print("Input:");
			a = System.in.read();
			while (a != 13) {		// 13은 엔터키이다.
				System.out.println(a + "==>" + (char) a);
				a = System.in.read();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
