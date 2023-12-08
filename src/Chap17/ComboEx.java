package Chap17;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class ComboEx extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textTa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboEx frame = new ComboEx();
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
	public ComboEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JComboBox comboTable = new JComboBox();
		comboTable.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					textTa.setText("");
					int table = comboTable.getSelectedIndex() + 2;
//					textTa.append(String.format("%2d\n", comboTable.getSelectedIndex()));
					for (int i = 0; i <= 9; i++) {
						textTa.append(String.format("%2d x %2d = %2d\n", table, i, table * i));
					}
				}
			}
		});
		comboTable.setModel(new DefaultComboBoxModel(new String[] { "2단", "3단", "4단", "5단", "6단", "7단", "8단", "9단" }));
		contentPane.add(comboTable, BorderLayout.NORTH);

		textTa = new JTextArea();
		contentPane.add(textTa, BorderLayout.CENTER);
	}

}
