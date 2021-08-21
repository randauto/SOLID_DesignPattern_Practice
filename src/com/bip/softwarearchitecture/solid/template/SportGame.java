package com.bip.softwarearchitecture.solid.template;

public abstract class SportGame {

    protected abstract void initializeGame();

    protected abstract void playing();

    protected abstract void showResults();

    public final void startGame() {
        initializeGame();
        playing();
        showResults();
    }

}
