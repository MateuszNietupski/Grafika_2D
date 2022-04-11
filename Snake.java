package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<Point> body;
    private Direction direction;
    private Point ending;

    public Snake() {
        ending = new Point();
        direction = Direction.D;

        this.body = new ArrayList<>();
        body.add(new Point(2,5));
        body.add(new Point(2,4));
        body.add(new Point(2,3));

    }
    public void draw(Graphics g){
        g.setColor(Color.BLACK);
        for (Point p: getTail()) {
            g.fillRect(p.x*Board.SIZE, p.y*Board.SIZE,Board.SIZE,Board.SIZE );
        }

        g.setColor(new Color(92, 25, 25));
        g.fillOval(getHead().x*Board.SIZE, getHead().y*Board.SIZE,Board.SIZE,Board.SIZE );
    }
    private Point getHead(){
        return body.get(0);
    }
    private List<Point> getTail()
    {
        return body.subList(1,body.size());
    }

    public void move() {
        ending.setLocation(body.get(body.size()-1));
        for(int i = body.size()-1;i >0;i--)
        {
            body.get(i).setLocation(body.get(i-1));
        }
        switch (direction)
        {
            case D -> getHead().y++;
            case U -> getHead().y--;
            case R -> getHead().x++;
            case L -> getHead().x--;
        }
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public boolean isCollision() {
        Point head = getHead();
        for (Point p: getTail()) {
        if(head.equals(p)) return true;
        }
        return ( head.x < 0 || head.x >=Board.FIELD_X || head.y <0 || head.y >=Board.FIELD_Y );
    }
    public int getSize(){
        return body.size();
    }

    public boolean eatApple(Flagi flagi) {
        if(getHead().equals(flagi))
        {
            body.add(new Point(ending));
            Ramka.score.setText("Score: " + body.size());
            return true;
        }
        return false;
    }
}
