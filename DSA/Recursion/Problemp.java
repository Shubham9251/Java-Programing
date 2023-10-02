package DSA.Recursion;
import java.util.Scanner;

// we have n number of stair and two fixed steps at a time if 1 stair or 2 stair,
// so find the number of way to reach final or last stair.

public class Problemp {
    
    static int fivo (int n) {

        if (n<=1) {
            return n;
        }

        return fivo(n-1) + fivo(n-2);
    }
    
    public class fibonacci {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter stairs: ");
            int n = sc.nextInt();
    
            int res = result.fivo(n+1);
            System.out.println(res);
    
            sc.close();
        }
    }
    
}
