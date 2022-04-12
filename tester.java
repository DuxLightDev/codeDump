import java.util.Scanner;

class tester {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        char letter;
        int key = 3;
        String encrypted = "";
        System.out.println(text);
        for(int i = 0; i < text.length(); i++){
            letter = text.charAt(i);
            letter = (char)(letter + key);
            encrypted += (letter);
        }

        for(int x = encrypted.length(); x > 0; x--){
            char letter2;
            letter2 = encrypted.charAt(x);
            letter2 = (char)(letter2 - key);
            String message = "";
            message += (letter2);
        }
        
        System.out.println(encrypted);
        scan.close();
    }
}