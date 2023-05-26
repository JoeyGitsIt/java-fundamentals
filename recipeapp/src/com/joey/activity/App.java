package com.joey.activity;

public class App {
  public static void main(String[] args) {
    // people typing out 1-200
    for (int i = 1; i <= 200; i++) {
      System.out.println(testFizzBuzz(i));
    }
    // if divisible by 3 fizz
    // if divisible by 5 buzz
    // if 3 and 5 fizzbuzz
    // print num if not divisible by either
  }

  public static String testFizzBuzz(int i) {
    String result = "";
    if (i % 3 == 0) {
      result += "fizz";
    }
    if (i % 5 == 0) {
      result += "Buzz";
    }
    if (result.isEmpty()) {
      result += i;
    }
    return result;
  }
  // what if I want to add in 7 and 7 to produce "luck"
  // see if I can solve this using a map and being able to take in n ints and
  // produce "words"
  // use StringBuilder instead of concatnating strings
  // can put map in testFizzBuzz
  // By friday: refactor takehome to use Lists, and solve fizzbuzz+1
}
