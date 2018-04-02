import models.Scrabble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
  public static void main(String[] args) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Scrabble scrabble = new Scrabble();
    boolean repeat = true;
    while (repeat) {
      System.out.println("Please enter a word:");
      try {
        String word = bufferedReader.readLine();
        int score = scrabble.calculateScore(word);
        System.out.println("The scrabble score for the word \"" + word + "\" is " + score + ".");
      } catch (IOException e){
        e.printStackTrace();
      }
    }
  }
}
