package com.joey.activity;

public class Rule {
  private int divisor;
  private String word;

  public Rule() {
  }

  public Rule(int divisor, String word) {
    this.divisor = divisor;
    this.word = word;
  }

  public int getDivisor() {
    return divisor;
  }

  public void setDivisor(int divisor) {
    this.divisor = divisor;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }
}
