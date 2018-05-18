

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class App {
public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    Hangman testHangman = new Hangman();
    Random myRand = new Random();


    List<String> wordsToGuess= Arrays.asList("Ronaldo", "Hazard", "Messi", "Pogba");


    String pickedWord = wordsToGuess.get(myRand.nextInt(wordsToGuess.size()));

    String dashed = testHangman.replaceWordWithDashes(pickedWord);
    System.out.println(dashed);


    while(!pickedWord.equals(testHangman.finalGuess)) {
        System.out.println(testHangman.finalGuess);
        char input = myScanner.nextLine().charAt(0);
        testHangman.replaceTheDashesWithLetters(input, pickedWord);
    }

}
}