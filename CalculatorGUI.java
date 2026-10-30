//MARC PAG DALI
import javax.swing.*;
import java.awt.*;
public class CalculatorGUI{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));

        JLabel lblCalc1 = new JLabel("Enter #1 ");
        JTextField txtNum1 = new JTextField(15);
        JLabel lblCalc2 = new JLabel("Enter #2");
        JTextField txtNum2 = new JTextField(15);

        JButton btnRslt = new JButton("Show Result");
        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(170, 140, 120, 30);

        frame.add(lblCalc1);
        frame.add(txtNum1);
        frame.add(lblCalc2);
        frame.add(txtNum2);
        frame.add(btnRslt);
        frame.add(clearButton);




frame.setVisible(true);
}
}

