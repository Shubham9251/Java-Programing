package main.java.shubham.BinarySearch;
import java.util.Scanner;

/* Cilling problem --> "target <= output"
   Input --> arr{1, 3, 4, 5, 7, 8, 10, 15, 20, 21} && target = 2 
   output --> 2 if target is into arr otherwise print 3 */

public class ceilingNumber {
    public static void main(String[] args) {
        int []arr = {1, 3, 4, 5, 7, 8, 10, 15, 20, 21};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int res = findCeiling(arr, target);
        System.out.println("index is : " + res);
        sc.close();
    }    

    static int findCeiling (int []arr, int target) {

        int start = 0;
        int end = arr.length-1;
        
        if (target > arr[end]) {
              return -1;  
        }

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (arr[mid]==target) {
                return mid;
            }
            else if (arr[mid] > target) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
}
