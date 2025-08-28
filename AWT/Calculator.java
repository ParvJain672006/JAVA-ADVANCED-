import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    TextField tf1, tf2, result;
    Button add, sub, mul, div;

    Calculator() {
        Label l1 = new Label("First Number:");
        Label l2 = new Label("Second Number:");
        Label l3 = new Label("Result:");

        tf1 = new TextField();
        tf2 = new TextField();
        result = new TextField();
        result.setEditable(false);

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

        l1.setBounds(50, 50, 100, 30);
        tf1.setBounds(160, 50, 150, 30);

        l2.setBounds(50, 100, 100, 30);
        tf2.setBounds(160, 100, 150, 30);

        l3.setBounds(50, 150, 100, 30);
        result.setBounds(160, 150, 150, 30);

        add.setBounds(50, 200, 50, 30);
        sub.setBounds(110, 200, 50, 30);
        mul.setBounds(170, 200, 50, 30);
        div.setBounds(230, 200, 50, 30);

        add(l1); add(tf1);
        add(l2); add(tf2);
        add(l3); add(result);
        add(add); add(sub); add(mul); add(div);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setTitle("Calculator");
        setSize(400, 300);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText().trim();
        String s2 = tf2.getText().trim();
        try {
            double a = Double.parseDouble(s1);
            double b = Double.parseDouble(s2);
            double res = 0.0;

            if (e.getSource() == add) {
                res = a + b;
            } else if (e.getSource() == sub) {
                res = a - b;
            } else if (e.getSource() == mul) {
                res = a * b;
            } else if (e.getSource() == div) {
                if (b == 0.0) {
                    result.setText("Cannot divide by 0");
                    return;
                }
                res = a / b;
            }

            result.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            result.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}