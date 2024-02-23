package Chap14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
	public static void main(String[] args) {
		int num = 50;
		Scanner sc = null;
//		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Number: ");
//			sc = new Scanner(System.in);
			int value = sc.nextInt();
			System.out.println(num / value);

		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("NullPointerException");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("ArithmeticException");
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("InputMismatchException");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Other Exception");
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		System.out.println("End");
	}
}
