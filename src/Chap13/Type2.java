package Chap13;

public class Type2 {
	Object value; // 처리비용이 비싸다.

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public static void main(String[] args) {
		Type2 t = new Type2();
		t.setValue("kim");

		System.out.println(t.getValue());

		t.setValue(100);
		System.out.println(t.getValue());

		t.setValue(100.5);
		System.out.println(t.getValue());
	}
}
