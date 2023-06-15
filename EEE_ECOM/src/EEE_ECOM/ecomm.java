package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecomm {

	private JFrame frame;
    int i=0;
    int b=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecomm window = new ecomm();
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
	public ecomm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\12.PNG"));
		lblNewLabel_1.setBounds(28, 55, 131, 191);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\13.PNG"));
		lblNewLabel_2.setBounds(192, 55, 135, 191);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\14.PNG"));
		lblNewLabel_3.setBounds(354, 55, 152, 192);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("rs-299");
		lblNewLabel_4.setForeground(Color.GRAY);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(28, 257, 136, 36);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("rs-399");
		lblNewLabel_5.setForeground(Color.GRAY);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5.setBounds(192, 257, 135, 41);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("rs-599");
		lblNewLabel_6.setForeground(Color.GRAY);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(364, 258, 142, 36);
		frame.getContentPane().add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Pdf", "kindle", "book"}));
		comboBox.setBounds(28, 304, 131, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Pdf", "kindle", "book"}));
		comboBox_1.setBounds(192, 304, 135, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Pdf", "kindle", "book"}));
		comboBox_2.setBounds(354, 305, 152, 22);
		frame.getContentPane().add(comboBox_2);
		
		JLabel LB = new JLabel("CART :0");
		LB.setForeground(new Color(255, 0, 128));
		LB.setFont(new Font("Tahoma", Font.BOLD, 18));
		LB.setBounds(387, 0, 79, 33);
		frame.getContentPane().add(LB);
		JLabel LB2 = new JLabel("total price=0");
		LB2.setFont(new Font("Tahoma", Font.BOLD, 18));
		LB2.setBounds(205, 386, 135, 37);
		frame.getContentPane().add(LB2);
		
		JButton btnNewButton = new JButton("add to cart");
		btnNewButton.setForeground(new Color(255, 128, 0));
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i++;
				LB.setText("cart :"+i);
				b=b+299;
				LB2.setText("bill"+b);
			}
		});
		btnNewButton.setBounds(30, 352, 129, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("add to cart");
		btnNewButton_1.setForeground(new Color(255, 128, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i++;
				LB.setText("cart :"+i);
				b=b+399;
				LB2.setText("bill"+b);
			}
		});
		btnNewButton_1.setBounds(192, 352, 135, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("add to cart");
		btnNewButton_2.setForeground(new Color(255, 128, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				LB.setText("cart :"+i);
				b=b+599;
				LB2.setText("bill"+b);
				}
		});
		btnNewButton_2.setBounds(362, 352, 144, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("amazon");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(174, 12, 104, 32);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		frame.setBackground(new Color(153, 102, 204));
		frame.setBounds(100, 100, 532, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
