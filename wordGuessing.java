import java.util.Scanner;

public class wordGuessing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String secret = "";
        String displayWord = "";
        int lives = 11;
        String guess = "";
        int charIndex;
        String alreadyGuessed = "";
        int wordsGuessed = 0;
        String replay = "";

        do{
            secret = ""; //clearing secret variable
            System.out.println("\nInput your secret word here:");
            secret = sc.nextLine();

            System.out.print(String.format("\033[%dA",1)); // Move up
            System.out.print("\033[2K"); // Delete line

            displayWord = ""; // clearing displayWord
            for(int i = secret.length(); i > 0; i--){
                displayWord += "_";
            }
            System.out.println(displayWord);

            alreadyGuessed = "";
            wordsGuessed = 0;
            lives = 11; // resetting variables

            while(lives > 0){
                guess = sc.nextLine();
                if(guess.length() < 2){
                    if(!alreadyGuessed.contains(guess)){
                        alreadyGuessed += guess;
                        alreadyGuessed += " ";
                        if(secret.contains(guess)){
                            
                            // charIndex = secret.indexOf(guess);
                            // System.out.println(charIndex);
                            charIndex = -1;
                            while ((charIndex = secret.indexOf(guess, charIndex + 1)) != -1) {

                                char[] displayChars = displayWord.toCharArray();
                                displayChars[charIndex] = guess.charAt(0);
                                displayWord = String.valueOf(displayChars);
                                // System.out.print(charIndex + " ");
                            }
                            System.out.println(displayWord);
                            System.out.println("");
                            


                        } else {
                            System.out.println("Incorrect!\n");
                            lives--;
                        }

                    } else {
                        System.out.println(alreadyGuessed + " You have already guessed this letter.\n");
                    }

                } else if(guess.length() != secret.length()){
                    System.out.println("Try again!\n");
                }

                if(guess.length() == secret.length()){
                    if(guess.equals(secret)){
                        displayWord = guess;
                    } else {
                        wordsGuessed++;
                        if(wordsGuessed == 1){
                            lives -= 2;
                        } else if(wordsGuessed == 2){
                            lives = 0;
                        }
                    }
                }

                if(displayWord.equals(secret)){
                    System.out.println("\nYou win, and you had " + lives + " lives left.");
                    break;
                } else {
                    System.out.println("You have " + lives + " lives left.\n");
                }
                
                if(lives == 0){
                    System.out.println("\nGame over!");
                }
            }

            System.out.println("\nEnter quit to quit!");
            replay = sc.nextLine().toLowerCase();

        } while(!replay.equals("quit"));

        System.out.println("\nThank you for playing!");

        sc.close();
    }
}
