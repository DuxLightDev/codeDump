import java.util.Scanner;
import java.math.BigInteger;

public class rsa {
    public static void main(String [] args) {
        BigInteger Z;
        Z = BigInteger.valueOf(0);
        exponent(Z);
        System.out.println("method returned: " + exponent(Z));

        // for primes https://www.geeksforgeeks.org/java-program-to-check-if-a-number-is-prime-or-not/
        // for length https://www.geeksforgeeks.org/compare-two-strings-in-java/
    }

    public static BigInteger exponent(BigInteger num){
        int num1 = 2;
        int num2 = 64;
        BigInteger X;
        X  = BigInteger.valueOf(num1 * num1);

        for(int i = 2; i < num2; i++){
            X = X.multiply(BigInteger.valueOf(num1));
            System.out.println(X);
        }

        int length = X.bitLength();

        System.out.println("final x = " + X);
        System.out.println("bit length of X is:" + length);

        return X;
        /*
        int y = 133;
        BigInteger mod = X.mod(BigInteger.valueOf(y));
        System.out.println("rsa key/whatever is " + mod);
        */        
    }
}
