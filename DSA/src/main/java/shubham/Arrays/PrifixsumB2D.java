package main.java.shubham.Arrays;
import java.util.Scanner;

// brut forse approch......

public class PrifixsumB2D {
    static int n, m;
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n*m size of array:  ");
        n = sc.nextInt();
        m = sc.nextInt();

        int [][]arr = new int[n][m];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }    

        
        System.out.println("Enter the first and last values cordinets for prifix sum : ");
        int r1,c1,r2,c2;
        System.out.print("r1 : ");
        r1 = sc.nextInt();
        System.out.print("c1 : ");
        c1 = sc.nextInt();
        System.out.print("r2 : ");
        r2 = sc.nextInt();
        System.out.print("c2 : ");
        c2 = sc.nextInt();
        
        prifix2DSum(arr,r1,c1,r2,c2);
        sc.close();
    }
    
    public static void prifix2DSum(int[][] arr, int r1, int c1, int r2, int c2) {
        int sum = 0;
        for (int i = r1; i <=r2; i++) {
            for (int j = c1; j <=c2; j++) {
                
                sum = sum+arr[i][j];
            }
        }
        System.out.println("The sum of Given range is : " + sum);

    }    

}
