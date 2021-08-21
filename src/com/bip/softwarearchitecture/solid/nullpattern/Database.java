package com.bip.softwarearchitecture.solid.nullpattern;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<String> listNames;

    public Database() {
        listNames = new ArrayList<>();
        listNames.add("Tuan");
        listNames.add("Phuong");
        listNames.add("Hoa");
        listNames.add("Huong");
        listNames.add("Trung");
        listNames.add("Kien");
    }

    public boolean checkExitsCustomer(String name) {
        for (String customer : listNames) {
            if (customer.equals(name)) {
                return true;
            }
        }

        return false;
    }
}
