package DSA.Recursion;
import java.util.Scanner;

public class SumOfNumberDigits {
    public static long sumOfDigits(long num) {

        // base condition...
        if (num == 0) {
            return 0;
        }

        // function calling...
        int reminder = (int) (num % 10);
        
        return reminder + sumOfDigits(num/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        long num = sc.nextInt();

        long result = sumOfDigits(num);
        System.out.println("The sum is : " + result);
        sc.close();
    }
}
