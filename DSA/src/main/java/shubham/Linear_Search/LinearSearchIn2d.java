package main.java.shubham.Linear_Search;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchIn2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size row*column: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][]arr = new int[n][m];
        System.out.println("Enter elements : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter target value : ");
        int target = sc.nextInt();
    
        // Case 1 function define........
        int []result = searchIn2D(arr, target);
        System.out.println("The index is : " + Arrays.toString(result));

        sc.close();
    }

    static int[] searchIn2D(int[][] arr, int target) {
        
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] {row , col};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
