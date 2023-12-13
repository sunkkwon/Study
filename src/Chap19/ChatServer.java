package Chap19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	public static void main(String[] args) throws Exception {
		ServerSocket listener = null;
		try {
			listener = new ServerSocket(5555);
			System.out.println("Started....");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("error...");
			System.exit(1);
		}
		Socket clientSocket = null;
		try {
			clientSocket = listener.accept();
			System.out.println("client ip: " + clientSocket.getInetAddress().getHostAddress());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		// 서버에서 클라이언트로 출력용
		PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
		// 클라이언트에서 서버로 입력용
		BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

		String receive = "";
		String send = "Welcome";
		writer.println(send);

		Scanner sc = new Scanner(System.in);
		while (true) {
			// 한라인을 읽음
			receive = reader.readLine();
			if (receive == null || receive.equals("q")) {
				break;
			}
			System.out.println("[client]: " + receive);
			System.out.println("input(quit:q: ");
			// 서버에서 클라이언트로 보낼 메세지
			send = sc.nextLine();
			// 클라이언트로 전송
			writer.println(send);
			if (send.equals("q")) {
				break;
			}
		}
		sc.close();
		writer.close();
		reader.close();
		clientSocket.close();
		listener.close();
	}
}
