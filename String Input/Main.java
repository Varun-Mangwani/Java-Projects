import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Enter String Example");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Enter Text:");
        label.setBounds(20, 20, 100, 30);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(120, 20, 150, 30);
        frame.add(textField);

        JButton button = new JButton("Submit");
        button.setBounds(120, 70, 100, 30);
        frame.add(button);

        JLabel outputLabel = new JLabel("");
        outputLabel.setBounds(20, 120, 300, 30);
        frame.add(outputLabel);

        // Action Listener
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                outputLabel.setText("You entered: " + input);
            }
        });

        frame.setVisible(true);
    }
}
