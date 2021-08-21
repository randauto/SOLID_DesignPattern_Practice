package com.bip.softwarearchitecture.annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class AnnonationAppDemo {
    public static void main(String[] args) {
        // Cach 3
        Class cls = AnnonationAppDemo.class;

        // Lay ra constructor cua class.
        Constructor[] constructors = cls.getConstructors();

        for (Constructor constructor : constructors) {
            System.out.println("Constructor: " + constructor.getName());
        }

        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println("Field: " + field.getName());
        }

    }
}
