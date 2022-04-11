package com.company;

import java.awt.*;

public class Gra {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Ramka ramka = new Ramka();
            ramka.setVisible(true);

        });
    }
}
