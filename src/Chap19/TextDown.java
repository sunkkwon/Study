package Chap19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class TextDown {
	public static void main(String[] args) {
		URL url = null;

		try {		// 잘안됨
//			url = new URL("https://raw.githubusercontent.com/selva86/datasets/master/ozone.csv");
//			https://cdn.pixabay.com/photo/2020/10/21/18/07/laptop-5673901_1280.jpg
			url = new URL("https://raw.githubusercontent.com/selva86/datasets/master/ozone.csv");
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
			if (conn != null) {
				conn.setConnectTimeout(3000);
				if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
					BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
					BufferedWriter bw = new BufferedWriter(
							new FileWriter(new File("C:\\workspaces\\JavaStudy\\src\\Chap19\\ozone.csv")));

					while (true) {
						String line = br.readLine();
						if (line == null)
							break;
						bw.write(line + "\r\n");
					}
					br.close();
					bw.close();
					System.out.println("Done");
				}
				conn.disconnect();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
