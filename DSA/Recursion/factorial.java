package DSA.Recursion;
import java.util.Scanner;

// recurence relation:  T(n) = T(n-1)+1
// T(n) = O(n) &&  S(n) = O(n)

class solution {

    static int fact(int n) {
        // base condition...
        if (n==0 || n==1) {
            return 1;
        }
        // recursiv call...
        return n * fact(n-1);
    }
}
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int result = solution.fact(n);
        System.out.println(result);
        sc.close();
    }
}
