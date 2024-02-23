package Chap19;

import java.awt.EventQueue;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class MultiTableClient extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea taResult;

	private Socket socket;
	private DataInputStream dis;
	private DataOutputStream dos;
	private JComboBox<String> cboTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultiTableClient frame = new MultiTableClient();
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
	public MultiTableClient() {

		try {
			socket = new Socket("localhost", 9999);
//			socket = new Socket("192.168.0.5", 9999);  // 서버쪽 ip이다.
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 296);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		String dan[] = { "2단", "3단", "4단", "5단", "6단", "7단", "8단", "9단" };

		taResult = new JTextArea();
		taResult.setBounds(10, 43, 289, 212);
		contentPane.add(taResult);

		cboTable = new JComboBox<String>(dan);
		cboTable.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					int table = cboTable.getSelectedIndex() + 2;
					try {
						dos.writeInt(table);	// 서버로 단을 전송한다
						taResult.setText(dis.readUTF());	// 서버에서 수신한 결과를 set 한다.
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				}

			}
		});
		cboTable.setBounds(10, 10, 284, 23);
		contentPane.add(cboTable);
	}
}
