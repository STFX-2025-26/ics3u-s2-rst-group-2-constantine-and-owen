package constantinejavacode;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RST_Pig_Dice_Game {
	int random=0;
	int prevRoll=0;
	int Score = 0;
	int NewScore=0;
	int Points=0;
	
	int random2=0;
	int prevRoll2=0;
	int Score2 = 0;
	int NewScore2=0;
	int Points2=0;

	private JFrame frame;
	private JTextField Player1_Field;
	private JTextField Player2_Field;
	private JTextField Winner_Field;
	private JTextField ScoreField_1;
	private JTextField ScoreField_2;
	
	int score=0;
	
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
		ROLL_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Button Code Start
				
				

				
				
				//Process
				random = (int)Math.round(Math.random() *5+1);
				 Score=Score+random;
				 Points=Score;
				 
				//Output
				Player1_Field.setText(Integer.toString(random));
				
				ScoreField_1.setText(Integer.toString(Points));
				 
				if (Points > 99) {
					Winner_Field.setText("Player 1 Wins");
				
				
				}
						
			}
		});
		ROLL_1.setBounds(10, 224, 89, 23);
		frame.getContentPane().add(ROLL_1);
		
		JButton HOLD_1 = new JButton("HOLD");
		HOLD_1.setBounds(119, 224, 89, 23);
		frame.getContentPane().add(HOLD_1);
		
		JButton ROLL_2 = new JButton("ROLL");
		ROLL_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Button Code Start
				
				//Process
				random2 = (int)Math.round(Math.random() *5+1);
				 Score2=Score2+random2;
				 Points2=Score2;
				//Output
				Player2_Field.setText(Integer.toString(random2));
				
				ScoreField_2.setText(Integer.toString(Points2));
				
				if (Points2 > 99) {
					Winner_Field.setText("Player 2 Wins");
			}}
		});
		ROLL_2.setBounds(299, 224, 89, 23);
		frame.getContentPane().add(ROLL_2);
		
		JButton HOLD_2 = new JButton("HOLD");
		HOLD_2.setBounds(398, 224, 89, 23);
		frame.getContentPane().add(HOLD_2);
		
		Player1_Field = new JTextField();
		Player1_Field.setBounds(59, 258, 86, 20);
		frame.getContentPane().add(Player1_Field);
		Player1_Field.setColumns(10);
		
		Player2_Field = new JTextField();
		Player2_Field.setColumns(10);
		Player2_Field.setBounds(357, 258, 86, 20);
		frame.getContentPane().add(Player2_Field);
		
		JLabel lblNewLabel_1 = new JLabel("PLAYER 1");
		lblNewLabel_1.setBounds(59, 180, 70, 14);
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Button Code Start
				
				Player1_Field.setText("");
				Player2_Field.setText("");
				Winner_Field.setText("");
				ScoreField_1.setText("");
				ScoreField_2.setText("");
				System.exit(0);
				
				
				//Button Code End
			}
		});
		btnNewButton.setBounds(209, 356, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2_1 = new JLabel("You roll, until you decide to press hold. Which locks in the score you get, and ends your turn");
		lblNewLabel_2_1.setBounds(32, 70, 442, 50);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("If you roll a one, your turn ends and all the points you got that turn are void");
		lblNewLabel_2_1_1.setBounds(32, 90, 431, 50);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		ScoreField_1 = new JTextField();
		ScoreField_1.setColumns(10);
		ScoreField_1.setBounds(59, 309, 86, 20);
		frame.getContentPane().add(ScoreField_1);
		
		ScoreField_2 = new JTextField();
		ScoreField_2.setColumns(10);
		ScoreField_2.setBounds(357, 309, 86, 20);
		frame.getContentPane().add(ScoreField_2);
	}
}
