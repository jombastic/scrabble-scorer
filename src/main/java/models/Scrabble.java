package models;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class Scrabble {
  public Integer calculateScore(String word) {
    char[] inputedCharacters = word.toLowerCase().toCharArray();

    Map<Character, Integer> allLetters = new HashMap<>();
    allLetters.put('a', 1);
    allLetters.put('e', 1);
    allLetters.put('i', 1);
    allLetters.put('o', 1);
    allLetters.put('u', 1);
    allLetters.put('l', 1);
    allLetters.put('n', 1);
    allLetters.put('r', 1);
    allLetters.put('s', 1);
    allLetters.put('t', 1);
    allLetters.put('d', 2);
    allLetters.put('g', 2);

    int result = 0;
    for (char character : inputedCharacters) {
      if (allLetters.containsKey(character)) {
        result = allLetters.get(character);
      }
    }
    return result;
  }
}
