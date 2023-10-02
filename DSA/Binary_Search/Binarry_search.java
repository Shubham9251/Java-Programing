package DSA.Binary_Search;
import java.util.Scanner;

// Time complexcity --> O(logn)
// Space complexcity --> O(1)

public class Binarry_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target: ");
        int n = sc.nextInt();
        // int []arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int []arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        
        int res = findTarget(arr, n);
        
        System.out.println("target element index is :" + res);
        sc.close();
    }

    static int findTarget (int []arr, int n) {
        // binary search logic

        int start = 0;
        int end = arr.length-1;
        
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (n == arr[mid]) {
                return mid;
            }

            // for assending order arr....
            if (arr[0] < arr[end]) {

                if (arr[mid] > n) {
                    end = mid - 1;
                }
                else if (arr[mid] < n) {
                    start = mid + 1;
                }    
            }
            // for dessending order arr...
            else if (arr[0] > arr[end]) {

                if (arr[mid] > n) {
                    start = mid - 1;
                }
                else if (arr[mid] < n) {
                    end = mid + 1;
                }  
            }
            
        }
        return -1;
    }
}
