package com.company.Fizzbuzz;

public class Fizzbuzz {
    public static String eval(int number) {
        if (number % 15 == 0) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        return Integer.toString(number);
    }
}

