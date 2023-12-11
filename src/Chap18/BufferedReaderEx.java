package Chap18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderEx {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input");
		try {
			String str = br.readLine();	// 한 라인 읽기
			System.out.println(str);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
