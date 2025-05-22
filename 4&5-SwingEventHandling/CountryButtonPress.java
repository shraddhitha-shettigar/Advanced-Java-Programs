//Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the event handling mechanism with addActionListener( ).


package program_4;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CountryButtonPress {
    JLabel l1;

    CountryButtonPress() {
        JFrame f = new JFrame("Button Example");

        l1 = new JLabel();
        l1.setBounds(50, 50, 700, 100);
        l1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 40));

        JButton b1 = new JButton("India");
        JButton b2 = new JButton("Srilanka");

        b1.setBounds(100, 200, 100, 100);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("India is pressed");
            }
        });

        b2.setBounds(300, 200, 100, 100);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Srilanka is pressed");
            }
        });

        f.add(b1);
        f.add(b2);
        f.add(l1);

        f.setSize(550, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CountryButtonPress();
    }
}
