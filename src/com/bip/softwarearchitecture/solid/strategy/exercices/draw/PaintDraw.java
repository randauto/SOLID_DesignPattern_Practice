package com.bip.softwarearchitecture.solid.strategy.exercices.draw;

public class PaintDraw implements IDraw {
    @Override
    public void draw(String message) {
        System.out.println("Will draw a message: " + message + " from a Paint");
    }
}
