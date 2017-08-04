import java.util.Scanner;
import java.util.Random;

public class HangMan {
  public static void main ( String[] args ) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String[] guesses = {"reddit", "programming", "fruit", "donut"};
    // MAIN GAME LOOP.
    boolean weArePlaying = true;
    while(weArePlaying) {
      System.out.println("Welcome to my Game of Hangman");
      char[] randomWordToGuess = guesses[random.nextInt(guesses.length)].tocharArray();// This method Breaks down a word into a single Character.
      int amountOfGuesses = randomWordToGuess.length; //100
      char[] playerGuess = new char[amountOfGuesses]; //This is where we save the users input. e.g __ _r_ __ _p_

      for (int i = 0; i < playerGuess.length; i++) {
        playerGuess[i] = "__";
      }
      //THIS IS THE LOOP WHERE THE GUESSING TAKES PLACE.
      boolean wordIsGuessed = false;
      int tries = 0;

      while (!wordIsGuessed && tries != AmountOfGuesses) {
        System.out.print("Current guesses: ");
        printArray(playerGuess);
      }

    }
    System.out.println("Game Over.");

  }
  public static void printArray(char[] array) {
    for (int i = 0; i < playerGuess.length; i++) {
      System.out.print(array[i]);
    }
  }
}
