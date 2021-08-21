package com.bip.softwarearchitecture.solid.observerpattern;

public interface ISubject {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyAllObserver();
}
