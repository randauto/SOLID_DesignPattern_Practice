package com.bip.softwarearchitecture.solid.flyweightpattern.flyweightpr1;

import java.util.Random;

public class StickerSimulator {
    private Random random;

    private String[] effects = {"Overlay", "Screen", "Darken", "Add"};

    private StickerFactory stickerFactory;

    public StickerSimulator() {
        random = new Random();
        stickerFactory = new StickerFactory();
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            String effect = getRandomEffect();
            BitmapDrawerSticker sticker = (BitmapDrawerSticker) stickerFactory.getSticker(effect);
            sticker.setX(getRandomePosition());
            sticker.setY(getRandomePosition());
            sticker.draw();

        }
    }

    private int getRandomePosition() {
        return random.nextInt(100);
    }

    private String getRandomEffect() {
        return effects[random.nextInt(effects.length)];
    }
}
