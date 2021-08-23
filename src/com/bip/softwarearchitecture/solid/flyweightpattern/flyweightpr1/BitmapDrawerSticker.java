package com.bip.softwarearchitecture.solid.flyweightpattern.flyweightpr1;

public class BitmapDrawerSticker implements Sticker {
    private int x;

    private int y;

    private String effect;

    public BitmapDrawerSticker(String effect) {
        System.out.println("Creating bitmap drawer with effect " + effect );
        this.effect = effect;
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
        System.out.println("Drawing bitmap....x = " + x + ", y =" + y);
    }
}
