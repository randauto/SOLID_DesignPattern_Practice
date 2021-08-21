package com.bip.softwarearchitecture.solid.observerpattern;

public class ObserverDemo {
    public static void main(String[] args) {
        NewsEditor newsEditor = new NewsEditor();
        IObserver observer = new CNNMagazine(newsEditor);
        newsEditor.setContent("Chung ta co tin moi ne!!!");
        newsEditor.setContent("Tong thong Hoa Ky sap den tham Viet Nam");

        newsEditor.addObserver(new CNATvShow(newsEditor));
        newsEditor.setContent("Nhung se bi hoan lai vi thoi tiet xau");
    }
}
