package com.bip.softwarearchitecture.solid.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorAppDemo {
    public static void main(String[] args) {
        Visitor visitor = new SaveFileCSV();

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle());
        shapeList.add(new Rectangle());
        shapeList.add(new Triange());

        for (Shape item : shapeList) {
            item.accept(visitor);
        }
    }
}
