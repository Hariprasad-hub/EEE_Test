package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
public class friendship {

	private JFrame frame;
	private JTextField TB1;
	private JTextField TB2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					friendship window = new friendship();
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
	public friendship() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 0));
		frame.setBounds(100, 100, 845, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FRIENDSHIP %");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(245, 22, 318, 57);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel LB1 = new JLabel("name");
		LB1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		LB1.setBounds(95, 107, 83, 30);
		frame.getContentPane().add(LB1);
		
		JLabel LB2 = new JLabel("FRIEND'S NAME");
		LB2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		LB2.setBounds(95, 215, 204, 30);
		frame.getContentPane().add(LB2);
		
		TB1 = new JTextField();
		TB1.setBounds(409, 107, 191, 28);
		frame.getContentPane().add(TB1);
		TB1.setColumns(10);
		
		TB2 = new JTextField();
		TB2.setBounds(412, 218, 188, 30);
		frame.getContentPane().add(TB2);
		TB2.setColumns(10);
		JLabel lb4 = new JLabel("");
		lb4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lb4.setBounds(110, 306, 149, 84);
		frame.getContentPane().add(lb4);
		JButton btnNewButton = new JButton("check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r=new Random();
				int n=r.nextInt(1,100);
				lb4.setText(n+"%");
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(373, 340, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}

}
