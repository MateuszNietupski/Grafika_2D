package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Panel extends JPanel {
    private Snake snake = new Snake();
    private Flagi flagi = new Flagi();
    private boolean gameOver = false;

    public Panel() {
    setPreferredSize(new Dimension(Board.MAX_X,Board.MAX_Y));
    MainTimer timer = new MainTimer();
    timer.start();
    Ramka.score.setText("Score: " + snake.getSize());
    setFocusable(true);
    addKeyListener(new MyKeyAdapter());
    }

    @Override
    public void paint(Graphics g) {
        Board.draw(g);
        snake.draw(g);
        flagi.draw(g);
    }
    private class MainTimer extends Timer{
        public static final int DELAY = 100;

        public MainTimer() {
            super(DELAY, e -> {
                if(!gameOver) {
                    snake.move();
                    if(snake.eatApple(flagi))
                    {
                        flagi = new Flagi();
                    }
                    if (snake.isCollision()) {
                        gameOver = true;
                        Ramka.score.setText("GAME OVER Score: " + snake.getSize());
                    }
                    repaint();
                }
            });
        }
    }

    private class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()){
                case KeyEvent.VK_LEFT:
                    if(snake.getDirection() != Direction.R) {
                        snake.setDirection(Direction.L);
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if(snake.getDirection() != Direction.L) {
                        snake.setDirection(Direction.R);
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if(snake.getDirection() != Direction.U) {
                        snake.setDirection(Direction.D);
                    }
                    break;
                case KeyEvent.VK_UP:
                    if(snake.getDirection() != Direction.D) {
                        snake.setDirection(Direction.U);
                    }
                    break;
            }
        }
    }
}
