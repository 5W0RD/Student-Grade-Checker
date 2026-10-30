
//MARC PAG DALI
import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));

        JLabel lblNum1 = new JLabel("Enter #1 ");
        JTextField txtNum1 = new JTextField(15);
        JLabel lblNum2 = new JLabel("Enter #2");
        JTextField txtNum2 = new JTextField(15);

        JButton btnRslt = new JButton("Show Result");
        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(170, 140, 120, 40);

        frame.add(lblNum1);
        frame.add(txtNum1);
        frame.add(lblNum2);
        frame.add(txtNum2);
        frame.add(btnRslt);
        frame.add(clearButton);

        frame.setVisible(true);
    }
}
