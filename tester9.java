import java.util.Scanner;

public class tester9 {
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        int students = 0;

        while (students <= 0) {

            try {
               System.out.print("Enter the number of students: ");
   
               students = input1.nextInt();
   
            }
   
            catch (java.util.InputMismatchException e) {
                input1.next();
            }
        } 

        System.out.println(students);

        input1.close();
    }
}
