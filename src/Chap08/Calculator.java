package Chap08;

public class Calculator {
	private int left;
	private int right;
	
	public Calculator() {
	}
	
	public Calculator(int left, int right) {
//		super();
		this.left = left;
		this.right = right;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}
	
	public void sum() {
		System.out.println(left + right);
	}
	
	public void avg() {
		double avg;
		
		avg = (left + right) / 2;
		System.out.println(avg);
	}
}
