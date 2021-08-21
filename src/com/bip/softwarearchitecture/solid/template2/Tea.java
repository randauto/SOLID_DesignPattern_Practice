package com.bip.softwarearchitecture.solid.template2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Tea extends CaffeinBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
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
        System.out.print("Ban co muon them chanh vao tra khong(y/n)?: ");
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
