package com.bip.softwarearchitecture.solid;

import com.bip.softwarearchitecture.solid.main.ISort;

import java.util.List;

class InsertionSort implements ISort {
    @Override
    public void executeSort(List<Integer> list) {
        System.out.println("InsertionSort");
    }
}
