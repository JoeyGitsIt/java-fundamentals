package com.joey.javalearning;

public class Ingredient {
  String name;
  float weightInGrams;

  public Ingredient() {
  }

  public Ingredient(String name, float weightInGrams) {
    this.name = name;
    this.weightInGrams = weightInGrams;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getWeightInGrams() {
    return weightInGrams;
  }

  public void setWeightInGrams(float weightInGrams) {
    this.weightInGrams = weightInGrams;
  }
}
