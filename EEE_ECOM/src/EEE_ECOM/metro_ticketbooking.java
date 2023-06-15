package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metro_ticketbooking {

	protected static final JLabel TB1 = null;
	private JFrame frame;
	private JTextField TB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metro_ticketbooking window = new metro_ticketbooking();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public metro_ticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 774, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(152, 11, 420, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(50, 112, 63, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("FROM");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(50, 169, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TO");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(50, 227, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TICKETS");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(50, 283, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox CB = new JComboBox();
		CB.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "TARNAKA", "UPPAL", "BEGUMPET"}));
		CB.setBounds(152, 166, 194, 22);
		frame.getContentPane().add(CB);
		
		JComboBox CB1 = new JComboBox();
		CB1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "TARNAKA", "UPPAL", "BEGUMPET"}));
		CB1.setBounds(152, 224, 194, 22);
		frame.getContentPane().add(CB1);
		
		JComboBox CB2 = new JComboBox();
		CB2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6"}));
		CB2.setBounds(152, 280, 194, 22);
		frame.getContentPane().add(CB2);
		
		TB = new JTextField();
		TB.setBounds(155, 90, 527, 40);
		frame.getContentPane().add(TB);
		TB.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pn=TB1.getText();
				String fr=(String) CB1.getSelectedItem();
				String to=(String) CB2.getSelectedItem();
				String tickets=(String) CB3.getSelectedItem();
				int t=Integer.parseInt(tickets);
				int bill=t*40;
				JOptionPane.showMessageDialog(btnNewButton, "HELLO"+pn+\n FROM:"\N TICKETS:")
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(483, 334, 131, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
