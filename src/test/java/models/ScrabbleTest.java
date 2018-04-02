package models;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ScrabbleTest {
  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }

  @Test
  public void calculateScore_return1ForAnyVowelOrLNRSTLetters_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
    assertEquals(expected, testScrabble.calculateScore("e"));
    assertEquals(expected, testScrabble.calculateScore("i"));
    assertEquals(expected, testScrabble.calculateScore("o"));
    assertEquals(expected, testScrabble.calculateScore("u"));
    assertEquals(expected, testScrabble.calculateScore("l"));
    assertEquals(expected, testScrabble.calculateScore("n"));
    assertEquals(expected, testScrabble.calculateScore("r"));
    assertEquals(expected, testScrabble.calculateScore("s"));
    assertEquals(expected, testScrabble.calculateScore("t"));
  }

  @Test
  public void calculateScore_return2ForDGLetters_2() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("d"));
    assertEquals(expected, testScrabble.calculateScore("g"));
  }

  @Test
  public void calculateScore_return3ForBCMPLetters_3() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 3;
    assertEquals(expected, testScrabble.calculateScore("b"));
    assertEquals(expected, testScrabble.calculateScore("c"));
    assertEquals(expected, testScrabble.calculateScore("m"));
    assertEquals(expected, testScrabble.calculateScore("p"));
  }

  @Test
  public void calculateScore_return4ForFHVWYLetters_4() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 4;
    assertEquals(expected, testScrabble.calculateScore("f"));
    assertEquals(expected, testScrabble.calculateScore("h"));
    assertEquals(expected, testScrabble.calculateScore("v"));
    assertEquals(expected, testScrabble.calculateScore("w"));
    assertEquals(expected, testScrabble.calculateScore("y"));
  }

  @Test
  public void calculateScore_return5ForKLetters_5() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 5;
    assertEquals(expected, testScrabble.calculateScore("k"));
  }

  @Test
  public void calculateScore_return5ForJXLetters_8() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 8;
    assertEquals(expected, testScrabble.calculateScore("j"));
    assertEquals(expected, testScrabble.calculateScore("x"));
  }

  @Test
  public void calculateScore_return5ForQZLetters_10() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 10;
    assertEquals(expected, testScrabble.calculateScore("q"));
    assertEquals(expected, testScrabble.calculateScore("z"));
  }

  @Test
  public void calculateScore_returnScoreForAnyWord_int() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 4;
    assertEquals(expected, testScrabble.calculateScore("tell"));
  }

  @Test
  public void calculateScore_returnResultForWordsRegardlessOfCase_int() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 4;
    assertEquals(expected, testScrabble.calculateScore("TeLL"));
  }
}