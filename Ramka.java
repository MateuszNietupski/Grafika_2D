package com.company;

import javax.swing.*;
import java.awt.*;

public class Ramka extends JFrame {

    public static JLabel score;

    public Ramka() throws HeadlessException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Geograficzny snake");

        score = new JLabel("Score: ",SwingConstants.CENTER);
        score.setFont(new Font(score.getFont().getName(),Font.BOLD,30));
        add(score,BorderLayout.NORTH);
        add(new Panel());
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
