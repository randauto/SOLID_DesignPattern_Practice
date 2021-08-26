package com.bip.softwarearchitecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final int THRESHOLD = 5;

    public static void main(String[] args) {

//        showHeaderText();
//
//        List<Integer> nums = getListNumberInput(THRESHOLD);
//
//        sortArray(nums);
//
//        printArray(nums);

        test();
    }

    private static void test() {
        System.out.println("Ket qua: " + lateRide(808));

    }

    static int candies(int n, int m) {
        if (checkValidNumber(n, 1, 10) && checkValidNumber(m, 2, 100)) {
            int result = m / n;
            return result * n;
        }

        return 0;
    }

    static int seatsInTheater(int nCols, int nRows, int col, int row) {
        if (checkValidNumber(nCols, 1, 1000)
                && checkValidNumber(nRows, 1, 1000)
                && checkValidNumber(col, 1, nCols)
                && checkValidNumber(row, 1, nRows)

        ) {
            int result = (nRows - row) * (nCols - col + 1);

            return result;
        }

        return 0;
    }

    static boolean reachNextLevel(int experience, int threshold, int reward) {
        boolean isNextLevel = false;
        if (checkValidNumber(experience, 3, 250)
                && checkValidNumber(threshold, 5, 300)
                && checkValidNumber(reward, 2, 65)
        ) {

        }

        return isNextLevel;
    }


    static boolean checkValidNumber(int n, int min, int max) {
        return (min <= n && n <= max);
    }

    static boolean checkValidNumberEven(int n, int min, int max) {
        return ((min <= n) && (n <= max) && (n % 2 == 0));
    }

    static int addTwoDigits(int n) {
        if (checkValidNumber(n)) {
            String numberString = String.valueOf(n);
            char first = numberString.charAt(0);
            char second = numberString.charAt(1);
            return Character.getNumericValue(first) + Character.getNumericValue(second);
        }

        return 0;
    }

    int largestNumber(int n) {
        if (checkValidNumber(n)) {
            int max = (int) Math.pow(10, n);
            return max - 1;
        }

        return 0;
    }

    static boolean checkValidNumber(int n) {
        return (10 <= n && n <= 99);
    }


    private static void showHeaderText() {
        System.out.println("Welcome to the Application!");
    }

    private static void printArray(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            System.out.print("" + i);
        }
    }

    private static List<Integer> getListNumberInput(int size) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        while (nums.size() < size) {

            String s = scanner.nextLine();

            if (!isValidString(s)) {
                continue;
            }
            int num = Integer.parseInt(s);
            if (ValidChecker.isValidNumber(num)) {
                continue;
            }

            nums.add(num);
        }

        return nums;
    }

    private static boolean isValidString(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }


        return true;
    }

    //////////////////////
    static int maxMultiple(int divisor, int bound) {
        int max = 0;
        if (checkValidNumber(divisor, 2, 10)
                && checkValidNumber(bound, 5, 100)) {
            return bound / divisor * divisor;
        }

        return max;
    }

    static int circleOfNumbers(int n, int firstNumber) {
        int index = 0;
        if (checkValidNumberEven(n, 4, 20)
                && checkValidNumber(firstNumber, 0, n - 1)) {

            // khoi tao mang.
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i;
            }

            // tim index
            int indexTemp = n / 2 - 1;
            int indextFirst = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == firstNumber) {
                    indextFirst = i;
                    break;
                }
            }
            ////
            int temp = indexTemp + indextFirst;
            if (temp < arr.length - 1) {
                return arr[temp + 1];
            } else {
                return arr[indextFirst - indexTemp - 1];
            }

        }

        return index;
    }

    /*

        For n = 240, the output should be
    lateRide(n) = 4.

    Since 240 minutes have passed, the current time is 04:00. The digits sum up to 0 + 4 + 0 + 0 = 4, which is the answer.

    For n = 808, the output should be
    lateRide(n) = 14.

    808 minutes mean that it's 13:28 now, so the answer should be 1 + 3 + 2 + 8 = 14.

     */

    static int lateRide(int n) {
        int max = 0;
        if (checkValidNumber(n, 0, 60 * 24)) {
            int hour = n / 60;
            int minute = n % 60;

            return hour / 10 + hour % 10 + minute / 10 + minute % 10;

        }

        return max;
    }

    ///////

    /*

    For min1 = 3, min2_10 = 1, min11 = 2, and s = 20, the output should be
phoneCall(min1, min2_10, min11, s) = 14.
        Here's why:

    the first minute costs 3 cents, which leaves you with 20 - 3 = 17 cents;
    the total cost of minutes 2 through 10 is 1 * 9 = 9, so you can talk 9 more minutes and still have 17 - 9 = 8 cents;
    each next minute costs 2 cents, which means that you can talk 8 / 2 = 4 more minutes.
    Thus, the longest call you can make is 1 + 9 + 4 = 14 minutes long.

     */

    int phoneCall1(int min1, int min2_10, int min11, int S) {

        if (S < min1) {
            return 0;
        }
        for (int i = 2; i <= 10; i++) {
            if (S < min1 + min2_10 * (i - 1)) {
                return i - 1;
            }
        }
        return 10 + (S - min1 - min2_10 * 9) / min11;
    }

    int phoneCall(int min1, int min2_10, int min11, int s) {

        //Declaring Variables
        int minutes = 0;
        int taken = 0;

        //Checks if there is at least one minute to charge for
        if (s >= min1) {
            minutes = minutes + 1;
            s = s - min1;
        }

        //Checks how many minutes it can call for in between 2 and 10
        for (int i = 1; i < 10; i++) {
            if (s >= min2_10) {
                minutes = minutes + 1;
                s = s - min2_10;
            }


            //Checks if minutes equals 10 and then checks for how many minutes it can afford
            if (minutes == 10) {
                if (s >= 1) {
                    minutes = (int) (minutes + Math.floor(s / min11));
                    taken = (int) (taken + Math.floor(s / min11));
                    s = s - (taken * min11);
                }
            }
        }

        //Returns the minutes
        return minutes;
    }


    static void sortArray(List list) {
        Collections.sort(list);
    }
}
