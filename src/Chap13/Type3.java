package Chap13;

public class Type3<T> {		// 정의하는 시점에는 자료형이 미정이다
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	 
	public static void main(String[] args) {
		Type3<String> t = new Type3<String>();
		t.setT("100가나");
		System.out.println(t.getT());
		
		Type3<Integer> t2 = new Type3<Integer>();
		t2.setT(200);
		System.out.println(t2.getT());
	}
}
