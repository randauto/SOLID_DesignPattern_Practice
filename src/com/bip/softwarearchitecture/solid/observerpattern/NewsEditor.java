package com.bip.softwarearchitecture.solid.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class NewsEditor implements ISubject {
    private String mContent;

    private List<IObserver> observerList;

    public NewsEditor() {
        observerList = new ArrayList<>();
    }

    public void setContent(String mContent) {
        this.mContent = mContent;
        notifyAllObserver();
    }

    @Override
    public void addObserver(IObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (IObserver observer : observerList) {
            observer.update(mContent);
        }
    }
}
