package main.java.shubham.BinarySearch;

import java.util.Scanner;

// provlem is --> Find the position of element in sorted infinite number of array in O(log n) time complexity.
// Note --> you can assume that finite arr is infinite arr it means not use "arr.length". 
public class sortedInfiniteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []nums = {1, 2, 3, 5, 6, 8, 15, 20, 26, 31, 40, 52}; // assume this is an infinite arr
        int target = sc.nextInt();

        //logic for finding start and end index
        int start = 0;
        int end = start+1;
        while (target > nums[end]) {  // still problem --> ArrayIndexOutOfBoundsException 
            int newstart = end+1;
            end = end + (end - start +1) * 2;
            start = newstart;
        }

        binarySearch(nums, target, start, end);
        sc.close();
    }

    static void binarySearch (int []nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end-start)/2;

            if (nums[mid] > target) {
                end = mid-1;
            }
            else if (nums[mid] < target) {
                start = mid+1;
            }
            else {
                System.out.println(mid);
                break;
            }
        }
    }
}
