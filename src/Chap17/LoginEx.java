package Chap17;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class LoginEx extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField pwd;
	private JLabel lblResult;
	private JTextField userid;
	Map<String, String> map;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginEx frame = new LoginEx();
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
	public LoginEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		userid = new JTextField();
		userid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwd.requestFocus();
			}
		});
		userid.setBounds(78, 54, 183, 21);
		contentPane.add(userid);
		userid.setColumns(10);

		map = new HashMap<>();
		map.put("kim", "1234");
		map.put("park", "2222");
		map.put("hong", "3333");
		map.put("kwon", "qwer");

		JButton btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = userid.getText();
				String pw = String.valueOf(pwd.getPassword());

				if (map.get(id) == null) {
					lblResult.setForeground(Color.RED); // 글자색 변경
					lblResult.setText("ID is incorrect.");
				} else {
					if (map.get(id).equals(pw)) {
						lblResult.setForeground(Color.BLUE);
						lblResult.setText("Welcome " + id);
					} else {
						lblResult.setForeground(Color.RED);
						lblResult.setText("ID or Password is incorrect.");
					}
				}
			}
		});
		btnLogin.setBounds(78, 143, 93, 23);
		contentPane.add(btnLogin);

		lblResult = new JLabel("");
		lblResult.setFont(new Font("굴림", Font.PLAIN, 20));
		lblResult.setBounds(78, 200, 289, 33);
		contentPane.add(lblResult);

		pwd = new JPasswordField();
		pwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLogin.requestFocus();
			}
		});
		pwd.setBounds(79, 85, 182, 21);
		contentPane.add(pwd);

		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(18, 57, 50, 15);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(18, 88, 50, 15);
		contentPane.add(lblNewLabel_1);
		
		btnExit = new JButton("종료");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(168, 143, 93, 23);
		contentPane.add(btnExit);
	}
}
