package GUi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class GUi {

	private JFrame frame;
	private JTextField Fn;
	private JTextField Ln;
	private JTextField m1;
	private JTextField m2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUi window = new GUi();
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
	public GUi() {
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
		
		JLabel FN = new JLabel("First Name:");
		FN.setForeground(new Color(0, 0, 0));
		FN.setBackground(Color.WHITE);
		FN.setFont(new Font("MS Gothic", Font.BOLD, 12));
		FN.setBounds(10, 11, 125, 47);
		frame.getContentPane().add(FN);
		
		Fn = new JTextField();
		Fn.setForeground(new Color(0, 0, 0));
		Fn.setBounds(83, 17, 341, 35);
		frame.getContentPane().add(Fn);
		Fn.setColumns(10);
		
		JLabel LN = new JLabel("Last Name :");
		LN.setForeground(new Color(0, 0, 0));
		LN.setFont(new Font("MS Gothic", Font.BOLD, 12));
		LN.setBackground(Color.WHITE);
		LN.setBounds(10, 69, 125, 47);
		frame.getContentPane().add(LN);
		
		Ln = new JTextField();
		Ln.setForeground(new Color(0, 0, 0));
		Ln.setColumns(10);
		Ln.setBounds(83, 75, 341, 35);
		frame.getContentPane().add(Ln);
		
		JLabel M1 = new JLabel("Mark 1:");
		M1.setForeground(Color.BLACK);
		M1.setFont(new Font("MS Gothic", Font.BOLD, 12));
		M1.setBackground(Color.WHITE);
		M1.setBounds(30, 110, 125, 47);
		frame.getContentPane().add(M1);
		
		JLabel M2 = new JLabel("Mark 2:");
		M2.setForeground(Color.BLACK);
		M2.setFont(new Font("MS Gothic", Font.BOLD, 12));
		M2.setBackground(Color.WHITE);
		M2.setBounds(123, 110, 125, 47);
		frame.getContentPane().add(M2);
		
		m1 = new JTextField();
		m1.setBounds(30, 143, 46, 35);
		frame.getContentPane().add(m1);
		m1.setColumns(10);
		
		m2 = new JTextField();
		m2.setColumns(10);
		m2.setBounds(123, 143, 46, 35);
		frame.getContentPane().add(m2);
		
		JLabel Blank = new JLabel("");
		Blank.setFont(new Font("MS Gothic", Font.BOLD, 15));
		Blank.setBounds(10, 206, 414, 44);
		frame.getContentPane().add(Blank);
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String FirstN = Fn.getText();
				String LastN = Ln.getText();
				
				double Mark1 = Double.parseDouble(m1.getText());
				double Mark2 = Double.parseDouble(m2.getText());
				double Avg = (Mark1 + Mark2)/2;
				
				Blank.setText(FirstN + " " + LastN + " your average is " + Avg );
				
			}
		});
		Submit.setBackground(Color.GRAY);
		Submit.setFont(new Font("MS Gothic", Font.BOLD, 11));
		Submit.setBounds(270, 143, 124, 29);
		frame.getContentPane().add(Submit);
		
		JLabel lblNewLabel = new JLabel("[===============================================================]");
		lblNewLabel.setFont(new Font("MS Gothic", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 189, 414, 14);
		frame.getContentPane().add(lblNewLabel);
		

	}
}
