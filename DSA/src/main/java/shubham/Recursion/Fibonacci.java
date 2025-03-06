package main.java.shubham.Recursion;
import java.util.Scanner;

// fibonacci number: 0 1 1 2 3 5 8 13 21.......
// recurrence relation:  T(n) = T(n-1)+T(n-2)
// T(n) = O(2^n) &&  S(n) = O(n)
class result {
    static int fivo (int n) {

        if (n<=1) {
            return n;
        }

        return fivo(n-1) + fivo(n-2);
    }
}
public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int res = result.fivo(n);
        System.out.println(res);

        sc.close();
    }
}
