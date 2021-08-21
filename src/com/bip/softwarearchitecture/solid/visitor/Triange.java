package com.bip.softwarearchitecture.solid.visitor;

public class Triange implements Shape {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitTriange(this);
    }
}
