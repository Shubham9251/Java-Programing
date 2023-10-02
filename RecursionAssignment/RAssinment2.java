package RecursionAssinment;
import java.util.Scanner;

//Given a number n. Find the alternate signs sum of natural numbers till n but with  using recursion.
public class RAssinment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        // Without recursion....
        /*long odd=0, even=0;
        while (n>0) {
            if (n%2==0) {
                even += n;
            }
            else{
                odd += n;
            }
            n--;
        }
        System.out.println(odd-even);*/

        // With recursion....
        long rs = AlternativSum(n);
        System.out.println(rs);
        sc.close();
    }    

    static long AlternativSum(long n) {
        // Base condition......
        if (n==0) {
            return 0;
        }
        // Recursive call....
        if (n%2==0) {
            return AlternativSum(n-1) - n;
        }
        else {
            return n + AlternativSum(n-1);
        }
         
    }
}
