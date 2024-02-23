package Chap15;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;

class MyFrame extends JFrame implements Runnable {
	// Runnable multi thread 지원하는 interface, run 추상함수를 완성해야한다.
	private int x, y = 50;
	private int moveX = 2, moveY = 3;
	private Graphics bg;		// 그래픽처리위한, 선, 사각형, 타원 그릴때
	private Image offScreen; 
	private Dimension dim;		// 사이즈 지정,  화면의 가로 세로

	public MyFrame() {		// 생성자는 return  type 없음
		setSize(500, 500);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		dim = getSize();
		offScreen = createImage(dim.width, dim.height);
		bg = offScreen.getGraphics();

		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void update(Graphics g) {
		// TODO Auto-generated method stub
		// 화면출력 준비 작업
//		super.update(g);
		bg.setColor(Color.yellow);
		bg.fillRect(0, 0, getWidth(), getHeight());
		bg.setColor(Color.green);
		bg.fillOval(x, y, 30, 30);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawImage(offScreen, 0, 0, this);
		update(g);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			if (x > (dim.width - 30) || x < 0) {
				moveX = -moveX;
			}

			x = x + moveX;

			if (y > (dim.height - 30) || y < 30) {
				moveY = -moveY;
			}
			y = y + moveY;
			repaint();

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Ball {
	public static void main(String[] args) {
		new MyFrame();
	}
}