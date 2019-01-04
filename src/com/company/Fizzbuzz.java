package com.company.Fizzbuzz;

public class Fizzbuzz {
    public static String eval(int number) {
        if (number % 15 == 0) return "FizzBuzz";
        return Integer.toString(number);
    }
}

