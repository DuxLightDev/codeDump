import java.util.Locale;
import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.io.PrintWriter;
import java.io.IOException;

public class exponent {
    public static void main(String [] args) throws IOException
    {
        Scanner console = new Scanner(System.in);
        BigInteger Z;
        System.out.println("Insert your first number:");
        Z = BigInteger.valueOf(console.nextInt());
        BigInteger N;
        System.out.println("Insert the number " + Z + " will be raised to the power of:");
        N = BigInteger.valueOf(console.nextInt());
        BigInteger Y;
        Y = exponents(Z, N);

        console.close();

        String numText = NumberFormat.getNumberInstance(Locale.US).format(Y);

        String scientific = NumberFormat.getNumberInstance(Locale.US).format(Y);


        PrintWriter out = new PrintWriter("storage.txt");
        out.println(Y);
        out.println(numText);
        out.println(scientific);
        out.close();

        // for primes https://www.geeksforgeeks.org/java-program-to-check-if-a-number-is-prime-or-not/
        // for length https://www.geeksforgeeks.org/compare-two-strings-in-java/
    }

    public static BigInteger exponents(BigInteger num, BigInteger num2){
        int test = 2;
        int test2 = 2048;
        BigInteger X;
        X  = (num.multiply(num));

        for(int i = 2; BigInteger.valueOf(i).compareTo(num2)<0; i++){
            X = X.multiply(num);
            System.out.println(X);
        }   

        int length = X.bitLength();

        System.out.println("final x = " + X);
        System.out.println("bit length of X is: " + length);

        return X;
        /*
        int y = 133;
        BigInteger mod = X.mod(BigInteger.valueOf(y));
        System.out.println("rsa key/whatever is " + mod);
        */        
    }
}
