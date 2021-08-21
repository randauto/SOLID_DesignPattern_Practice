package com.bip.softwarearchitecture.solid.visitor;

public class SaveFileCSV implements Visitor {
    @Override
    public void visitCircle(Circle circle) {
        System.out.println("Save file circle");
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.println("Save file rectangle");
    }

    @Override
    public void visitTriange(Triange triange) {
        System.out.println("Save file triange");
    }
}
