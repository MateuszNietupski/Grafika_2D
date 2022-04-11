package com.company;

import com.company.Panele;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;


  class Rama extends JFrame {
    public Rama() throws HeadlessException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Inicjaly Bezier");
        add(new Panele());
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
 //class Inicjaly extends JFrame{
 //   public static void main(String[] args) {
//        Ramka ramka = new Ramka();
  //      ramka.setVisible(true);

//    }
//}
