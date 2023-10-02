package RecursionAssinment;
import java.util.*;

public class RAssinment3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Max value is: ");
        System.out.println(MaxValue(arr));
        sc.close();
    }

    static int i = -1;
    static int MaxValue (int []arr) {
        // Base condition......
        if (i == arr.length-2) {
            return arr[arr.length-1];
        }

        // Recursive call....
        i++;
        if (arr[i] > MaxValue(arr)) {
            return arr[i];
        }
        else {
            return arr[i+1];
        }
        
    }
}
