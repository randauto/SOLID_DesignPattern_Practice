package com.bip.softwarearchitecture.solid;

import com.bip.softwarearchitecture.solid.main.ISort;

import java.util.List;

public class MergeSort implements ISort {
    @Override
    public void executeSort(List<Integer> list) {
        System.out.println("MergeSort");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i);
        }
    }
}
