package Chap18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		String str = "";
		BufferedReader reader = null;
		BufferedWriter writer = null;
		String file1 = "C:\\workspaces\\JavaStudy\\src\\Chap18\\test.txt";
		String file2 = "C:\\workspaces\\JavaStudy\\src\\Chap18\\test1.txt";

		try {
			reader = new BufferedReader(new FileReader(new File(file1)));		// 버퍼에 있다.
			writer = new BufferedWriter(new FileWriter(new File(file2)));
			while (true) {
				str = reader.readLine();  // 한 라인씩 읽기
				if (str == null)
					break;
				writer.write(str + "\r\n");
			}
			System.out.println("Done");

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block 
				e.printStackTrace();
			}
		}
	}
}
