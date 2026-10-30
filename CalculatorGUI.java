
//MARC PAG DALI
import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblNum1 = new JLabel("Enter #1 ");
        lblNum1.setBounds(0,50,120,40);
        JTextField txtNum1 = new JTextField(10);
        txtNum1.setBounds(50,50,120,40);
        //JLabel lblNum2 = new JLabel("Enter #2");
        //JTextField txtNum2 = new JTextField(15);
        

        //JButton btnRslt = new JButton("Show Result");
        //JButton clearButton = new JButton("Clear");
       

        frame.add(lblNum1);
        frame.add(txtNum1);
       //frame.add(lblNum2);
        //frame.add(txtNum2);
        //frame.add(btnRslt);
        //frame.add(clearButton);
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
