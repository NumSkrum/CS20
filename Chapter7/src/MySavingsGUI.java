

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MySavingsGUI {

	private JFrame frame;
	private JTextField Choice;
	private static int Total;
	
	
	MySavingObj myS = new MySavingObj();
	private JTextField textField;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySavingsGUI window = new MySavingsGUI();
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
	public MySavingsGUI() {
		
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
		
		JLabel Quarter = new JLabel("5.Add a quarter.");
		Quarter.setBounds(10, 111, 150, 14);
		frame.getContentPane().add(Quarter);
		
		JLabel Dime = new JLabel("4.Add a dime.");
		Dime.setBounds(10, 86, 150, 14);
		frame.getContentPane().add(Dime);
		
		JLabel Nickel = new JLabel("3.Add a nickel.");
		Nickel.setBounds(10, 61, 150, 14);
		frame.getContentPane().add(Nickel);
		
		JLabel Penny = new JLabel("2.Add a penny.");
		Penny.setBounds(10, 36, 150, 14);
		frame.getContentPane().add(Penny);
		
		JLabel Showt = new JLabel("1.Show total in bank.");
		Showt.setBounds(10, 11, 180, 14);
		frame.getContentPane().add(Showt);
		
		JLabel Takeout = new JLabel("6.Take moeny out of bank.");
		Takeout.setBounds(10, 136, 150, 14);
		frame.getContentPane().add(Takeout);
		
		JLabel Exit = new JLabel("Enter 0 to exit.");
		Exit.setBounds(10, 161, 160, 14);
		frame.getContentPane().add(Exit);
		
		JLabel Please = new JLabel("Please enter your choice");
		Please.setBounds(10, 186, 180, 14);
		frame.getContentPane().add(Please);
		
		Choice = new JTextField();
		Choice.setBounds(10, 211, 97, 39);
		frame.getContentPane().add(Choice);
		Choice.setColumns(10);
		
		JLabel Show = new JLabel("");
		Show.setBounds(220, 11, 204, 189);
		frame.getContentPane().add(Show);
		
		JButton Submit = new JButton("Submit");
		Submit.setBounds(117, 211, 89, 39);
		frame.getContentPane().add(Submit);
		
		JLabel takeout = new JLabel("");
		takeout.setBounds(213, 211, 232, 39);
		frame.getContentPane().add(takeout);
		
		textField = new JTextField();
		textField.setEditable(true);
		textField.setEnabled(true);
		textField.setBounds(124, 80, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
			Submit.addActionListener(new ActionListener() 
		{
				public void actionPerformed(ActionEvent e) 
				{
					int choice = (int) Double.parseDouble(Choice.getText());
					int Remove = (int) Double.parseDouble(textField.getText());
					
					
					if(choice == 1) 
					{
						myS.getTotal();
						
						String str = String.valueOf(myS.getTotal());
						
						Show.setText(str);	
					}
					else if(choice == 2) 
					{
						
						myS.Penny();
						
						String str = String.valueOf(myS.getTotal());
						
						Show.setText(str);
						
					}
					else if(choice == 3)
					{
						
						myS.Nickels();
						
						String str = String.valueOf(myS.getTotal());
						
						Show.setText(str);
					}
					else if(choice == 4)
					{
						
						myS.Dimes();
						
						String str = String.valueOf(myS.getTotal());
						
						Show.setText(str);
					
					}
					else if(choice == 5)
					{
						
						myS.Quarter();
						
						String str = String.valueOf(myS.getTotal());
						
						Show.setText(str);
					}
					else if(choice == 6)
					{
						takeout.setText("How much would you like to take out?");
						
						myS.Remove(Remove);
						
						String str = String.valueOf(myS.getTotal());
						
						Show.setText(str);
						
					}
					else if(choice == 0)
					{
						System.exit(0);
					}
				}
		});
		
	
	}
}
