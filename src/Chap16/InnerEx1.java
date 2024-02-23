package Chap16;

public class InnerEx1 {
//	static int x = 10;
	private int x = 10;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	class Inner {		// 컴파일시에 InnerEx1$Inner.class 로 컴파일 된다
		int getX() {
			return x;
		}
	}

	public static void main(String[] args) {
//	    InnerEx1 e1 = new InnerEx1();
		InnerEx1 e = new InnerEx1();
		System.out.println("Outer: " + e.getX());

		InnerEx1.Inner in = e.new Inner();
		System.out.println("Inner: " + in.getX());
	}
}
