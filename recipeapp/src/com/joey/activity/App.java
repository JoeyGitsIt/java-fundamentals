package com.joey.activity;

import java.util.HashMap;

public class App {
  public static void main(String[] args) throws Exception {
    // people typing out 1-200
    for (int i = 1; i <= 100; i++) {
      System.out.println(testFizzBuzzTwo(i, 29, "yes"));
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

  public static String testFizzBuzzTwo(int i, Integer k, String v) {
    StringBuilder sb = new StringBuilder();
    HashMap<Integer, String> fizzBuzzInfinite = new HashMap<Integer, String>();
    // String result = sb.toString();

    // if we want to do it all in the same function, need to check for duplicate
    // values and throw exceptions if checking for same number or just not do the
    // .put
    // if in same function, need to make fizzBuzzInfinite a global variable to
    // continually add more num/String combinations

    fizzBuzzInfinite.put(3, "fizz");
    fizzBuzzInfinite.put(5, "Buzz");
    fizzBuzzInfinite.put(7, "Luck");
    fizzBuzzInfinite.put(k, v);

    fizzBuzzInfinite.entrySet().stream()
        .forEach(fizzBuzz -> {
          if (i % fizzBuzz.getKey() == 0) {
            sb.append(fizzBuzz.getValue());
          }
        });

    if (sb.isEmpty()) {
      sb.append(i);
    }

    return sb.toString();
  }
  // what if I want to add in 7 and 7 to produce "luck"
  // see if I can solve this using a map and being able to take in n ints and
  // produce "words"
  // use StringBuilder instead of concatnating strings
  // can put map in testFizzBuzz
  // By friday: refactor takehome to use Lists, and solve fizzbuzz+1
}
