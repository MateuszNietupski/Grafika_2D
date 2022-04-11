package com.company;

import java.awt.*;
import java.util.Random;

public class Flagi extends Point{
    private static Random random = new Random();
    public Flagi()
    {
        super(random.nextInt(Board.FIELD_X), random.nextInt(Board.FIELD_Y));
    }

    public void draw(Graphics g){
        g.setColor(new Color(253, 0, 0));
        g.fillOval(x*Board.SIZE, y*Board.SIZE,Board.SIZE,Board.SIZE );
    }
}
