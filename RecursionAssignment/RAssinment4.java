package RecursionAssinment;
import java.util.Scanner;

public class RAssinment4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Sum of arr is: " + SumOfArr(arr));
        sc.close();
    }

    static int i = -1;
    static int SumOfArr (int []arr) {
        // Base condition......
        if (i == arr.length-1) {
            return 0;
        }
        i++;
        // Recursive call....
        return arr[i] + SumOfArr(arr);
    }
    
}
