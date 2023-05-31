package com.joey.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
  public static void main(String[] args) throws Exception {
    // people typing out 1-200
    for (int i = 1; i <= 100; i++) {
      System.out.println(testFizzBuzzTwo(i));
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

  public static String testFizzBuzzTwo(int i) {
    StringBuilder sb = new StringBuilder();
    Map<Integer, String> fizzBuzzInfinite = getRulesStream()
        .collect(Collectors.toMap(Rule::getDivisor, Rule::getWord));

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

  private static List<Rule> getRules() {
    return new ArrayList<Rule>(List.of(new Rule(3, "Fizz"), new Rule(5, "Buzz"), new Rule(7, "Luck")));
  }

  private static Stream<Rule> getRulesStream() {
    return Stream.of(new Rule(3, "Fizz"), new Rule(5, "Buzz"), new Rule(7, "Luck"));
  }

}