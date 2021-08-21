package com.bip.softwarearchitecture.solid.observerpattern.pr1;

public class VietNamObserver implements IObserver {
    private ISubscriber subscriber;

    public VietNamObserver(ISubscriber subscriber) {
        this.subscriber = subscriber;
        this.subscriber.addObserver(this);
    }

    @Override
    public void updateNumberCovid(int number) {
        System.out.println("Tong so ca covid: " + number);
    }
}
