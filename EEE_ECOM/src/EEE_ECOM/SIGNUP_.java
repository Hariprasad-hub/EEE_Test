package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
public class SIGNUP_ {

	private JFrame frame;
	private JTextField TB1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SIGNUP_ window = new SIGNUP_();
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
	public SIGNUP_() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 255));
		frame.setBounds(100, 100, 838, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIGNUP");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblNewLabel.setBounds(367, 11, 151, 54);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel LB1 = new JLabel("NAME");
		LB1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		LB1.setBounds(83, 95, 100, 33);
		frame.getContentPane().add(LB1);
		
		JLabel LB2 = new JLabel("GENDER");
		LB2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		LB2.setBounds(83, 180, 88, 40);
		frame.getContentPane().add(LB2);
		
		JRadioButton RD1 = new JRadioButton("MALE");
		RD1.setFont(new Font("Sitka Subheading", Font.PLAIN, 18));
		RD1.setBounds(329, 193, 109, 23);
		frame.getContentPane().add(RD1);
		
		JRadioButton RD2 = new JRadioButton("FEMALE");
		RD2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		RD2.setBounds(468, 190, 109, 23);
		frame.getContentPane().add(RD2);
		ButtonGroup bg=new ButtonGroup();
		bg.add(RD1);
		bg.add(RD2);
		
		JLabel LB3 = new JLabel("DEPT");
		LB3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		LB3.setBounds(93, 257, 81, 33);
		frame.getContentPane().add(LB3);
		
		JLabel LB4 = new JLabel("FAVORITE PRO LANGUAGE");
		LB4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		LB4.setBounds(83, 326, 238, 33);
		frame.getContentPane().add(LB4);
		JCheckBox CHB2 = new JCheckBox("JAVA");
		CHB2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		CHB2.setBounds(468, 327, 109, 33);
		frame.getContentPane().add(CHB2);
		
		JCheckBox CHB1 = new JCheckBox("PYTHON");
		CHB1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		CHB1.setBounds(340, 328, 97, 30);
		frame.getContentPane().add(CHB1);
		
		JCheckBox CHB3 = new JCheckBox("C++");
		CHB3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		CHB3.setBounds(620, 328, 97, 30);
		frame.getContentPane().add(CHB3);

		
		TB1 = new JTextField();
		TB1.setBounds(329, 95, 248, 30);
		frame.getContentPane().add(TB1);
		TB1.setColumns(10);
		
		JComboBox CB1 = new JComboBox();
		CB1.setBackground(new Color(0, 128, 255));
		CB1.setModel(new DefaultComboBoxModel(new String[] {"SLECT", "EEE", "CS", "ECE", "CE", "MECH", "CSE", "AIML"}));
		CB1.setBounds(329, 259, 248, 33);
		frame.getContentPane().add(CB1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=TB1.getText();
				String g;
				if(RD2.isSelected())
				{
					g="FEMALE";
				}
				else if(RD1.isSelected())
				{
					g="MALE";
				}
				else
				{
					g="INVALID";
				}
				String b=(String) CB1.getSelectedItem();
			    String a;
			    if(CHB1.isSelected())
			    {
			    	a="Python";
			    }
			    else if(CHB2.isSelected())
			    {
			    	a="Java";
			    }
			    else
			    {
			a="c++";
			}
		JOptionPane.showMessageDialog(btnNewButton,"HELLO"+n+"\n gender :"+g+"\n Branch"+b+"\n programming"+a);
	}	
});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(367, 389, 109, 33);
		frame.getContentPane().add(btnNewButton);
		
			}
}
