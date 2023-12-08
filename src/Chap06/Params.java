package Chap06;

public class Params {

	static double plus(int a, int b) {
		return a + b;
	}
	
	static double minus(int a, int b) {
		return a - b;
	}
	
	static double multi(int a, int b) {
		return a * b;
	}
	
	static double divide(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		double i = plus(10,20);
		System.out.println("plus: " + i);

		i = minus(10,20);
		System.out.println("minus: " + i);

		i = multi(10,20);
		System.out.println("multi: " + i);

		i = divide(10,5);
		System.out.println("divide: " + i);

	}
}
