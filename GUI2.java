import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI2 implements ActionListener {

    private static JLabel userLabel;
    private static JLabel passLabel;
    private static JTextField userText;
    private static JPasswordField passText;
    private static JButton button;
    private static JLabel success;
    private static int chances = 0;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Login Program");
        JLayeredPane layeredPane = new JLayeredPane();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        userLabel = new JLabel("User:");
        userText = new JTextField(20);

        passLabel = new JLabel("Password:");
        passText = new JPasswordField(20);

        button = new JButton("Login");
        button.addActionListener(new GUI());

        success = new JLabel("");

        layeredPane.add(createBackground(), JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(userLabel, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(userText, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(passLabel, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(passText, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(button, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(success, JLayeredPane.PALETTE_LAYER);

        frame.setContentPane(layeredPane);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }

    private static JLabel createBackground() {
        JLabel background = new JLabel(new ImageIcon("bg01.jpg"));
        background.setBounds(0, 0, 500, 400);
        return background;
    }

    public void actionPerformed(ActionEvent e) {
        chances++;
        String user = userText.getText();
        String password = new String(passText.getPassword());

        if (chances < 3) {
            if (user.equals("ahmed") && password.equals("wow")) {
                success.setText("Welcome!");
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Login");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Login attempts exceeded!");
            System.exit(0);
        }
    }
}
