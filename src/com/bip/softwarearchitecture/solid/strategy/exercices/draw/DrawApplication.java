package com.bip.softwarearchitecture.solid.strategy.exercices.draw;

public class DrawApplication {
    public static void main(String[] args) {
        DrawManager drawManager = new DrawManager();
        drawManager.setDrawControl(new HandDraw());
        drawManager.drawMessage("LE QUOC TUAN");

        drawManager.setDrawControl(new PaintDraw());
        drawManager.drawMessage("LE QUOC TUAN");
    }
}
