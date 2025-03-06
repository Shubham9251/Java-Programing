package main.java.shubham.Arrays;
import java.util.*;


public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();  
            }
            System.out.println();
        }
        sc.close();
        int DFsum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j == i; j++) {
              DFsum = DFsum + arr[i][j];  
            }
        }

        int DSsum = 0;
        for (int i = 0; i < n; i++) {
            
            DSsum = DSsum + arr[i][n-i-1];  
            
        }  

        int r = DFsum-DSsum;
        if (r<0) {
            r = -(r);
        }
        System.out.println(r);
    }
}