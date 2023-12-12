package Chap18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWrite {
	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:\\workspaces\\JavaStudy\\src\\Chap18\\FileWrite.txt");
			System.out.println("Input: ");
			while (true) {
				int ch = System.in.read();
				System.out.println(ch + "==>" + (char) ch);
				if (ch == 13)
					break;
				os.write(ch);;
			}
			System.out.println("Done");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
