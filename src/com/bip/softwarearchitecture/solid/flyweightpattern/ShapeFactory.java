package com.bip.softwarearchitecture.solid.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private Map<String, Shape> shapes;

    public ShapeFactory() {
        shapes = new HashMap<>();
    }

    public Shape getShape(String color) {
        if (shapes.containsKey(color)) {
            return shapes.get(color);
        }
        Shape shape = new Rectangle(color);
        shapes.put(color, shape);
        return shape;
    }
}
