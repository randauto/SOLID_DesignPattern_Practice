package com.bip.softwarearchitecture.solid.flyweightpattern;

public class Rectangle implements Shape {
    private int x;

    private int y;

    private String color;

    public Rectangle(String color) {
        System.out.println("Creating rectangle with color: " + color);
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Draw rectangle x = " + x + "," + "y = " + y);
    }
}
