package com.main;

import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle{

    Random random;
    int yVelocity;
    int xVelocity;
    int initialSpeed = 2;
    Ball(int x, int y, int width, int height) {

        super(x,y,width,height);
        random = new Random();

        int randomXDirection = random.nextInt(2);
        if (randomXDirection == 0) {
            randomXDirection--;
        }
        SetXDirection(randomXDirection*initialSpeed);

        int randomYDirection = random.nextInt(2);
        if (randomYDirection == 0)
            randomYDirection--;
        SetYDirection(randomYDirection*initialSpeed);
    }

    public void SetXDirection(int randomXDirection) {
        xVelocity = randomXDirection;
    }

    public void SetYDirection(int randomYDirection) {
        yVelocity = randomYDirection;
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x,y,height,width);
    }
}
