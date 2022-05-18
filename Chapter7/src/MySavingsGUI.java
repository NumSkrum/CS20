

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
	private JTextField Removal;
	
	MySavingObj myS = new MySavingObj();
	
	
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
		
		Removal = new JTextField("0.0");
		Removal.setEditable(false);
		Removal.setEnabled(false);
		Removal.setBounds(124, 80, 86, 20);
		frame.getContentPane().add(Removal);
		Removal.setColumns(10);
		
		
		JLabel takeout = new JLabel("");
		takeout.setBounds(213, 211, 232, 39);
		frame.getContentPane().add(takeout);
	
		
		JButton Submit = new JButton("Submit");
		Submit.setBounds(117, 211, 89, 39);
		frame.getContentPane().add(Submit);
			Submit.addActionListener(new ActionListener() 
		{
				public void actionPerformed(ActionEvent e) 
				{
					int choice = Integer.parseInt(Choice.getText());
					//takes user input.
					
					if(choice == 1) 
					//if the inserted number is 1.
					{
						myS.getTotal();
						//get total.
						
						String str = String.valueOf(myS.getTotal());
						//change total to string
						
						Show.setText(str);	
						//place total into show text box.
					}
					else if(choice == 2) 
					//if choice is 2
					{
						
						myS.Penny();
						//calls object to add 0.01.
						
						String str = String.valueOf(myS.getTotal());
						
						
						Show.setText(str);
						
					}
					else if(choice == 3)
					{
						
						myS.Nickels();
						//adds 0.05
						
						String str = String.valueOf(myS.getTotal());
						
						Show.setText(str);
					}
					else if(choice == 4)
					{
						
						myS.Dimes();
						//adds 0.10
						
						String str = String.valueOf(myS.getTotal());
						
						Show.setText(str);
					
					}
					else if(choice == 5)
					{
						
						myS.Quarter();
						//adds 0.25
						
						String str = String.valueOf(myS.getTotal());
						
						Show.setText(str);
					}
					else if(choice == 6)
					{
						Removal.setEditable(true);
						Removal.setEnabled(true);
						//shows place to remove an amount
						
						takeout.setText("How much would you like to take out?");
						//asks how much they would like to take out.
						
						double Remove = Double.parseDouble(Removal.getText());
						//gets removal amount
						
						myS.Remove(Remove);
						//removes amount from total.
						
						String str = String.valueOf(myS.getTotal());
						
						Show.setText(str);
						
					}
					else if(choice == 0)
					{
						System.exit(0);
						//closes application.
					}
				}
		});
		
	
	}
}
