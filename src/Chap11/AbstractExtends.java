package Chap11;

public class AbstractExtends extends AbstractClass {

	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("추상 method를 완성한 method");
	}

	public static void main(String[] args) {
		AbstractExtends ex = new AbstractExtends();
		ex.method1();
		ex.method2();
	}

}
