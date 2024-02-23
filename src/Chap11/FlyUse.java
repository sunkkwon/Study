package Chap11;

public class FlyUse {
	public static void main(String[] args) {
		
		Drone d = new Drone();
		d.takeoff();
		d.fly();
		d.land();
		
		Flyer f = new Drone();
		
		f.takeoff();
		f.fly();
		f.land();
		
		
		f = new Airplane();
		f.takeoff();
		f.fly();
		f.land();
	}
}
