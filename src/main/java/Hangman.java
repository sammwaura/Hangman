
    import java.util.Random;
    import java.util.Scanner;


    public class Hangman {
        public static void main (String[] args) { 
            Scanner scanner = new Scanner(System.in); // to read character
            Random random = new Random();
            String[] guess ={"Ronaldo", "Hazard", "Messi"};          

         boolean weArePlaying = true;
            while (weArePlaying) {
            System.out.println("Yo!Welcome to my hangman game!"); // Ronaldo -> R,o,n,a,l,d,o
            char[]  randomWordToGuess = guess[random.nextInt(guess.length)].toCharArray();
            int amountofGuess = randomWordToGuess.length; //9
            char[] playerGuess = new char[amountofGuess]; 

            for (int i=0; i< playerGuess.length; i++); {
                playerGuess[i] = '_';

            }

            boolean wordIsGuessed = false;
            int tries = 0;

            while (!wordIsGuessed && tries !=amountofGuess) {
                System.out.print("CurrentGuess: ");
                printArray(playerGuess);
                System.out.printf("You have %d tries left.\n", amountofGuess - tries);
                System.out.println("Enter a single character ");
                char input = scanner.nextLine().charAt(0);
                tries++;
                
                if (input == '-') {
                    weArePlaying = false;
                    wordIsGuessed = true;
                } else {
                          for (int i=0; i< randomWordToGuess.length; i++); {
                            if (randomWordToGuess[i] == input) {
                                playerGuess[i] = input;
                            }
                        }

                        if (isTheWordGuessed(playerGuess)) {
                            wordIsGuessed = true;
                            System.out.println("Congratulations you won!");
                        }
                    }
            }
            if (!wordIsGuessed) System.out.println("You ran out of guess: /");
            System.out.println("Do you want to play another game?(yes/no)");
            String anotherGame = scanner.nextLine();
            if (anotherGame.equals("no")) weArePlaying = false;


        } 
                        
        System.out.println("Game Over!");

        public static void printArray(char[] array) {
            for (int i =0; i < array.length; i++) {
                System.out.print(array[i] + "");
            }
            System.out.println();
        }

        public static boolean isTheWordGuessed(char[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == '_') return false;
            }
            return true;
        }
    }
}
   