package Chap12;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();		// random seed
		
		System.out.println(r.nextDouble());	// 실수
		System.out.println(r.nextInt());	// 정수
		System.out.println(r.nextInt(100));	// 0~99
		System.out.println(r.nextInt(101) + 100);	// 100~999
		System.out.println(Math.random());	// 0.0~1.0
		
		int num = (int) (Math.random() * 100);
		System.out.println(num);
	}

}
