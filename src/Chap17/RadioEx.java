package Chap17;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class RadioEx extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioEx frame = new RadioEx();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RadioEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JRadioButton rdbtnRed = new JRadioButton("Red");
		rdbtnRed.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.RED);
			}
		});
		buttonGroup.add(rdbtnRed);
		contentPane.add(rdbtnRed);

		JRadioButton rdbtnGreen = new JRadioButton("Green");
		rdbtnGreen.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.GREEN);
			}
		});
		buttonGroup.add(rdbtnGreen);
		contentPane.add(rdbtnGreen);

		JRadioButton rdbtnBlue = new JRadioButton("Blue");
		rdbtnBlue.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.BLUE);
			}
		});
		buttonGroup.add(rdbtnBlue);
		contentPane.add(rdbtnBlue);
	}

}
