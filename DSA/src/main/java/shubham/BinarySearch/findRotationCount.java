package main.java.shubham.BinarySearch;

public class findRotationCount {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        // int[] arr = {5, 7, 9, 11, 12, 5};

        // cheak arr if it is rotated or not..
        int start = 0;
        int end = arr.length-1;
        // finding peak 
        // int peak = findpeak(arr,start,end);
        int peak = findpeakInDuplicateArr(arr,start,end);
        
        if (peak == -1) {
            System.out.println("Given array is not rotated array.");
        }

        int rotationCount = peak+1;
        System.out.print("Count of rotation is : " + rotationCount);
    }

    // if arr is not contain duplicate values...
    static int findpeak (int []arr, int start, int end) {
        
        while (start <= end) {
            int mid = start + (end-start)/2;

            // first see relation between peak, peak+1 and peak-1..
            // case 1.
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            // case 2.
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            //case 3
            if (arr[mid] > arr[start]) {
                start = mid; // or mid+1
            }
            // case 4
            if (arr[mid] < arr[start]) {
                end = mid-1;
            }
        }
        return -1;
    }

    // if arr is  contain duplicate values...
    static int findpeakInDuplicateArr (int []arr, int start, int end) {
        
        // there are 4 cases to find peak element...
        while (start <= end) {
            int mid = start + (end-start)/2;
            // case 1
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            // case 2
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            // case 3
            // if arr have contain duplicate elements then
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // if start, mid & end are same then skip all three so "start++" and "end--".

                // NOTE : what if these element at start and end were peak point then
                // cheak start point.
                if (arr[start] > arr[start+1]) {
                    return start;
                }
                start++;
                // cheak end point.
                if (arr[end] < arr[end-1]) {
                    return end-1;
                }
                end--;
            }
            // left side arr is sorted, so peak is should be right side.
            else if (arr[start] > arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;      
    }
}
