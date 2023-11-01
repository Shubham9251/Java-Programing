package LeetcodeQuestions.MediunQuestion;

import java.util.Scanner;

// Search in Rotated Sorted Array
public class problemNo33 {
    public static void main(String[] args) {

        // int []nums = {4, 5, 6, 7, 8, 1, 2, 3};
        // int []nums = {4, 8, 1}; 
        int []nums = {4, 4, 5, 8, 1, 3, 4}; 

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int indexOfTarget = Search(nums, target); 
        System.out.println(indexOfTarget);
        sc.close();
    }

    static int Search (int []nums, int target) {
        int start = 0;
        int end = nums.length-1;

        // finding peak element of rotated arr...
        // int indexOfPeak = findOfPeak(nums);
        // finding peak element of duplicate rotated arr...
        int indexOfPeak = findOfPeakInDuplicateArr(nums);
        // System.out.println(indexOfPeak);

        // if nums are not rotated arr then apply simple binarySearch.
        if (indexOfPeak == -1) {
            return binarysearch(nums, target, start, end);
        }

        // if nums are the rotated arr then 2 assnding is there.
        if (nums[indexOfPeak] == target) {
            return indexOfPeak;
        }
        if (nums[start] <= target) {
            return binarysearch(nums, target, start, indexOfPeak-1);
        }
        // if nums[start] > target
        return binarysearch(nums, target, indexOfPeak+1, end);
        
    }

    // this is not for duplicet arr...
    static int findOfPeak(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        // there are 4 cases to find peak element...
        while (start <= end) {
            int mid = start + (end-start)/2;
            // case 1
            if (mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }
            // case 2
            if (mid > start && nums[mid] < nums[mid-1]) {
                return mid-1;
            }
            // case 3
            if (nums[start] >= nums[mid]) {
                // it means after the mid elements are have not peak element
                end = mid-1;
            }
            // case 4
            if (nums[start] < nums[mid]) {
                // it means we are in assending arr
                start = mid+1;
            }
        }
        return -1;            
    }
    
    // this is for duplicated elements arr..
    static int findOfPeakInDuplicateArr(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        // there are 4 cases to find peak element...
        while (start <= end) {
            int mid = start + (end-start)/2;
            // case 1
            if (mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }
            // case 2
            if (mid > start && nums[mid] < nums[mid-1]) {
                return mid-1;
            }
            // case 3
            // if arr have contain duplicate elements then
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                // if start, mid & end are same then skip all three so "start++" and "end--".

                // NOTE : what if these element at start and end were peak point then
                // cheak start point.
                if (nums[start] > nums[start+1]) {
                    return start;
                }
                start++;
                // cheak end point.
                if (nums[end] < nums[end-1]) {
                    return end-1;
                }
                end--;
            }
            // left side arr is sorted, so peak is should be right side.
            else if (nums[start] > nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;            
    }

    static int binarysearch(int []nums, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
}
