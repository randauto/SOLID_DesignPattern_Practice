package com.bip.softwarearchitecture.solid.mvc;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<String> listString = new ArrayList<>();

    public Model() {

    }

    public List<String> getListString() {
        listString.add("Hello");
        listString.add("Goodmorning");
        listString.add("Hi");
        return listString;
    }
}
