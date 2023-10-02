package DSA.Recursion;
import java.math.BigInteger;
import java.util.Scanner;

public class PowerBigInteger {
    public static BigInteger powerFiend(BigInteger a, int b) {
        BigInteger finalResult, result;

        // base condition..
        if (b == 1) {
            return a;
        }
        
        // function calling...
        result = powerFiend(a, b/2);
        finalResult = result.multiply(result);
        if (b%2!=0) {
            return a.multiply(finalResult);
        }
        
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number a and b :");
        BigInteger a = sc.nextBigInteger();
        int b = sc.nextInt();

        BigInteger result = powerFiend(a, b);
        System.out.println(result);
        sc.close();
    }
}
