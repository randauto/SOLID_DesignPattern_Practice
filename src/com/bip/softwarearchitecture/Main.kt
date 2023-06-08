package com.bip.softwarearchitecture

import java.util.*

class Main {
    fun largestNumber(n: Int): Int {
        if (checkValidNumber(n)) {
            val max = Math.pow(10.0, n.toDouble()).toInt()
            return max - 1
        }
        return 0
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
    fun phoneCall1(min1: Int, min2_10: Int, min11: Int, S: Int): Int {
        if (S < min1) {
            return 0
        }
        for (i in 2..10) {
            if (S < min1 + min2_10 * (i - 1)) {
                return i - 1
            }
        }
        return 10 + (S - min1 - min2_10 * 9) / min11
    }

    fun phoneCall(min1: Int, min2_10: Int, min11: Int, s: Int): Int {

        //Declaring Variables
        var s = s
        var minutes = 0
        var taken = 0

        //Checks if there is at least one minute to charge for
        if (s >= min1) {
            minutes = minutes + 1
            s = s - min1
        }

        //Checks how many minutes it can call for in between 2 and 10
        for (i in 1..9) {
            if (s >= min2_10) {
                minutes = minutes + 1
                s = s - min2_10
            }


            //Checks if minutes equals 10 and then checks for how many minutes it can afford
            if (minutes == 10) {
                if (s >= 1) {
                    minutes = (minutes + Math.floor((s / min11).toDouble())).toInt()
                    taken = (taken + Math.floor((s / min11).toDouble())).toInt()
                    s = s - taken * min11
                }
            }
        }

        //Returns the minutes
        return minutes
    }

    companion object {
        const val THRESHOLD = 5
        @JvmStatic
        fun main(args: Array<String>) {

//        showHeaderText();
//
//        List<Integer> nums = getListNumberInput(THRESHOLD);
//
//        sortArray(nums);
//
//        printArray(nums);
            test()
        }

        private fun test() {
            println("Ket qua: " + lateRide(808))
        }

        fun candies(n: Int, m: Int): Int {
            if (checkValidNumber(n, 1, 10) && checkValidNumber(m, 2, 100)) {
                val result = m / n
                return result * n
            }
            return 0
        }

        fun seatsInTheater(nCols: Int, nRows: Int, col: Int, row: Int): Int {
            return if (checkValidNumber(nCols, 1, 1000)
                && checkValidNumber(nRows, 1, 1000)
                && checkValidNumber(col, 1, nCols)
                && checkValidNumber(row, 1, nRows)
            ) {
                (nRows - row) * (nCols - col + 1)
            } else 0
        }

        fun reachNextLevel(experience: Int, threshold: Int, reward: Int): Boolean {
            val isNextLevel = false
            if (checkValidNumber(experience, 3, 250)
                && checkValidNumber(threshold, 5, 300)
                && checkValidNumber(reward, 2, 65)
            ) {
            }
            return isNextLevel
        }

        fun checkValidNumber(n: Int, min: Int, max: Int): Boolean {
            return min <= n && n <= max
        }

        fun checkValidNumberEven(n: Int, min: Int, max: Int): Boolean {
            return min <= n && n <= max && n % 2 == 0
        }

        fun addTwoDigits(n: Int): Int {
            if (checkValidNumber(n)) {
                val numberString = n.toString()
                val first = numberString[0]
                val second = numberString[1]
                return Character.getNumericValue(first) + Character.getNumericValue(second)
            }
            return 0
        }

        fun checkValidNumber(n: Int): Boolean {
            return 10 <= n && n <= 99
        }

        private fun showHeaderText() {
            println("Welcome to the Application!")
        }

        private fun printArray(nums: List<Int>) {
            for (i in nums.indices) {
                print("" + i)
            }
        }

        private fun getListNumberInput(size: Int): List<Int> {
            val scanner = Scanner(System.`in`)
            val nums: MutableList<Int> = ArrayList()
            println("Enter 5 valid integers in the range [0, 10]")
            while (nums.size < size) {
                val s = scanner.nextLine()
                if (!isValidString(s)) {
                    continue
                }
                val num = s.toInt()
                if (ValidChecker.isValidNumber(num)) {
                    continue
                }
                nums.add(num)
            }
            return nums
        }

        private fun isValidString(s: String): Boolean {
            try {
                s.toInt()
            } catch (nfe: NumberFormatException) {
                println("Invalid! Try again!")
                return false
            }
            return true
        }

        //////////////////////
        fun maxMultiple(divisor: Int, bound: Int): Int {
            val max = 0
            return if (checkValidNumber(divisor, 2, 10)
                && checkValidNumber(bound, 5, 100)
            ) {
                bound / divisor * divisor
            } else max
        }

        fun circleOfNumbers(n: Int, firstNumber: Int): Int {
            val index = 0
            if (checkValidNumberEven(n, 4, 20)
                && checkValidNumber(firstNumber, 0, n - 1)
            ) {

                // khoi tao mang.
                val arr = IntArray(n)
                for (i in 0 until n) {
                    arr[i] = i
                }

                // tim index
                val indexTemp = n / 2 - 1
                var indextFirst = 0
                for (i in arr.indices) {
                    if (arr[i] == firstNumber) {
                        indextFirst = i
                        break
                    }
                }
                ////
                val temp = indexTemp + indextFirst
                return if (temp < arr.size - 1) {
                    arr[temp + 1]
                } else {
                    arr[indextFirst - indexTemp - 1]
                }
            }
            return index
        }

        /*

        For n = 240, the output should be
    lateRide(n) = 4.

    Since 240 minutes have passed, the current time is 04:00. The digits sum up to 0 + 4 + 0 + 0 = 4, which is the answer.

    For n = 808, the output should be
    lateRide(n) = 14.

    808 minutes mean that it's 13:28 now, so the answer should be 1 + 3 + 2 + 8 = 14.

     */
        fun lateRide(n: Int): Int {
            val max = 0
            if (checkValidNumber(n, 0, 60 * 24)) {
                val hour = n / 60
                val minute = n % 60
                return hour / 10 + hour % 10 + minute / 10 + minute % 10
            }
            return max
        }
    }
}