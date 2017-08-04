import java.util.Scanner;
import java.util.Random;

public class HangMan {
  public static void main ( String[] args ) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String[] guesses = {"reddit", "programming", "fruit", "donut"};

    boolean weArePlaying = true;
    while(weArePlaying) {
      System.out.println("Welcome to my Game of Hangman");
      char[] randomWordToGuess = guesses[random.nextInt(guesses.length)].tocharArray();// This method Breaks down a word into a single Character.
      int amountOfGuesses = randomWordToGuess.length; //100
      char[] playerGuess = new char[amountOfGuesses]; //This is where we save the users input. e.g __ _r_ __ _p_

      for (int i = 0; i < playerGuess.length; i++) {

      }


    }
    System.out.println("Game Over.");

  }
}
