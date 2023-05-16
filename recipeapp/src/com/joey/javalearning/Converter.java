package com.joey.javalearning;

public class Converter {
  public static float convertOzGrams(float weight, String unit) {
    // returns oz
    if (unit == "grams") {
      return weight * .035274f;
    }
    // returns grams
    if (unit == "oz") {
      return weight * 28.34952f;
    }

    return 0f;
  }
}
