package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class METRO_TICKET_BOOKING {

	protected static final JLabel CB2 = null;
	private JFrame frame;
	private JTextField TB1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					METRO_TICKET_BOOKING window = new METRO_TICKET_BOOKING();
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
	public METRO_TICKET_BOOKING() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 490, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 454, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("FROM");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(36, 157, 60, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TO");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(36, 225, 60, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TICKETS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(36, 288, 60, 23);
		frame.getContentPane().add(lblNewLabel_4);
		
		TB1 = new JTextField();
		TB1.setBounds(176, 96, 218, 20);
		frame.getContentPane().add(TB1);
		TB1.setColumns(10);
		
		JComboBox CB = new JComboBox();
		CB.setModel(new DefaultComboBoxModel(new String[] {"select", "hyd", "ts", "ap", "mp"}));
		CB.setBounds(176, 159, 218, 22);
		frame.getContentPane().add(CB);
		
		JComboBox CB1 = new JComboBox();
		CB1.setModel(new DefaultComboBoxModel(new String[] {"select", "hyd", "ap", "ts", "mp"}));
		CB1.setBounds(176, 227, 218, 22);
		frame.getContentPane().add(CB1);
		JComboBox CB2 = new JComboBox();
		CB2.setBounds(176, 290, 218, 22);
		frame.getContentPane().add(CB2);
		
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pn=TB1.getText();
				String fr=(String) CB.getSelectedItem();
				String to=(String) CB1.getSelectedItem();
				String tickets=(String) CB2.getSelectedItem();
		        int t=Integer.parseInt(tickets);
		        int bill=t*40;
		        JOptionPane.showMessageDialog(btnNewButton, "HELLO"+pn+"\n FROM:"+fr+"\n TO:"+to+"\n TICKETS:"+tickets+"\n BILL:"+bill);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(176, 369, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
	}
}
