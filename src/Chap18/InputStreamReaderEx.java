package Chap18;

import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderEx {
	public static void main(String[] args) {
		int var = 0;
		Reader input = new InputStreamReader(System.in);
		System.out.println("Input:");
		try {
			while (true) {
				var = input.read();
				if (var == 13) {
					break;
				}
				System.out.println(var + "==>" + (char) var);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
