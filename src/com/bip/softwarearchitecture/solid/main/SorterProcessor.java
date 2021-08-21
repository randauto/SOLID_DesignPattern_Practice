package com.bip.softwarearchitecture.solid.main;

import java.util.List;

public class SorterProcessor {
    public static void execute(ISort sort, List<Integer> list) {
        sort.executeSort(list);
    }
}
