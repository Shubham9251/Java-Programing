package RecursionAssinment;
import java.util.*;

class RAssinment1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();

        // Without recursion....
        /*long result = 0;
        while (n > 0) {
            int r = (int)(n%10);
            result = result + r;
            n = n/10;
        }
        System.out.println(result);*/
        
        // With recursion....
        long result = sum(n);
        System.out.println(result);
        sc.close();
    }

    static long sum(long n) {
        // Base condition......
        if (n==0) {
            return 0;
        }
        // Recursive call....
        
        return (n%10 + sum(n/10));

    } 
}