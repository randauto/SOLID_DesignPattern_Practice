package com.bip.softwarearchitecture.solid.observerpattern;

public class CNATvShow implements IObserver {
    private ISubject subject;
    public CNATvShow(ISubject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }
    @Override
    public void update(String content) {
        System.out.println("News from Channel New Asia: " + content);
    }
}
