import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

	private static JLabel userLabel;
	private static JLabel passLabel;

	private static JTextField userText;
	private static JPasswordField passText;

	private static JButton button;
	private static JLabel success;

	private static int chances = 0;


	public static void main(String[] args){

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setSize(500, 400);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setContentPane(panel);
		panel.setLayout(null);

		JLabel background = new JLabel(new ImageIcon("bg01.jpg"));
		background.setBounds(0, 0, 500, 400); 
		panel.add(background);
		background.setOpaque(false);
	
		userLabel = new JLabel("User:");
		userLabel.setBounds(10, 20, 80, 25);
		userLabel.setOpaque(true);
		panel.add(userLabel);

		userText = new JTextField(20);
		userText.setBounds(125, 20, 165, 25);
		userText.setOpaque(true);
		panel.add(userText);

		passLabel = new JLabel("Password:");
		passLabel.setBounds(10, 70, 80, 25);
		passLabel.setOpaque(true);
		panel.add(passLabel);

		passText = new JPasswordField(20);
		passText.setBounds(125, 70, 165, 25);
		passText.setOpaque(true);
		panel.add(passText);

		button = new JButton("Login");
		button.setBounds(90,110,80,25);
		button.setOpaque(true);
		button.addActionListener(new GUI());
		panel.add(button);

		success = new JLabel("");
		success.setBounds(10, 140, 300, 25);
		success.setOpaque(true);
		panel.add(success);


		frame.setVisible(true); // This was missing

	}

	public void actionPerformed(ActionEvent e) {
		chances++; 
		String user = userText.getText();
		String password = passText.getText();

		if (chances < 3){
			if (user.equals("ahmed") && password.equals("wow")){
				success.setText("Welcome!");
			}else{
				JOptionPane.showMessageDialog(null, "Incorrect Login");
			}

		}else {
			JOptionPane.showMessageDialog(null, "Login attempts exceeded!");
			System.exit(0);
		}

		
	}
}