package DSA.Recursion;
import java.util.Scanner;

// recurence relation:  T(n) = T(b/2)+1
// T(n) = O(log b) 

class powerclc1 {
    static long powerOptimize (int a, int b) {

        // bace condition
        if (b==1) {
            return a;
        }
        
        long res = powerOptimize(a, b/2);
        long finalres = res * res;         
        if (b%2!=0) {
            return a * finalres;
        }
        return finalres;

    }
}


public class PowerOptimize {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);    
        int a = sc.nextInt();
        int b = sc.nextInt();

        long result = powerclc1.powerOptimize(a, b);
        System.out.println(result);
        sc.close();
    }   
}
