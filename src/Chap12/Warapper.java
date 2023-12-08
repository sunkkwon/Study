package Chap12;

public class Warapper {
	public static void main(String[] args) {
		Integer i1 = 10;
		int num1 = i1.intValue();
		int num2 = 20;
		int sum = num1 + num2;
		Double dnum1 = 11.5;
		double dnum2 = 3.5;
		double dnum3 = dnum1 / dnum2;
		
		System.out.println(sum);
		System.out.println(Integer.toBinaryString(sum));
		System.out.println(Integer.parseInt("100"));
		System.out.println(Integer.toString(100));
		System.out.println(100 + "");
		
		System.out.println("Double ===========================================");
		System.out.println(dnum3);
		String str = "11.5";
		System.out.println(str + 200);
		System.out.println(Double.parseDouble(str) + 200);
	}
}
