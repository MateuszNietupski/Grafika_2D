package com.company;

import org.ietf.jgss.GSSName;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1: Obrazek 2D");
        System.out.println("2: Gra 2D");
        System.out.println("3: Inicjaly Bezier");
        System.out.print("Podaj opcje:");
        int opcja=scan.nextInt();
        switch (opcja) {
            case 1 -> new MyFrame();
            case 2 -> EventQueue.invokeLater(() -> {
                Ramka ramka = new Ramka();
                ramka.setVisible(true);

            });
            case 3 ->  new Rama() ;
        }
    }
}
