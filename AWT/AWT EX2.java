import java.awt.*;
import java.awt.event.*;

class LoginForm extends Frame implements ActionListener {
    // Components
    Label l1, l2, msg;
    TextField tf1, tf2;
    Button loginBtn, signupBtn;

    LoginForm() {
        // Labels
        l1 = new Label("Username:");
        l2 = new Label("Password:");
        msg = new Label("");

        // Text fields
        tf1 = new TextField();
        tf2 = new TextField();
        tf2.setEchoChar('*'); // hide password

        // Buttons
        loginBtn = new Button("Login");
        signupBtn = new Button("Signup");

        // Set positions
        l1.setBounds(50, 100, 80, 30);
        l2.setBounds(50, 150, 80, 30);
        tf1.setBounds(150, 100, 150, 30);
        tf2.setBounds(150, 150, 150, 30);
        loginBtn.setBounds(100, 220, 80, 30);
        signupBtn.setBounds(200, 220, 80, 30);
        msg.setBounds(100, 270, 200, 30);

        // Add to frame
        add(l1); add(tf1);
        add(l2); add(tf2);
        add(loginBtn); add(signupBtn);
        add(msg);

        // Listeners
        loginBtn.addActionListener(this);
        signupBtn.addActionListener(this);

        // Frame properties
        setTitle("Login Form");
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        // Close window properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String user = tf1.getText();
        String pass = tf2.getText();

        if (e.getSource() == loginBtn) {
            if (user.equals("admin") && pass.equals("123")) {
                msg.setText("Login Successful!");
                msg.setForeground(Color.GREEN);
            } else {
                msg.setText("Invalid credentials.");
                msg.setForeground(Color.RED);
            }
        } else if (e.getSource() == signupBtn) {
            msg.setText("Signup button clicked!");
            msg.setForeground(Color.BLUE);
        }
    }

    public static void main(String args[]) {
        new LoginForm();
    }
}
