package Chap17;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MessageEx extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MessageEx frame = new MessageEx();
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
	public MessageEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JButton btnMessage = new JButton("Message");
		btnMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MessageEx.this, "Message");
			}
		});
		contentPane.add(btnMessage);

		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(MessageEx.this, "Do you want to exit?", "EXIT",
						JOptionPane.YES_OPTION);

				if (result == JOptionPane.YES_OPTION) {
					System.exit(result);
				}
			}
		});
		contentPane.add(btnConfirm);

		JButton btnInput = new JButton("Input");
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog(MessageEx.this, "Input name");
				JOptionPane.showMessageDialog(MessageEx.this, "Welcome " + name);
			}
		});
		contentPane.add(btnInput);

		JButton btnOption = new JButton("Option");
		btnOption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] str = { "ADD", "UPDATE", "DELETE" };		// Yes No Cancel 버튼의 이름을 바꾸기 위해
				JOptionPane.showOptionDialog(MessageEx.this, "SELECT MENU", "OPTION", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.INFORMATION_MESSAGE, null, str, str[0]);
			}
		});
		contentPane.add(btnOption);
	}

}
