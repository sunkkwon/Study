package Chap18;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DirectoryEx extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfDirectory;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DirectoryEx frame = new DirectoryEx();
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
	public DirectoryEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		tfDirectory = new JTextField();
		tfDirectory.setBounds(23, 42, 189, 21);
		contentPane.add(tfDirectory);
		tfDirectory.setColumns(10);

		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String directory = tfDirectory.getText();
				File file = new File(directory);
				String[] list = file.list();
				ta.setText("");
				for (int i = 0; i < list.length; i++) {
					File f = new File(directory, list[i]);
					String str = f.isDirectory() ? "Directory" : "File";
					ta.append(str + ":" + list[i] + "\n");

				}
			}
		});
		btnOK.setBounds(222, 41, 93, 23);
		contentPane.add(btnOK);

		ta = new JTextArea();
		ta.setBounds(23, 78, 293, 164);
		contentPane.add(ta);
	}
}
