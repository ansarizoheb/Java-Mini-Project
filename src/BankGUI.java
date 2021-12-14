import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankGUI {
    public BankGUI() {
        btnexecute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float bal = Float.parseFloat(tfbalance.getText());
                float am = Float.parseFloat(tfamount.getText());
                Float finalbal;
                ButtonGroup grp = new ButtonGroup();
                grp.add(rb1);
                grp.add(rb2);
                if (rb1.isSelected()==true)
                {
                    finalbal = bal-am;
                    tffbalance.setText(""+finalbal);
                }
                else if (rb2.isSelected()==true)
                {
                    finalbal = bal + am;
                    tffbalance.setText(""+finalbal);
                }
            }
        });
        btnclearall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfbalance.setText("");
                tfamount.setText("");
                tffbalance.setText("");
                tfbalance.requestFocus();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BankGUI");
        frame.setContentPane(new BankGUI().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JLabel heading;
    private JPanel Main;
    private JTextField tfbalance;
    private JRadioButton rb1;
    private JRadioButton rb2;
    private JTextField tfamount;
    private JTextField tffbalance;
    private JButton btnexecute;
    private JButton btnclearall;
    private JLabel balance;
    private JLabel option;
    private JLabel amount;
    private JLabel fbalance;
}
