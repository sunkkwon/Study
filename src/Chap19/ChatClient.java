package Chap19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket socket = null;
		PrintWriter writer = null;
		BufferedReader reader = null;

		try {
			socket = new Socket("localhost", 5555);
			writer = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		String receive = null;
		String send;
		Scanner sc = new Scanner(System.in);

		while (true) {
			receive = reader.readLine();
			System.out.println("[server]: " + receive);
			if (receive.equals("q")) {
				break;
			}
			System.out.println("input(quit:q): ");
			// 키보드 입력
			send = sc.nextLine();
			if (send.equals("q")) {
				break;
			}
			if (send != null) {
				// 서버로 전송
				writer.println(send);
			}
		}
		sc.close();
		writer.close();
		reader.close();
		socket.close();
	}

}
