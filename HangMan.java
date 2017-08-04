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
      char[] randomWordToGuess = guesses[random.nextInt(guesses.length)].toCharArray();// This method Breaks down a word into a single Character.
      int amountOfGuesses = randomWordToGuess.length; //100
      char[] playerGuess = new char[amountOfGuesses]; //This is where we save the users input. e.g __ _r_ __ _p_

      for (int i = 0; i < playerGuess.length; i++) {
        playerGuess[i] = '_';
      }
      //THIS IS THE LOOP WHERE THE GUESSING TAKES PLACE.
      boolean wordIsGuessed = false;
      int tries = 0;

      while (!wordIsGuessed && tries != amountOfGuesses) {
        System.out.print("Current guesses: ");
        printArray(playerGuess);
        System.out.printf("You have %d tries left.\n", amountOfGuesses - tries);
        System.out.println("Enter a single character");//THIS IS WHERE YOU PROMPT THE USER FOR INPUT
        char input = scanner.nextLine().charAt(0);// THIS METHOD ONLY TAKES THE FIRST CHARACTER.
        tries ++;//ThIS IS WHERE YOU INCREAMENT USERS TRIES(if user inputs a "minus" we stop the game.)
        if (input == '_') {
          weArePlaying = false;
          wordIsGuessed = true;
        } else {
          for (int i = 0; i < randomWordToGuess.length; i++) {
            if (randomWordToGuess[i] == input) {
               playerGuess[i] = input;
            }
          }
          if (isTheWordGuessed(playerGuess))  {  //WE CHECK IF THE USER HAS COMPLETED THE WORD, IF SO WE PASS THE PLAYER GUESS ARRAY.
            wordIsGuessed = true;
            System.out.println("Congratulations you Won!");
          }
        }
      }
        if (!wordIsGuessed) System.out.println("You ran out of guesses :/"); ///CHECKS IF THE WORD IS STILL NOT GUESSED BUT RAN OUT OF TRIES
        System.out.println("Do you want to play another game? (Yes/No)");
        String anotherGame = scanner.nextLine();
        if (anotherGame.equals("no"))  weArePlaying = false; // HERE WE ASK THE USER IF THEY WANT TO PLAY ANOTHER GAME.
    }

    System.out.println("Game Over.");

  }
  public static void printArray(char[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
  public static boolean isTheWordGuessed(char[] array) {  //THIS IS WHERE YOU IMPLEMENT THE GUESSED WORD.
    for (int i = 0; i < array.length; i++) {
      if (array[i] == '-') return false;
    }
    return true;
  }
}
