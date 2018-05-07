    import java.util.ArrayList;
    import java.util.Scanner;


    public class Hangman {

        
       static public void guess(String word, int life) {

        char[] filler = new char[word.length()];
        int i=0;
        while(i< word.length()) {
            filler[i]='_';
            if(word.charAt(i)=='_'){
                filler[i]='_';
            }
            i++;
        }
        System.out.println(filler);
        System.out.println("Life remaining=" + life);

        Scanner scanner = new Scanner(System.in); // to read characters

        ArrayList<Character> l=new ArrayList<Character>();
        ArrayList<String> dictionary = new ArrayList<>();

        while(life>0){
            char x=scanner.next().charAt(0);  // character input by the user

            if(l.contains(x)) {
                System.out.println("Already entered");
                continue;                      // while loop continues
            }

            l.add(x);

            if(word.contains(x+"")) {
                for(int y=0;y<word.length();y++){   //this loop will check all indexes for
                    if(word.charAt(y)==x) {         //the character and will replace '_' by
                        filler[y]=x;                // the character
                    }
                }
            }
            else {
                life--;                              //life decreases if the character entered  isn't there in  word
            }

            if(word.equals(String.valueOf(filler))) {       //checking filler equals word
                System.out.println(filler);
                System.out.println("You won!!!");
                break;
            }

            System.out.println(filler);
            System.out.println("Life remaining=" + life);
        }
            if(life==0) {
                System.out.println("You lose!");
            }

    }


    public static void  main(String[] args) {

        String word="welcome to my hangman game"; //word to be guessed
        int life=5; //number of chances 
        guess(word,life);
    }
}
   