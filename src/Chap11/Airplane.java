package Chap11;

public class Airplane implements Flyer {

	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("Airplane 이륙");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Airplane 비행");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Airplane 칙륙");
	}
}
