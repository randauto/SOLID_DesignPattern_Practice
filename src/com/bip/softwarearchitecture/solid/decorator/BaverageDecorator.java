package com.bip.softwarearchitecture.solid.decorator;

public abstract class BaverageDecorator implements Baverage {
    protected Baverage baverage;

    public BaverageDecorator(Baverage baverage) {
        this.baverage = baverage;
    }

    @Override
    public int getCost() {
        return baverage.getCost();
    }

    @Override
    public String getDescription() {
        return baverage.getDescription();
    }
}
