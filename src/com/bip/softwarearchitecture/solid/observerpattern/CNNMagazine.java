package com.bip.softwarearchitecture.solid.observerpattern;

public class CNNMagazine implements IObserver {
    private String mCurrentContent;
    private ISubject subject;

    public CNNMagazine(ISubject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(String content) {
        this.mCurrentContent = content;
        System.out.println("New content: " + mCurrentContent);
    }
}
