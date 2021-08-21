package com.bip.softwarearchitecture.solid.decorator;

public class Sugar extends BaverageDecorator {
    private Baverage doUongCoBan;

    public Sugar(Baverage doUongCoBan) {
        super(doUongCoBan);
        this.doUongCoBan = doUongCoBan;
    }

    @Override
    public int getCost() {
        return this.doUongCoBan.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return this.doUongCoBan.getDescription() + "them duong,";
    }
}
