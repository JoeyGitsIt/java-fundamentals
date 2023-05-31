package com.joey.takehome;

import java.util.Arrays;
import java.util.Date;

public class Sandwich {
  int sandwichId;
  String name;
  double cost;
  int calories;
  boolean isGlutenFree;
  Date availabilityDate;
  String[] ingredientsArray;

  public Sandwich(int sandwichId, String name, double cost, int calories, boolean isGlutenFree, Date availabilityDate,
      String[] ingredientsArray) {
    this.sandwichId = sandwichId;
    this.name = name;
    this.cost = cost;
    this.calories = calories;
    this.isGlutenFree = isGlutenFree;
    this.availabilityDate = availabilityDate;
    this.ingredientsArray = ingredientsArray;
  }

  public int getSandwichId() {
    return sandwichId;
  }

  public void setSandwichId(int sandwichId) {
    this.sandwichId = sandwichId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public boolean isGlutenFree() {
    return isGlutenFree;
  }

  public void setGlutenFree(boolean isGlutenFree) {
    this.isGlutenFree = isGlutenFree;
  }

  public Date getAvailabilityDate() {
    return availabilityDate;
  }

  public void setAvailabilityDate(Date availabilityDate) {
    this.availabilityDate = availabilityDate;
  }

  public String[] getIngredientsArray() {
    return ingredientsArray;
  }

  public void setIngredientsArray(String[] ingredientsArray) {
    this.ingredientsArray = ingredientsArray;
  }

  @Override
  public String toString() {
    return "Sandwich [sandwichId=" + sandwichId + ", name=" + name + ", cost=" + cost + ", calories=" + calories
        + ", isGlutenFree=" + isGlutenFree + ", availabilityDate=" + availabilityDate + ", ingredientsArray="
        + Arrays.toString(ingredientsArray) + "]";
  }
}
