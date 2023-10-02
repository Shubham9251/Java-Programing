package DSA.ArraysQuestion;

import java.util.Scanner;

public class PalindromArr2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:  ");
        int n = sc.nextInt();
        

        int[] arr = new int[n];
        System.out.println("Enter the eement of arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        boolean b = true;
        for (int i = 0; i < n/2; i++) {
            if (arr[i] != arr[n-i-1]) {
                b = false;
                break;
            }
        }
        
        if (b) {
            System.out.println("Yas! it is palindrom.");
        }
        else {
            System.out.println("No! it is not palindrom.");
        }
    }
}
