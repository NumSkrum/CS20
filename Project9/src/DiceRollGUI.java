import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class DiceRollGUI {

	private JFrame frame;
	private JTextField Rolling;
	
	int outcome;


	
	DiceRoll DR = new DiceRoll();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiceRollGUI window = new DiceRollGUI();
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
	public DiceRollGUI() {
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
		
		JLabel lblNewLabel = new JLabel("Dice roll:");
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 414, 53);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("How many rolls would you like?");
		lblNewLabel_1.setBounds(10, 54, 216, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		Rolling = new JTextField();
		Rolling.setBounds(10, 75, 86, 20);
		frame.getContentPane().add(Rolling);
		Rolling.setColumns(10);
		
		JButton Submit = new JButton("Submit.");
		Submit.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(Submit);
		
		JTextPane Rolls = new JTextPane();
		Rolls.setEditable(false);
		Rolls.setBounds(213, 11, 155, 222);
		frame.getContentPane().add(Rolls);
		Submit.addActionListener(new ActionListener() 
		{
				public void actionPerformed(ActionEvent e) 
				{
					int outcome;
					int[] outcomes = new int[19];
					String Count = "";
					int choice = Integer.parseInt(Rolling.getText());
					//takes user input.
					for (int roll = 0; roll < choice; roll++)
					{
						outcome = (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1);
						outcomes[outcome] += 1;
					}
					for (int i = 3; i <= 18; i++)
					{
						Count = Count + i + ": " + outcomes[i] + "\t ";
						Rolls.setText(Count);
					}
				}
		});
	}
}
