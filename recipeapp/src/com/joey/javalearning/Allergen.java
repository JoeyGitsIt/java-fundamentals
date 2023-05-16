package com.joey.javalearning;

public enum Allergen {
  WHEAT("Contains wheat"),
  PEANUT("Contains peanut"),
  SHELLFISH("Contains shellfish"),
  FISH("Contains fish"),
  SOY("Contains soy"),
  DAIRY("Contains dairy");

  private String warning;

  public String getWarning() {
    return warning;
  }

  private Allergen(String warning) {
    this.warning = warning;
  }
}
