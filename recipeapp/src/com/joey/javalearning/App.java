package com.joey.javalearning;

public class App {
  public static void main(String[] args) throws Exception {
    Ingredient ingredient1 = new Ingredient("flour", 500f);
    Ingredient ingredient2 = new Ingredient("water", 400f);
    Ingredient ingredient3 = new Ingredient("starter", 100f);

    Ingredient[] ingredientArray = { ingredient1, ingredient2, ingredient3 };

    String[] stepsArray = { "mix", "fold", "bake" };

    Recipe recipe = new Recipe("bread", ingredientArray, stepsArray);

    System.out.println(recipe.getRecipeName());
    System.out.println(java.util.Arrays.toString(recipe.getStepsArray()));
    System.out.println(recipe.getStepsArray()[1]);

  }
}
