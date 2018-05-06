import java.util.Scanner;

public class HangmanApp{
    public static void main (String [] args){
        // How do we play the game
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to hangman! I will pick a word and you will try to guess it character by character." + "If you guess wrong 6 times i win, if can guess it before then you win." + "Are you ready? I hope so because i am.");
        System.out.println("");
        System.out.println("I have picked my word and below is a picture,"+"that is your current guess which starts off as nothing,"+"Everytime you guess incorrectly i add a body part to that picture,"+"When there is a full person, you lose");

        // Allows for multiple games
        boolean doYouWanttoPlay = true;
        while doYouWanttoPlay {
            // Setting up the game
        }
            while (!gameOver){
                // playing the game
            }

            // Play again or no
            System.out.println(""); 
            System.out.println("Do you want to play another game? If you do, enter Y.");
            Character response = (scanner.next().toUpperCase()).charAt(0);
            doYouWanttoPlay = (response == 'Y');


        
    }
}