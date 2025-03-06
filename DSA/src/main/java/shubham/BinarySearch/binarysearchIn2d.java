package main.java.shubham.BinarySearch;

import java.util.Arrays;

public class binarysearchIn2d {
    public static void main(String[] args) {
        int [][]arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println(Arrays.toString(search(arr, 10)));

    }
    
    static int[] search(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length; // be cautious, matrix may be empty

        if (rows == 1) {
            return searchIn2D(arr, target, 0, 0, cols-1);
        }

        int rStart = 0;
        int rEnd = rows -1;
        int cMid = cols /2;

        // run the loop till 2 rows are remaning
        while (rStart < (rEnd - 1)) { // while this is true it will have more then 
            int mid = rStart + (rEnd - rStart)/2;
            if (arr[mid][cMid] == target) {
                return new int [] { mid, cMid};

            }
            if (arr[mid][cMid] < target) {
                rStart = mid;
            }
            else {
                rEnd = mid;
            }
        }

        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (arr[rStart][cMid] == target) {
            return new int[] {rStart, cMid};
        }
        if (arr[rStart + 1][cMid] == target) {
            return new int[] {rStart + 1, cMid};
        }


        // search in 1st half
        if (target <= arr[rStart][cMid - 1]) {
            return searchIn2D(arr, target, rStart, 0, cMid -1);
        }
        // search in 2st half
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][cMid - 1]) {
            return searchIn2D(arr, target, rStart, cMid+1, cols-1);
        }
        // search in 3st half
        if (target <= arr[rStart + 1][cMid - 1]) {
            return searchIn2D(arr, target, rStart+1,  0, cMid-1);
        }
        // search in 4st half
        else
            return searchIn2D(arr, target, rStart + 1, cMid+1, cols - 1);
    }

    // search in the row provided between the columns provided    
    static int[] searchIn2D(int [][]arr, int target, int row, int sCol, int eCol) {
        while (sCol <= eCol) {
            int mid = sCol + (eCol-sCol)/2;

            if (arr[row][mid] == target) {
                return new int [] {row, mid};
            }
            if (arr[row][mid] < target) {
                sCol = mid+1;
            }
            else {
                eCol = mid-1;
            }
        }
        return new int [] {-1, -1};
    }

    
}

