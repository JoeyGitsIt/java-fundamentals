package com.joey.javalearning;

public class Recipe {
  int id;
  String recipeName;
  Ingredient[] ingredientArray;
  String[] stepsArray;
  // String comment;

  public Recipe() {
  }

  public Recipe(String recipeName, Ingredient[] ingredientArray, String[] stepsArray) {
    this.recipeName = recipeName;
    this.ingredientArray = ingredientArray;
    this.stepsArray = stepsArray;
  }

  public String getRecipeName() {
    return this.recipeName;
  }

  public void setRecipeName(String recipeName) {
    this.recipeName = recipeName;
  }

  public Ingredient[] getIngredientArray() {
    return this.ingredientArray;
  }

  public void setIngredientArray(Ingredient[] ingredientsArray) {
    this.ingredientArray = ingredientsArray;
  }

  public String[] getStepsArray() {
    return this.stepsArray;
  }

  public void setStepsArray(String[] stepsArray) {
    this.stepsArray = stepsArray;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

}
