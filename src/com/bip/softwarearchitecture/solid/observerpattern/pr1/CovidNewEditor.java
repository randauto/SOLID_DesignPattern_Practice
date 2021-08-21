package com.bip.softwarearchitecture.solid.observerpattern.pr1;

import java.util.ArrayList;
import java.util.List;

public class CovidNewEditor implements ISubscriber {
    private List<IObserver> listObserver;

    private int numberCovid;

    public void setNumberCovid(int numberCovid) {
        this.numberCovid = numberCovid;
        this.notifyAllObserver();
    }

    public int getNumberCovid() {
        return numberCovid;
    }

    public CovidNewEditor() {
        listObserver = new ArrayList<>();
    }

    @Override
    public void addObserver(IObserver observer) {
        listObserver.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        listObserver.remove(observer);
    }

    @Override
    public void notify(IObserver observer) {
        for (IObserver iObserver : listObserver) {
            if (iObserver == observer) {
                iObserver.updateNumberCovid(numberCovid);
            }
        }
    }

    @Override
    public void notifyAllObserver() {
        for (IObserver iObserver : listObserver) {
            iObserver.updateNumberCovid(numberCovid);
        }
    }
}
