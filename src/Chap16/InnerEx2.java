package Chap16;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerEx2 extends Frame {		// 최근에는 Frame -> JFrame 를 쓴다.
	public InnerEx2() {
		// TODO Auto-generated constructor stub
		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		InnerEx2 e1 = new InnerEx2();
		e1.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
	}
}
