import java.util.Scanner;

public class gameLogic {
    public static void main(String[] args){
        String choice = gameChoice("What gamemode would you like to play?");

        if(choice.equals("single")) {

        } else if(choice.equals("multi")) {

        } else if(choice.equals("quit")) {
            System.out.println("\nThank you for playing. Have a great day!");
        }
        // System.out.println(choice);

        /*
        singleplayer:
        acquire secret word
        check if guess is in secret word
        
        */
        
    }

    public static String gameChoice(String x){
        Scanner sc = new Scanner(System.in);
        String choice = "";

        do {
            System.out.print("\n" + x + "\n");
            choice = sc.nextLine().toLowerCase();
            // System.out.println("\nhello");
            // System.out.println(choice + "\n");
        } while (!choice.equals("single") && !choice.equals("multi") && !choice.equals("quit"));
        
        sc.close();
        return choice;
    }

    public static void singleplayer(){

    }

    public static void multiplayer(){
        
    }
}