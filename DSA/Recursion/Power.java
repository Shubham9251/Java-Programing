package DSA.Recursion;
import java.util.Scanner;

// T(n) = O(b) &&  S(n) = O(b)

class powerclc {
    static long power (int a, int b) {

        // bace condition
        if (b==1) {
            return a;
        }
       
        return a * power(a, b-1);         
    }
}

public class Power {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);    
        int a = sc.nextInt();
        int b = sc.nextInt();

        long result = powerclc.power(a, b);
        System.out.println(result);
        sc.close();
    }
}
