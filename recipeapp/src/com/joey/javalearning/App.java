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

  public static void calculateTotalWeight() {

  }

  public static void calculateAverageTotalCalories() {

  }

  public static void allergyWarning(Allergen allergen) {
    switch (allergen) {
      case WHEAT:
        System.out.println(allergen.getWarning());
        break;
      case DAIRY:
        System.out.println(allergen.getWarning());
        break;
      case FISH:
        System.out.println(allergen.getWarning());
        break;
      case PEANUT:
        System.out.println(allergen.getWarning());
        break;
      case SHELLFISH:
        System.out.println(allergen.getWarning());
        break;
      case SOY:
        System.out.println(allergen.getWarning());
        break;
      default:
        System.out.println(allergen.getWarning());
        break;
    }
  }

}
