package com.bip.softwarearchitecture.solid.interator;

public class NameIterator implements Iterator {
    private String[] names;
    private int index;

    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public Object next() {
        if (index < names.length) {
            return names[index++];
        }

        return null;
    }
}
