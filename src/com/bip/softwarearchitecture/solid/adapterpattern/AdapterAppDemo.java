package com.bip.softwarearchitecture.solid.adapterpattern;

import java.util.Arrays;
import java.util.List;

public class AdapterAppDemo {
    public static void main(String[] args) {
        CSVParser csvParser = new DotNetParser();
        csvParser.parse();
        CSVParser javaParser = new JavaAdapterParser(new JavaParser());
        javaParser.parse();

        // In java Programming language we have Array and List
        String[] names = {"A", "B", "C", "D", "E"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // convert array to String by using adapter pattern.
        List<String> listName = Arrays.asList(names);
        listName.forEach(System.out::println);
    }
}
