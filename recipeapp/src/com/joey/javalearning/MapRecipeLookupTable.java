package com.joey.javalearning;

import java.util.Map;
import java.util.HashMap;

public class MapRecipeLookupTable implements RecipeLookupTable {
  private Map<Integer, Recipe> idToRecipe = new HashMap<>();

  public Recipe lookupRecipeById(final int id) {
    return idToRecipe.get(id);
  };

  @Override
  public void addRecipe(final Recipe recipeToAdd) {
    int id = recipeToAdd.getId();
    if (idToRecipe.containsKey(id)) {
      throw new IllegalArgumentException("duplicate recipe");
    }

    idToRecipe.put(id, recipeToAdd);
  };

  public void clear() {
    idToRecipe.clear();
  };
}
