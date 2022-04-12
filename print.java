import java.io.PrintWriter;
import java.io.IOException;
public class print
{
    public static void main(String[] args) throws IOException
    {
        // Open the file.
        PrintWriter out = new PrintWriter("storage.txt"); // Step 2

        // Write the name of four oceans to the file
        out.println("Atlantic");   // Step 3
        out.println("Pacific");
        out.println("Indian");
        out.println("Arctic");

        // Close the file.
        out.close();  // Step 4

        String text = "hi there this is a test";
        for(int index = 0; index < text.length(); index++){
            char letter = text.charAt(index);

            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                System.out.print("*");
            } else {
                System.out.print(letter);
            }
        }

        if(text.contains("there")){
            System.out.println("\ncontained!");
        }
    }
}