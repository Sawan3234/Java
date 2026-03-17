package eventPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmeticCalculator extends JFrame implements ActionListener {

    JButton addBtn, subBtn, mulBtn, divBtn, remBtn, gcdBtn;
    JTextField field1, field2, resultField;

    public ArithmeticCalculator() {
        setTitle("Scientific Calculator");
        setSize(420, 350);
        setLayout(new GridLayout(4, 1, 5, 5));

        field1      = new JTextField(8);
        field2      = new JTextField(8);
        resultField = new JTextField(8);
        resultField.setEditable(false);

        addBtn = new JButton("Add");
        subBtn = new JButton("Subtract");
        mulBtn = new JButton("Multiply");
        divBtn = new JButton("Divide");
        remBtn = new JButton("Remainder");
        gcdBtn = new JButton("GCD");

        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);
        remBtn.addActionListener(this);
        gcdBtn.addActionListener(this);

        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        inputPanel.add(new JLabel("Number 1:"));
        inputPanel.add(field1);
        inputPanel.add(new JLabel("Number 2:"));
        inputPanel.add(field2);

        
        JPanel resultPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        resultPanel.add(new JLabel("Result:"));
        resultPanel.add(resultField);

       
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 8, 10));
        btnPanel.add(addBtn);
        btnPanel.add(subBtn);
        btnPanel.add(mulBtn);
        btnPanel.add(divBtn);
        btnPanel.add(remBtn);
        btnPanel.add(gcdBtn);

        add(inputPanel);
        add(resultPanel);
        add(btnPanel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ArithmeticCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(field1.getText());
        int b = Integer.parseInt(field2.getText());
        int result = 0;

        if (e.getSource() == addBtn) {
            result = a + b;
        } else if (e.getSource() == subBtn) {
            result = a - b;
        } else if (e.getSource() == mulBtn) {
            result = a * b;
        } else if (e.getSource() == divBtn) {
            result = a / b;
        } else if (e.getSource() == remBtn) {
            result = a % b;
        } else if (e.getSource() == gcdBtn) {
            int x = a, y = b;
            while (y != 0) {
                int temp = y;
                y = x % y;
                x = temp;
            }
            result = x;
        }

        resultField.setText(String.valueOf(result));
    }
}
