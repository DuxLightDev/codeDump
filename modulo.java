import java.util.Scanner;

public class modulo {
    public static void main(String[] args){
        while(true) {
            Scanner sc = new Scanner(System.in);
            int key = sc.nextInt();
            int key2 = sc.nextInt();

            String message = (key + " divided by " + key2 + " equals: " + Math.round(key/key2) + " with a remainder of " + key%key2 + ". :)");
            char letter;
            for(int i = 0; i < message.length(); i++){
                letter = message.charAt(i);
                System.out.print(letter);
                try{
                    Thread.sleep(100);
          
                    } catch(InterruptedException e) {
          
                    }
            }
            System.out.println("");
        }
    }
}