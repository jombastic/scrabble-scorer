package models;

import java.lang.reflect.Array;

public class Scrabble {
  public Integer calculateScore(String word) {
    String lowerCaseWord = word.toLowerCase();
    String[] score1Letters = {"a", "e", "i", "o", "u", "l", "n", "r", "s", "t"};
    Integer result = null;
    for (String letter : score1Letters) {
      if (lowerCaseWord.equals(letter)) {
        result = 1;
      }
    }
    return result;
  }
}
