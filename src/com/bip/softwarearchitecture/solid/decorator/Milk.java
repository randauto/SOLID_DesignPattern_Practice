package com.bip.softwarearchitecture.solid.decorator;

public class Milk extends BaverageDecorator {
    private Baverage doUongCoBan;

    public Milk(Baverage doUongCoBan) {
        super(doUongCoBan);
        this.doUongCoBan = doUongCoBan;
    }

    @Override
    public int getCost() {
        return this.doUongCoBan.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return this.doUongCoBan.getDescription() + " them sua,";
    }
}
