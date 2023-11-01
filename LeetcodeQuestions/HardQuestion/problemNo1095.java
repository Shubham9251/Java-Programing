package LeetcodeQuestions.HardQuestion;
import java.util.Scanner;

// find\search in mountain array
public class problemNo1095 {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5, 3, 1};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();   
        int length = arr.length-1;


        int indexOfPeak = findPeakOfMountain(arr, 0, length);
        System.out.println("index Of Peak -- >" + indexOfPeak);

        // searching target in arr....

        int indexOfTarget = -1;
        // finding in first half....
        indexOfTarget = findTarget(arr, target, 0, indexOfPeak, false);
        if (indexOfTarget == -1) {
            //finding in second half...
            indexOfTarget = findTarget(arr, target, indexOfPeak+1, length, true);
        }

        System.out.println("index Of Target is --> " + indexOfTarget);
        sc.close();
    }

    static int findPeakOfMountain (int []arr, int start, int end) {
        
        while (start < end) {
            int mid = start + (end-start)/2;

            if (arr[mid] > arr[mid+1]) {
                // descending order part of arr
                end = mid;
            }
            if (arr[mid] < arr[mid+1]) {
                // assending order part of arr
                start = mid+1;
            }
        }
        return start; // or end
    }

    static int findTarget (int arr[], int target, int start, int end, boolean revers) {

        while (start <= end) {
            int mid = start + (end-start)/2;
            
            if (arr[mid] == target) {
                return mid;
            }
            // for assending order arr....
            if (revers == false) {

                if (arr[mid] > target) {
                    end = mid - 1;
                }
                else if (arr[mid] < target) {
                    start = mid + 1;
                }    
            }
            // for dessending order arr...
            if (revers == true) {

                if (arr[mid] > target) {
                    start = mid - 1;
                }
                else if (arr[mid] < target) {
                    end = mid + 1;
                }  
            }
        }
        return -1;
    }
}
