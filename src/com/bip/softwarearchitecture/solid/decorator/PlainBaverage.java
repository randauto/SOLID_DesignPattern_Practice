package com.bip.softwarearchitecture.solid.decorator;

public class PlainBaverage implements Baverage {

    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Do uong co ban ";
    }
}
