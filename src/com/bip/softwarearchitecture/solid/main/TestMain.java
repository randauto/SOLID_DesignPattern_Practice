package com.bip.softwarearchitecture.solid.main;

import com.bip.softwarearchitecture.solid.MergeSort;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        SorterProcessor.execute(new MergeSort(), list);
    }
}
