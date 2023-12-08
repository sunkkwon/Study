package Chap16;

public class FlyerUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyer f = new Flyer() {	// 자료형만 있고 이름이 없으면 익명클래스 이다

			@Override
			public void takeOff() {
				// TODO Auto-generated method stub
				System.out.println("take off");
			}

			@Override
			public void land() {
				// TODO Auto-generated method stub
				System.out.println("land");
			}

			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println("fly");
			}
		};
		
		f.takeOff();
		f.fly();
		f.land();
	}

}
