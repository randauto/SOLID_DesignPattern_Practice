package com.bip.softwarearchitecture.solid.strategy.exercices.draw;

public class DrawManager {
    private IDraw drawControl;

    public void setDrawControl(IDraw draw) {
        this.drawControl = draw;
    }

    public void drawMessage(String message) {
        this.drawControl.draw(message);
    }
}
