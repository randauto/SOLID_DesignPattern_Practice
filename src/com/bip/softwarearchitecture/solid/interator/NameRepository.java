package com.bip.softwarearchitecture.solid.interator;

public class NameRepository {
    private String[] names = {"Le Tuan", "Tran Phuong", "Viet Nam"};

    public Iterator getIterator() {
        return new NameIterator(names);
    }

}
