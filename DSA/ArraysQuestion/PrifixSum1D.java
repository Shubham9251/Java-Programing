package DSA.ArraysQuestion;
import java.util.*;

public class PrifixSum1D {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:  ");
        n = sc.nextInt();

        int []arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the first and last index for prifix sum : ");
        int f = sc.nextInt();
        int l = sc.nextInt();

        System.out.println("The sum of Given range is : " + prifix1DSum(arr, f,l));
        sc.close();
    }

    public static int prifix1DSum(int[] arr, int f, int l) {
     
        for (int i = 1; i < arr.length; i++) {
            
            arr[i] = arr[i-1]+arr[i];
        }

        int fs = arr[l-1];
        if (f != 1) {
            
            int iis = arr[f-2];
            return fs - iis;  
        }
        else {

            return fs;
        }
    }
}
