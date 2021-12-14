import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {
    private JTextField tfusername;

    public LoginPage() {
        btnok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tfusername.getText();
                String pass = pfpassword.getText();
                if(name.equalsIgnoreCase("mhss") && pass.equals("saboo1234"))
                {
                    JOptionPane.showMessageDialog(null, "Logged in successfully");
                }
                else
                    JOptionPane.showMessageDialog(null,"Please enter correct username & password");
            }
        });
        btnclearall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfusername.setText("");
                pfpassword.setText("");
                tfusername.requestFocus();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("LoginPage");
        frame.setContentPane(new LoginPage().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPasswordField pfpassword;
    private JButton btnok;
    private JButton btnclearall;
    private JLabel heading;
    private JPanel Main;
    private JLabel username;
    private JLabel password;

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }
}
