package Chap13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEx {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();	// map은 키와 데이터의 자료형을 써야 한다
		map.put("apple", "사과");
		System.out.println(map.get("apple"));
		
		map.put("grape", "포도");
		map.put("peach", "배");
		System.out.println(map);
		
		String input = "grape";
		String val;
		val = map.get(input);
		
//		System.out.println(input + " ===> " + val);
		System.out.println(input + "===>" + map.get(input));
		
		System.out.println(input + "=keys==>" + map.keySet());
		System.out.println(input + "=values==>" + map.values());
//		System.out.println(input + "=iter==>" + map.keySet().iterator());
		

		Iterator<String> iter = map.keySet().iterator();	// 반복처리시
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.print("key=" + key);
			System.out.println(", value=" + map.get(key));
			
//			System.out.println("key1=" + iter.next() + ", value= " + map.get(iter.next()));
		}
	}
}
