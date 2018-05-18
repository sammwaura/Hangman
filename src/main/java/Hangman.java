
   
import java.util.List;
import java.util.Random;

import org.omg.CORBA.INV_FLAG;

import java.util.Arrays;

public class Hangman{
  String finalGuess="";
  String pickedWord="";


  //the array that holds all the words in the game  
List<String> wordsToGuess = Arrays.asList("Ronaldo", "Hazard", "Messi", "Pogba");
// intializing the random Object
    Random myRand = new Random();
    //Randomly picking a word from the array
    String wordPicked = wordsToGuess.get(myRand.nextInt(wordsToGuess.size()));
    char [] wordArray = wordPicked.toCharArray();
    //the method that ensures that a word is actually being gotten from the array.
    public String findWord(String select){
        return wordPicked;
    }
    //the method that replaces the words with blank dashes
   public String replaceWordWithDashes(String dashes) {
     //Randomly picking a word from the array
     String r = "";
       //Spliting the word into an array of strings
     char wordArray[] =dashes.toCharArray();
       for (int das = 0; das < wordArray.length; das++) {
            wordArray[das]='-';        
       }
        for(int fin=0; fin<wordArray.length; fin++){
          //converting the array into a string
           r= r+ wordArray[fin];
        }
        pickedWord =r;
          return pickedWord;
   }
        //method to replace the dashes with the correct letter
        public String replaceTheDashesWithLetters(char letter,String selectedWord) {
          String dashedWord = replaceWordWithDashes(selectedWord);
          char [] playerguess = dashedWord.toCharArray();
          StringBuilder result = new StringBuilder();
          char[] choosen = selectedWord.toCharArray();
                   
          for (int i = 0; i < choosen.length; i++) {
            if (playerguess[i]=='-') {
              if (choosen[i]==letter) {
                result.append(letter);
              }else{
                result.append('-');
              }        
            }else{
              result.append(playerguess[i]);
            }     
            
          }
            
            finalGuess = result.toString();
            return finalGuess;
        }
        
          
        

}
   