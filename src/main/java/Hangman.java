import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Hangman{
        
    String mystreyword;
    StringBuilder currentGuess;
    ArrayList<Character> previousGuesses = new ArrayList<>();

    int maxTries = 6;
    int currentTry = 0;

    ArrayList<String> dictionary = new ArrayList<>();
    private static FileReader fileReader;
    private static BufferedReader bufferedReader;

    public Hangman() throws IOException {
        initializeStream ();
        mystreyword = pickWord();
        currentGuess = initializeCurrentGuess();
    }
    public void initializeStream () throws IOException{
        try{
            File inFile = new File("dictionary.txt");
            fileReader = new FileReader(fileReader);
            bufferedFileReader = new BufferedReader(bufferedReader);
            String currentLIne =  bufferedFileReader.readLine();
            while (currentLine != null) {
                dictionary.add(currentLine);
            }
            bufferedFileReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Could not init streams");
        }  
        }

        public String pickWord() {
            Random rand = new Random();
            int wordIndex = Math.abs(rand.nextInt()) % dictionary.size();
            return dictionary.get(wordIndex);
        }
         
        // _ A _ _ _ _ _


        public StringBuilder initializeCurrentGuess() {
            StringBuilder current = new StringBuilder();
            for (int i=0; i < mystreyword.length() *2; i++) {
                if (i % 2 == 0) {
                    current.append("_");
             } else {
                current.append("");
            }
        }
        return current;
    }


public String getFormalCurrentGuess() {
    return "Current Guess: " + currentGuess.toString(); 
}

    // "" _ _ _ _ _\n"+
    // "|          |\n"+
    // "|          0\n" +
    // "|         /| \\ \n"+
    // "|          |\n"  +
    // "|         / \\  \n" +
    // "|\n"+
    // "|\n";
    

    public String drawPicture() {
        switch(currentTry) {
            case 0: return noPersonDraw();
            case 1: return addHeadDraw();
            case 2: return addBodyDraw();
            case 3: return addOneArmDraw();
            case 4: return addFirstLegDraw();
            default: return addFullPerson();
        }
    }

	private String noPersonDraw() {
      return     "" _ _ _ _ _\n"+
                 "|          |\n"+
                 "|          \n" +
                 "|          \n"+
                 "|          \n"  +
                 "|           \n" +
                 "|\n" +
                 "|\n";
    }

    private String addHeadDraw() {
        return   "" _ _ _ _ _\n"+
                "|        |\n"+
                "|        0\n" +
                "|           \n"+
                "|          \n"  +
                "|           \n" +
                "|\n" +
                "|\n"; 
    }

    private String addBodyDraw() {
        return   "" _ _ _ _ _\n"+
                "|        |\n"+
                "|        0\n" +
                "|        |  \n"+
                "|        |\n"  +
                "|          \n" +
                "|\n" +
                "|\n"; 
        
    }

    private String addOneArmDraw() {
            return  "" _ _ _ _ _\n"+
                    "|        |\n"+
                    "|        0\n" +
                    "|        |\ \n"+
                    "|        |\n"  +
                    "|          \n" +
                    "|\n" +
                    "|\n"; 
    }


	private String addSecondArmDraw() {
            return  "" _ _ _ _ _\n"+
                    "|        |\n"+
                    "|        0\n" +
                    "|       /|\ \n"+
                    "|        |\n"  +
                    "|          \n" +
                    "|\n" +
                    "|\n"; 	
    }

    private String addFirstLegDraw() {
        return  "" _ _ _ _ _\n"+
                    "|        |\n"+
                    "|        0\n" +
                    "|       /|\ \n"+
                    "|        |\n"  +
                    "|       /  \n" +
                    "|\n" +
                    "|\n"; 	 
    }

    private String addFullPerson() {
return  "" _ _ _ _ _\n"+
        "|          |\n"+
        "|          0\n" +
        "|         /|\ \n"+
        "|          |\n"  +
        "|         / \ \n" +
        "|\n" +
        "|\n"; 	 
    }
}