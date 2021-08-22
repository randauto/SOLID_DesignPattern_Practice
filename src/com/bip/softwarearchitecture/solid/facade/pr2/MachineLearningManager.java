package com.bip.softwarearchitecture.solid.facade.pr2;

public class MachineLearningManager {
    private MachineLearning faceDetect;
    private MachineLearning hairDetect;
    private MachineLearning carDetect;

    public MachineLearningManager() {
        faceDetect = new FaceDetect();
        hairDetect = new HairDetect();
        carDetect = new CarDetect();
    }

    public void doFaceDetect() {
        faceDetect.execute();
    }

    public void doHairDetect() {
        hairDetect.execute();
    }

    public void doCarDetect() {
        carDetect.execute();
    }
}
