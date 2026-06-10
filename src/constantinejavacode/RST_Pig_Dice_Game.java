package constantinejavacode;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class RST_Pig_Dice_Game {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RST_Pig_Dice_Game window = new RST_Pig_Dice_Game();
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
	public RST_Pig_Dice_Game() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 512, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pig Dice Game");
		lblNewLabel.setFont(new Font("Freestyle Script", Font.PLAIN, 43));
		lblNewLabel.setBounds(159, 0, 209, 59);
		frame.getContentPane().add(lblNewLabel);
		
		JButton ROLL_1 = new JButton("ROLL");
		ROLL_1.setBounds(10, 196, 89, 23);
		frame.getContentPane().add(ROLL_1);
		
		JButton HOLD_1 = new JButton("HOLD");
		HOLD_1.setBounds(119, 196, 89, 23);
		frame.getContentPane().add(HOLD_1);
		
		JButton ROLL_2 = new JButton("ROLL");
		ROLL_2.setBounds(299, 196, 89, 23);
		frame.getContentPane().add(ROLL_2);
		
		JButton HOLD_2 = new JButton("HOLD");
		HOLD_2.setBounds(407, 196, 89, 23);
		frame.getContentPane().add(HOLD_2);
	}
}
