package com.company;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    MyPanel(){
    this.setPreferredSize(new Dimension(800,400));
    }
    public void paint(Graphics g){
    Graphics g2D = (Graphics) g;
    g2D.setColor(Color.blue);
    g2D.fillRect(0,0,800,67);
    g2D.fillRect(0,333,800,67);
    g2D.setColor(Color.white);
    g2D.fillRect(0,67,800,10);
    g2D.fillRect(0,322,800,10);
    g2D.setColor(Color.red);
    g2D.fillRect(0,77,800,245);
    g2D.setColor(Color.white);
    g2D.fillOval(73,98,180,180);
    g2D.setColor(Color.red);
    int [] xPoints={163,182,245,194,212,163,113,132,81,144};
    int [] yPoints={103,162,162,198,258,222,259,199,162,162};
    g2D.fillPolygon(xPoints,yPoints,10);
    }
}
