package Chap13;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
	public static void main(String[] args) {
//		Set<String> hs = new HashSet<>();
		Set<String> hs = new TreeSet<>();
//		Set<String> hs = new HashSet<String>();  // 우측 생략가능
		// 좌우의 자료형이 다르면 좌는 상위 자료형이다. 다형성
		// HashSet 과 TreeSet 의 차이는 TreeSet이 정렬이 되었다

		hs.add("apple");
		hs.add("peach");
		hs.add("melon");
		hs.add("grape");
		hs.add("melon");

		System.out.println(hs);

		Iterator<String> iter = hs.iterator();
		System.out.println("=== for i++ ===");
		for (int i = 0; i < hs.size(); i++) {
			System.out.println(iter.next());
		}

		System.out.println("== while ==");
		iter = hs.iterator(); // 반복 처음으로 reset
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		System.out.println("== for simple ");
		for (String str : hs) {
			System.out.println(str);
		}
	}
}
