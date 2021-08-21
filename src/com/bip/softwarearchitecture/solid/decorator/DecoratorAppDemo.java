package com.bip.softwarearchitecture.solid.decorator;

public class DecoratorAppDemo {
    public static void main(String[] args) {
        Baverage doUong = new Milk(new Sugar(new PlainBaverage()));
        System.out.println("Gia: " + doUong.getCost());
        System.out.println("Mo ta: " + doUong.getDescription());
    }
}
