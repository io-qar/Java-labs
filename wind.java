package ry.mirea.lab4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class wind extends JFrame{
    JButton butAC = new JButton("AC Milan");
    JButton butRM = new JButton("Real Madrid");
    JLabel lbLS = new JLabel("Last Scorer: N/A");
    JLabel lbW = new JLabel("Winner: DRAW");
    int i = 0;
    int j = 0;
    JLabel lbR = new JLabel("Result: " + i + " X " + j);

    wind() {
        super("Milan vs Madrid");

        setLayout(new GridLayout(3, 2));

        add(butAC);
        add(butRM);
        add(lbR);
        add(lbLS);
        add(lbW);

        butAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i++;
                lbR.setText("Result: " + i + " X " + j);
                lbLS.setText("Last Scorer: AC Milan");
                if (i > j) lbW.setText("Winner: AC Milan");
                if (i == j) lbW.setText("Winner: DRAW");
            }
        });

        butRM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                j++;
                lbR.setText("Result: " + i + " X " + j);
                lbLS.setText("Last Scorer: Real Madrid");
                if (i < j) lbW.setText("Winner: Real Madrid");
                if (i == j) lbW.setText("Winner: DRAW");
            }
        });

        setSize(400, 400);
    }
}