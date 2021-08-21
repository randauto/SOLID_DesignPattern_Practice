package com.bip.softwarearchitecture.solid.visitor;

public interface Visitor {
    void visitCircle(Circle circle);
    void visitRectangle(Rectangle rectangle);
    void visitTriange(Triange triange);
}
