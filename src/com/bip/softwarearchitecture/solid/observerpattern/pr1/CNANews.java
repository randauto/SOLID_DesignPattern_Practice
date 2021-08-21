package com.bip.softwarearchitecture.solid.observerpattern.pr1;

public class CNANews {
    public static void main(String[] args) {
        CovidNewEditor subscriber = new CovidNewEditor();
        IObserver iSubscriber = new ThaiLanObserver(subscriber);
        subscriber.setNumberCovid(1000);

        subscriber.addObserver(new VietNamObserver(subscriber));
        subscriber.setNumberCovid(2000);

    }
}
