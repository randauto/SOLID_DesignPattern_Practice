package com.bip.softwarearchitecture.solid.nullpattern;

public class RealCustomer extends AbstractCustomer {
    private String name;

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    boolean isNull() {
        return false;
    }

    @Override
    String getCustomer() {
        return this.name;
    }
}
