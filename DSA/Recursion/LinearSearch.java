package DSA.Recursion;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr : ");
        int n = sc.nextInt();
        int []arr = new int[n]; 

        System.out.println("Enter the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target : ");
        int target = sc.nextInt();

        int result = findTarget(arr, target, 0);
        if (result == 0) {
            System.out.println("Target is not found in specifid array");
        }
        else {
            System.out.println("Target index is : " + result);
        }
        sc.close();
    }

    static int findTarget(int []arr, int target, int index) {

        // base condition....
        if (index == arr.length) {
            return 0;
        }
        
        // function calling....
        if (arr[index] == target) {
            
            return index;
        }
        else {
           return findTarget(arr, target, index+1);
        }
        
    }
}
