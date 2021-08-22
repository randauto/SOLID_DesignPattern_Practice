package com.bip.softwarearchitecture.solid.flyweightpattern;

import java.util.Random;

public class FlyweightSimulator {
    private Random random;

    private String[] colors = {"RED", "GREEN", "BLUE", "ORANGE"};

    private ShapeFactory shapeFactory;

    public FlyweightSimulator() {
        shapeFactory = new ShapeFactory();
        random = new Random();
    }

    public void run() {
        for (int i = 0; i < 30; i++) {
            String color = getRandomColor();
            Rectangle rectangle = (Rectangle) shapeFactory.getShape(color);
            rectangle.setX(getRandomPosition());
            rectangle.setY(getRandomPosition());
            rectangle.draw();
        }
    }

    private int getRandomPosition() {
        return random.nextInt(50);
    }

    private String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }


}
