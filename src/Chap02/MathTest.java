package Chap02;

import java.util.Random;

public class MathTest {

	public static void main(String[] args) {
    	 int num = 7;
		 
//		System.out.println(num + "단");
		for (int i=1; i <= 50; i++) {
			
			Random rnum = new Random();
			
			int inum = rnum.nextInt(10)+1;
			System.out.println(inum);
			
		}
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("반지름: ");
//		double r = sc.nextDouble();
//		double length = 2 * Math.PI * r;
//		double area = Math.PI * r * r;
//		
//		System.out.println("반지름: " + r);
//		System.out.println("둘레: " + String.format("%5.2f", length));
//		System.out.println("넓이: " + String.format("%5.2f", area));
//		
//		sc.close();

	}

}
