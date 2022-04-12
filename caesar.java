import java.util.Scanner;

class caesar {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 0;
        while(x == 0){
            System.out.println("Enter encrypt or decrypt:\n");
            String decision = sc.nextLine();

            if(decision.equals("encrypt")){
                encrypt();
                x++;
            } else if(decision.equals("decrypt")){
                decrypt();
                x++;
            } 
        }
    }

    public static void decrypt() {
        System.out.println("decrypt");
        
    }

    public static void encrypt() {
        System.out.println("encrypt");
    }
}