import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTemplate {

    public static void main(String[] args) {
        // Create and set up the main frame
        JFrame frame = new JFrame("Simple Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        frame.add(panel);

        // Create a label
        JLabel label = new JLabel("Enter your name:");
        panel.add(label);

        // Create a text field
        JTextField textField = new JTextField(15);
        panel.add(textField);

        // Create a button
        JButton button = new JButton("Submit");
        panel.add(button);

        // Create a label to display the result
        JLabel resultLabel = new JLabel("");
        panel.add(resultLabel);

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                resultLabel.setText("Hello, " + name + "!");
            }
        });

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
