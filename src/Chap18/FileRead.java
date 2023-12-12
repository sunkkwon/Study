package Chap18;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;

public class FileRead extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFile;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileRead frame = new FileRead();
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
	public FileRead() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textFile = new JTextField();
		textFile.setBounds(10, 34, 423, 21);
		contentPane.add(textFile);
		textFile.setColumns(10);

		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String file = textFile.getText();	// text field 값 가져오기
				String str = "";
				BufferedReader reader = null;	// 1글자씩 가져오기

				try {
					reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
					// FileInputStream(file)  파일내용 읽기
					// InputStreamReader() 바이트 단위 읽기
					// BufferedReader()  글자단위 읽기
					ta.setText("");
					while ((str = reader.readLine()) != null) {
						ta.append(str + "\n");
					}
				} catch (Exception e2) {
					// TODO: handle exception
				} finally {	// 실패, 성공  모두 실행 됨
					try {
						if (reader != null)
							reader.close();
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}
			}
		});
		btnOK.setBounds(443, 33, 93, 23);
		contentPane.add(btnOK);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 70, 526, 315);
		contentPane.add(scrollPane);
		
		ta = new JTextArea();
		scrollPane.setViewportView(ta);
	}
}
