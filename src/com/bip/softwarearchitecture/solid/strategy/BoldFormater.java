package com.bip.softwarearchitecture.solid.strategy;

public class BoldFormater implements TextFormater {
    @Override
    public void formatText(String text) {
        System.out.println("Text will be bold");
    }
}
