package com.bip.softwarearchitecture.solid.strategy.exercices.draw;

public class HandDraw implements IDraw {
    @Override
    public void draw(String message) {
        System.out.println("Will draw a message: " + message + " from a Hand");
    }
}
