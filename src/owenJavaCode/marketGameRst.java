package owenJavaCode;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class marketGameRst extends JFrame {

    private JPanel contentPane;
    private JTextField txtStartingCash;
    private JTextField txtApples;
    private JTextField txtCarrots;
    private JTextField txtCorn;
    private JTextField txtLettuce;
    private JTextField txtBlueberries;
    private JTextArea txtrResult;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	marketGameRst frame = new marketGameRst();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public marketGameRst() {
        // Defined here locally inside the GUI as clean final doubles
        final double PRICE_APPLE = 2.00;
        final double PRICE_CARROT = 2.50;
        final double PRICE_CORN = 6.00;
        final double PRICE_LETTUCE = 4.75;
        final double PRICE_BLUEBERRY = 4.99;

        setTitle("Market Produce Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 520);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitle = new JLabel("Welcome to the market here are our prices!");
        lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblTitle.setBounds(70, 11, 354, 25);
        contentPane.add(lblTitle);

        JLabel lblStartingCash = new JLabel("Starting Cash ($):");
        lblStartingCash.setBounds(30, 60, 150, 20);
        contentPane.add(lblStartingCash);

        txtStartingCash = new JTextField();
        txtStartingCash.setText("57.11"); 
        txtStartingCash.setBounds(200, 60, 86, 20);
        contentPane.add(txtStartingCash);

        JLabel lblApples = new JLabel("Apples ($" + PRICE_APPLE + " each):");
        lblApples.setBounds(30, 100, 160, 20);
        contentPane.add(lblApples);

        txtApples = new JTextField();
        txtApples.setText("0");
        txtApples.setBounds(200, 100, 86, 20);
        contentPane.add(txtApples);

        JLabel lblCarrots = new JLabel("Carrots ($" + PRICE_CARROT + " each):");
        lblCarrots.setBounds(30, 130, 160, 20);
        contentPane.add(lblCarrots);

        txtCarrots = new JTextField();
        txtCarrots.setText("0");
        txtCarrots.setBounds(200, 130, 86, 20);
        contentPane.add(txtCarrots);

        JLabel lblCorn = new JLabel("Corn ($" + PRICE_CORN + " each):");
        lblCorn.setBounds(30, 160, 160, 20);
        contentPane.add(lblCorn);

        txtCorn = new JTextField();
        txtCorn.setText("0");
        txtCorn.setBounds(200, 160, 86, 20);
        contentPane.add(txtCorn);

        JLabel lblLettuce = new JLabel("Lettuce ($" + PRICE_LETTUCE + " each):");
        lblLettuce.setBounds(30, 190, 160, 20);
        contentPane.add(lblLettuce);

        txtLettuce = new JTextField();
        txtLettuce.setText("0");
        txtLettuce.setBounds(200, 190, 86, 20);
        contentPane.add(txtLettuce);

        JLabel lblBlueberries = new JLabel("Blueberries ($" + PRICE_BLUEBERRY + " each):");
        lblBlueberries.setBounds(30, 220, 160, 20);
        contentPane.add(lblBlueberries);

        txtBlueberries = new JTextField();
        txtBlueberries.setText("0");
        txtBlueberries.setBounds(200, 220, 86, 20);
        contentPane.add(txtBlueberries);

        txtrResult = new JTextArea();
        txtrResult.setEditable(false);
        txtrResult.setFont(new Font("Monospaced", Font.PLAIN, 12));
        txtrResult.setBounds(30, 288, 370, 193);
        contentPane.add(txtrResult);

        // button code start
        JButton btnCalculate = new JButton("Calculate Change");
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double startingCash = Double.parseDouble(txtStartingCash.getText());
                    int numApples = Integer.parseInt(txtApples.getText());
                    int numCarrots = Integer.parseInt(txtCarrots.getText());
                    int numCorn = Integer.parseInt(txtCorn.getText());
                    int numLettuce = Integer.parseInt(txtLettuce.getText());
                    int numBlueberries = Integer.parseInt(txtBlueberries.getText());

                    // Passing quantities and GUI prices to match the parameters exactly
                    String resultText = owenMethods.calculateChange(
                            startingCash, numApples, numCarrots, numCorn, numLettuce, numBlueberries,
                            PRICE_APPLE, PRICE_CARROT, PRICE_CORN, PRICE_LETTUCE, PRICE_BLUEBERRY
                    );
                    
                    txtrResult.setText(resultText);

                } catch (NumberFormatException ex) {
                    txtrResult.setText("Please enter valid numbers in all fields.");
                }
            }
        });
        btnCalculate.setBounds(274, 251, 150, 30);
        contentPane.add(btnCalculate);
        // button code end
    }
}