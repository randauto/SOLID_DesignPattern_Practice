package com.bip.softwarearchitecture.solid.nullpattern;

public class NullCustomer extends AbstractCustomer {
    @Override
    boolean isNull() {
        return true;
    }

    @Override
    String getCustomer() {
        return "Sorry, have not this customer in DB";
    }
}
