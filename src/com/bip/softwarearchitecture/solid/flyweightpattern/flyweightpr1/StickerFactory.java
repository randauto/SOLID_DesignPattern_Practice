package com.bip.softwarearchitecture.solid.flyweightpattern.flyweightpr1;

import java.util.HashMap;
import java.util.Map;

public class StickerFactory {
    private Map<String, Sticker> mapSticker;

    public StickerFactory() {
        mapSticker = new HashMap<>();
    }

    public Sticker getSticker(String effect) {
        if (mapSticker.containsKey(effect)) {
            return mapSticker.get(effect);
        }

        Sticker sticker = new BitmapDrawerSticker(effect);
        mapSticker.put(effect, sticker);

        return sticker;
    }
}
