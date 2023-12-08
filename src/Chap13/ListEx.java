package Chap13;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();		// 기본 array size 는 10개 이다.
//		List<Object> list = new ArrayList<Object>();	// 기준코딩

		list.add("one");
		list.add(2);
		list.add(5.5);
		list.add(false);
		list.add(3, 4);
		list.remove(0);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}

	}
}
