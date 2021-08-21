package com.bip.softwarearchitecture.solid.observerpattern.pr1;

public interface ISubscriber {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notify(IObserver observer);
    void notifyAllObserver();
}
