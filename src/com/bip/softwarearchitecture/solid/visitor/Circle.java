package com.bip.softwarearchitecture.solid.visitor;

public class Circle implements Shape {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}
