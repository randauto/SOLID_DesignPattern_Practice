package com.bip.softwarearchitecture.solid.facade.pr2;

public class FacadeAppDemo2 {
    public static void main(String[] args) {
        MachineLearningManager machineLearningManager = new MachineLearningManager();
        machineLearningManager.doFaceDetect();

        machineLearningManager.doCarDetect();

        machineLearningManager.doHairDetect();
    }
}
