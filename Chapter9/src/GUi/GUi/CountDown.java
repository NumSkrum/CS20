package GUi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CountDown {

	private JFrame frame;

	
	CountDownObj CDO = new CountDownObj();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CountDown window = new CountDown();
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
	public CountDown() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Count Down:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 414, 56);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel Counting = new JLabel("");
		Counting.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Counting.setBounds(10, 104, 414, 43);
		frame.getContentPane().add(Counting);
		
		JButton Begin = new JButton("Begin Count.");
		Begin.setBounds(10, 227, 118, 23);
		frame.getContentPane().add(Begin);
		Begin.addActionListener(new ActionListener() 
		{
				public void actionPerformed(ActionEvent e) 
				{
					Counting.setText(CDO.toString());
					//Prints Array.
				}
		});
	}
}
