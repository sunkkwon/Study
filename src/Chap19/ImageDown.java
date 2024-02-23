package Chap19;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class ImageDown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// https://cdn.pixabay.com/photo/2020/10/21/18/07/laptop-5673901_1280.jpg
		String img = "https://cdn.pixabay.com/photo/2020/10/21/18/07/laptop-5673901_1280.jpg";
		String dir = "C:\\workspaces\\JavaStudy\\src\\Chap19\\";
		String filename = "comp.jpg";
		URL url = new URL(img);
		byte[] buffer = new byte[4096];

		InputStream in = url.openStream();
		OutputStream out = new FileOutputStream(dir + filename);
		int length = 0;

		while ((length = in.read(buffer)) != -1) {
			System.out.println(length);
			out.write(buffer, 0, length);
		}
		
		System.out.println("done");
		out.close();
	}

}
