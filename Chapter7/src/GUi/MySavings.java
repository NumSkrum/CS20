package GUi;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MySavings {

	private JFrame frame;
	private JTextField Input;

	public MySavingObj myS = new MySavingObj();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySavings window = new MySavings();
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
	public MySavings() {
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
		
		JLabel showTotal = new JLabel("1. Show total.");
		showTotal.setBounds(10, 11, 79, 14);
		frame.getContentPane().add(showTotal);
		
		JLabel Penny = new JLabel("2. Add a penny.(0.01)");
		Penny.setBounds(10, 36, 115, 14);
		frame.getContentPane().add(Penny);
		
		JLabel Nickel = new JLabel("3. Add a nickel.(0.05)");
		Nickel.setBounds(10, 61, 115, 14);
		frame.getContentPane().add(Nickel);
		
		JLabel Dime = new JLabel("4. Add a dime.(0.10)");
		Dime.setBounds(10, 86, 125, 14);
		frame.getContentPane().add(Dime);
		
		JLabel Quarter = new JLabel("5. Add a quarter.(0.25)");
		Quarter.setBounds(10, 111, 125, 14);
		frame.getContentPane().add(Quarter);
		
		JLabel Remove = new JLabel("6. Take money out.");
		Remove.setBounds(10, 136, 125, 14);
		frame.getContentPane().add(Remove);
		
		JLabel Leave = new JLabel("Enter 0 to quit.");
		Leave.setBounds(10, 161, 125, 14);
		frame.getContentPane().add(Leave);
		
		JLabel Choice = new JLabel("Enter your choice.(0-6)");
		Choice.setBounds(10, 186, 137, 14);
		frame.getContentPane().add(Choice);
		
		Input = new JTextField();
		Input.setBounds(141, 183, 54, 20);
		frame.getContentPane().add(Input);
		Input.setColumns(10);
	
		JLabel Blank = new JLabel("");
		Blank.setBounds(194, 36, 185, 31);
		frame.getContentPane().add(Blank);
		
		JButton Submit = new JButton("Submit");
		Submit.setBounds(10, 211, 89, 23);
		frame.getContentPane().add(Submit);
		Submit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			int Choice = (int) Double.parseDouble(Input.getText());

			switch (Choice) {
			case 1: 
			{
			
				//Blank.setText(myS.Total(Quarter, Dimes, Nickels, Pennies));
				
				
			}break;
			case 2:
			{
				
				(Amount + Penny);
				
			}break;
			case 3:			
			{
				
				(Object.Total() + Nickel);
				
			}break;
			case 4:
			{	
				
				(Object.Total() + Dime);
				
			}break;
			case 5:
			{
				
				(Object.Total() + Quarter);
				
			}break;
			
			}
			
		}
													});
		
	}
}
