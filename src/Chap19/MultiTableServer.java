package Chap19;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiTableServer implements Runnable {
	private ServerSocket serverSocket;		// server listener
	private Socket socket;
	private DataInputStream dis;
	private DataOutputStream dos;

	public MultiTableServer() {
		// TODO Auto-generated constructor stub
		try {
			serverSocket = new ServerSocket(9999);
			System.out.println("Started......");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		while (true) {
			try {
				socket = serverSocket.accept(); // client 접속을 허가한다
				InetAddress ip = socket.getInetAddress();	// client ip 를 얻는다
				System.out.println("Client ip: " + ip);

				dis = new DataInputStream(socket.getInputStream()); // server 입장에서 client 로부터 입력
				dos = new DataOutputStream(socket.getOutputStream()); //

				Thread th = new Thread(this);
				th.start();			// run 메소드 실핼
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MultiTableServer();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (true) {
				int table = dis.readInt();	// client가 입력한 값
				StringBuffer sb = new StringBuffer();
				System.out.println("dan: "+ table);
				for (int i = 1; i <= 9; i++) {
					sb.append(table + "x" + i + " = " + table * i + "\r\n");
				}
				dos.writeUTF(sb.toString());
				System.out.println("Result: ");
				System.out.println(sb);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Client의 연결이 끊어 졌습니다.");
		}

	}

}
