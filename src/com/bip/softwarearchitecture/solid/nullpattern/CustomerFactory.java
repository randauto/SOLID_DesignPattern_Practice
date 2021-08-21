package com.bip.softwarearchitecture.solid.nullpattern;

public class CustomerFactory {
    private Database database;

    public CustomerFactory() {
        database = new Database();
    }

    public AbstractCustomer getCustomer(String name) {
        if (checkName(name)) {
            return new RealCustomer(name);
        }
        return new NullCustomer();
    }

    private boolean checkName(String name) {
        if (database.checkExitsCustomer(name)) {
            return true;
        }

        return false;
    }
}
