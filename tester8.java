import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;

public class tester8 {
    
    public static void main(String[] args) throws IOException, AWTException, InterruptedException  {
        /* insane pog def save 
        attempt to find a way to make a function to press keys instead of having to type keypress and keyrelease
        String command = "notepad.exe";
        Runtime run = Runtime.getRuntime();
        run.exec(command);
        */ 
        Robot r = new Robot();
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch(Exception e) {
            System.out.println("An error has occured. Terminating the program.");
            /*
            String command = "shutdown -s -t 00";
            Runtime run = Runtime.getRuntime();
            run.exec(command);
            */
        }
    }
}