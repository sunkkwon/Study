package Chap11;

public class Drone implements Flyer {
	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("Drone 이륙");
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Drone 비행");
	}
	
	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Drone 착륙");
	}
}
