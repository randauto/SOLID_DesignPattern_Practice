package com.bip.softwarearchitecture.solid.template2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Coffee extends CaffeinBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk if needed");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase(Locale.getDefault()).startsWith("y")) {
            return true;
        } else return false;
    }

    private String getUserInput() {
        String answer = null;
        System.out.print("Ban co muon them duong hay sua vao cafe khong(y/n)?: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (answer == null) {
            return "no";
        }

        return answer;
    }
}
