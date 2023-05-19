package com.joey.javalearning;

public interface RecipeLookupTable {
  Recipe lookupRecipeById(int id);

  void addRecipe(Recipe recipeToAdd);

  void clear();
}
