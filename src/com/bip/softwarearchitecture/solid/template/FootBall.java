package com.bip.softwarearchitecture.solid.template;

public class FootBall extends SportGame {
    @Override
    public void initializeGame() {
        System.out.println("Chuan bi buoc vao tran bong da");
    }

    @Override
    public void playing() {
        System.out.println("Tran da bong dang dien ra");
    }

    @Override
    public void showResults() {
        System.out.println("Doi chu nha danh chien thang");
    }
}
