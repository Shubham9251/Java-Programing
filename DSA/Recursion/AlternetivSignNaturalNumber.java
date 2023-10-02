package DSA.Recursion;
import java.util.Scanner;
// if you start with positive sign 

public class AlternetivSignNaturalNumber {
    static int SumAlternetivSign(int n) {
        
        // base caondition..
        if (n == 0) {
            return 0;
        }
        
        // function calling....
        else {
            if (n%2==0) {
                return SumAlternetivSign(n-1)-n;
            }
            else {
                return SumAlternetivSign(n-1)+n;
            }
        }    
    }


    /*static void PrintAlternetivSign(int n) {
        
        // base caondition..
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        
        // function calling....
        else {
            if (n%2==0) {
                PrintAlternetivSign(n-1);
                System.out.print(-n + " ");
            }
            else {
                PrintAlternetivSign(n-1);
                System.out.print(n + " ");
            }
        }    
    }*/
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        // PrintAlternetivSign(n);

        int sum = SumAlternetivSign(n);
        System.out.println(sum);
        
        
        sc.close();
    }
}
