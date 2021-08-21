package com.bip.softwarearchitecture;

public class ValidChecker {
    public static boolean isValidNumber(int num) {
        if (num < 0 || num > 10) {
            return true;
        }

        return false;
    }
}
