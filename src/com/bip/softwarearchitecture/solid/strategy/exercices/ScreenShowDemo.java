package com.bip.softwarearchitecture.solid.strategy.exercices;

public class ScreenShowDemo {
    public static void main(String[] args) {
        ImageManager imageManager = new ImageManager();
        imageManager.setRender(new TVRenderer());
        imageManager.show();

        imageManager.setRender(new SmartphoneRenderer());
        imageManager.show();

        imageManager.setRender(new LaptopRenderer());
        imageManager.show();
    }
}
