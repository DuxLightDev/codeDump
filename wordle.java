import java.util.Scanner;

public class wordle {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String guess = scan.nextLine();

        String answer = "poggy";

            if(valid(guess) == true){

                if(guess.equals(answer)){
                    System.out.println("Correct!");

                } else{
                    for(int i = 0; i < guess.length(); i++){
                        char rune = answer.charAt(i);
                        char letter = guess.charAt(i);
                        if(rune == letter){
                            System.out.println(letter + " is at the correct position");
                        } else if(answer.contains(Character.toString(letter)) && rune != letter){
                            System.out.println("contains " + letter);
                        } else {
                            System.out.println("doesn't contain " + letter);
                        }
                    }
                }

            } else {
                System.out.println("crap");
                
        }
    }

    public static boolean valid(String word){
        if(word.length() == 5){
            return true;
        } else {
            return false;
        }
    }
}


/* pseudocode
first, check if word is not equal to 5 characters
if it is, then like ask for new word, so maybe use method?
if it is five letters
first check if word is equal to answer
if not, then check if answer contains each letter in the word
if they do then lit up at yellow,
however, have to figure out a way to check if like you have two of the same letter does either word contain double/does answer have double letter
then compare each individual character in each word, corresponding with each position
profit
design gui or graphics or something idk, i don't use graphics
*/