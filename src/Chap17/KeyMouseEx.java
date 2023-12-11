package Chap17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class KeyMouseEx extends JFrame implements KeyListener, MouseListener, MouseMotionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x, y;
	private int width, height;
	private Image img;

	public KeyMouseEx() {
		// TODO Auto-generated constructor stub
		addKeyListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);

		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("20231104.jpg"));

		setFocusable(true);
		requestFocus();
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		width = img.getWidth(this);
		height = img.getHeight(this);

		g.drawImage(img, x, y, this);

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
		repaint();

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP:
			y = Math.max(50, y-5);
			break;
			case KeyEvent.VK_DOWN:
			y = Math.min(480 - height, y + 5);
			break;
		case KeyEvent.VK_LEFT:
			x = Math.max(20,  x-5);
			break;
		case KeyEvent.VK_RIGHT:
			x = Math.min(480 - width,  x+5);
			break;
		}
		repaint();
		}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		new KeyMouseEx();
	}

}
