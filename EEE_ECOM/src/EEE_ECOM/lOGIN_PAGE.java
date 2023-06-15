package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class lOGIN_PAGE {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField ps1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lOGIN_PAGE window = new lOGIN_PAGE();
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
	public lOGIN_PAGE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 204));
		frame.setBackground(new Color(255, 255, 51));
		frame.setBounds(100, 100, 556, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login_page");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(170, 34, 197, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(255, 51, 153));
		lblNewLabel_1.setBounds(29, 109, 146, 55);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("user name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblNewLabel_2.setBounds(59, 132, 131, 18);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("password");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblNewLabel_3.setBounds(59, 193, 116, 55);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb1 = new JTextField();
		tb1.setBounds(218, 127, 205, 37);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		ps1 = new JPasswordField();
		ps1.setBounds(244, 216, 146, 20);
		frame.getContentPane().add(ps1);
		
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un=tb1.getText();
				String ps=ps1.getText();
				if(un.equals("hari")&&(ps.equals("1234")))
				
				{
			        JOptionPane.showMessageDialog(btnNewButton,"LOGIN DONE!");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton,"invalid!");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setBounds(218, 339, 116, 23);
		frame.getContentPane().add(btnNewButton);
		
	
	
	}

	public void setvisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}
}
