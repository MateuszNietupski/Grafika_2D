package com.company;

import javax.swing.*;
import java.awt.*;

public class Panele extends JPanel {
private Bezier bezier = new Bezier();
public Panele() {
        setPreferredSize(new Dimension(620,480));
        }

@Override
public void paint(Graphics g) {
        bezier.paintComponent(g);
        }
        }