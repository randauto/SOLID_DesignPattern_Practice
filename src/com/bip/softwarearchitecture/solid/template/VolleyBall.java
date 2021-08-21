package com.bip.softwarearchitecture.solid.template;

public class VolleyBall extends SportGame {
    @Override
    public void initializeGame() {
        System.out.println("Chuan bi buoc vao tran bong chuyen");
    }

    @Override
    public void playing() {
        System.out.println("Tran bong chuyen dang dien ra");
    }

    @Override
    public void showResults() {
        System.out.println("Doi chu nha danh chien thang");
    }
}
