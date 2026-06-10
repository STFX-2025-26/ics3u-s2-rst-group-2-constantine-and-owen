package constantinejavacode;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class RST_Pig_Dice_Game {

	private JFrame frame;
	private JTextField Player1_Field;
	private JTextField Player2_Field;
	private JTextField Winner_Field;

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
		ROLL_1.setBounds(10, 224, 89, 23);
		frame.getContentPane().add(ROLL_1);
		
		JButton HOLD_1 = new JButton("HOLD");
		HOLD_1.setBounds(119, 224, 89, 23);
		frame.getContentPane().add(HOLD_1);
		
		JButton ROLL_2 = new JButton("ROLL");
		ROLL_2.setBounds(299, 224, 89, 23);
		frame.getContentPane().add(ROLL_2);
		
		JButton HOLD_2 = new JButton("HOLD");
		HOLD_2.setBounds(398, 224, 89, 23);
		frame.getContentPane().add(HOLD_2);
		
		Player1_Field = new JTextField();
		Player1_Field.setBounds(59, 294, 86, 20);
		frame.getContentPane().add(Player1_Field);
		Player1_Field.setColumns(10);
		
		Player2_Field = new JTextField();
		Player2_Field.setColumns(10);
		Player2_Field.setBounds(355, 294, 86, 20);
		frame.getContentPane().add(Player2_Field);
		
		JLabel lblNewLabel_1 = new JLabel("PLAYER 1");
		lblNewLabel_1.setBounds(83, 180, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PLAYER 2");
		lblNewLabel_1_1.setBounds(372, 180, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		Winner_Field = new JTextField();
		Winner_Field.setBounds(190, 325, 133, 20);
		frame.getContentPane().add(Winner_Field);
		Winner_Field.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("The goal of the game is to get yourself to 100 points before the other player");
		lblNewLabel_2.setBounds(32, 53, 442, 50);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("CLEAR");
		btnNewButton.setBounds(209, 356, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2_1 = new JLabel("You roll, until you decide to press hold. Which locks in the score you get, and ends your turn");
		lblNewLabel_2_1.setBounds(32, 70, 442, 50);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("If you roll a one, your turn ends and all the points you got that turn are void");
		lblNewLabel_2_1_1.setBounds(32, 90, 431, 50);
		frame.getContentPane().add(lblNewLabel_2_1_1);
	}
}
