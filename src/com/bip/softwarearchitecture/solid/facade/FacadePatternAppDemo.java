package com.bip.softwarearchitecture.solid.facade;

public class FacadePatternAppDemo {
    public static void main(String[] args) {
        AlgorithmManager algorithmManager = new AlgorithmManager();
        algorithmManager.doBubleSort();
        algorithmManager.doSelectionSort();
        algorithmManager.doInsertionSort();

    }
}
