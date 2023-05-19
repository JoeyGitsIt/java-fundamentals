package com.joey.javalearning;

// import java.lang.Enum;

public class App {
  public static void main(String[] args) throws Exception {
    Ingredient ingredient1 = new Ingredient("flour", 500f);
    Ingredient ingredient2 = new Ingredient("water", 400f);
    Ingredient ingredient3 = new Ingredient("starter", 100f);

    Ingredient[] ingredientArray = { ingredient1, ingredient2, ingredient3 };

    String[] stepsArray = { "mix", "fold", "bake" };

    Recipe recipe = new Recipe("bread", ingredientArray, stepsArray);

    // System.out.println(recipe.getRecipeName());
    // System.out.println(java.util.Arrays.toString(recipe.getStepsArray()));
    // System.out.println(recipe.getStepsArray()[1]);

    calculateTotalWeight(ingredientArray);
    allergyWarning(Allergen.WHEAT);
    calculateTotalCalories(20, 20, 20);

  }

  public static void calculateTotalWeight(Ingredient[] ingredientArray) {
    float totalWeight = 0;

    for (Ingredient ingredient : ingredientArray) {
      totalWeight += ingredient.weightInGrams;
    }

    System.out.println(totalWeight + "g is the total weight of all ingredients");
  }

  public static int calculateTotalCalories(int carbWeight, int proteinWeight, int fatWeight) {
    int carbCalsPerGram = 4;
    int proteinCalPerGram = 4;
    int fatCalPerGram = 9;

    int totalCals = carbWeight * carbCalsPerGram + proteinWeight * proteinCalPerGram + fatWeight * fatCalPerGram;

    System.out.println(totalCals);
    return totalCals;
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
