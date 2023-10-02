package DSA.Binary_Search;

import java.util.Scanner;

/* roof problem --> "target >= output"
   Input --> arr{1, 3, 4, 5, 7, 8, 10, 15, 20, 21} && target = 9 
   output --> 9 if it is into arr otherwise print 8 */

public class roofProblem {
    public static void main(String[] args) {
        int []arr = {1, 3, 4, 5, 7, 8, 10, 15, 20, 21};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int res = findroof(arr, target);
        System.out.println("index is : " + res);
        sc.close();
    }    

    static int findroof (int []arr, int target) {

        int start = 0;
        int end = arr.length-1;

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
        return end;
    }
}
