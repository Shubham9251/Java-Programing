package DSA.Recursion;
import java.util.Scanner;
public class BinarySearch {

    static int findTarget(int []arr, int target, int lower, int higher) {
        int mid = lower + (higher-lower)/2;

        // base condition....
        if (arr[mid] == target) {
            return mid;
        }

        // function calling....
        else if (target < arr[mid]) {
            return findTarget(arr, target, lower, mid-1);
        }
        else if (target > arr[mid]) {
            
            return findTarget(arr, target, mid+1, higher);
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr : ");
        int n = sc.nextInt();
        int []arr = new int[n]; 

        System.out.println("Enter the sorted array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target : ");
        int target = sc.nextInt();

        int result = findTarget(arr, target, 0, arr.length-1);
        if (result == 0) {
            System.out.println("Target is not found in specifid array");
        }
        else {
            System.out.println("Target index is : " + result);
        }
        sc.close();
    }
}