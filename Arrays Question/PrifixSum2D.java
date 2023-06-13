package ArraysQuestion;
import java.util.Scanner;

// Optimize approch.......
// stil only for (2,2)(3,3) and matrix bigger of 3*3

public class PrifixSum2D {
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
        
        prifix2DSum(arr);
        System.out.println("The sum of Given range is : " + Result(arr,r1,c1,r2,c2));
        
        sc.close();
    }

    public static void prifix2DSum(int[][] arr ) {
        // for row addition........
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                
                arr[i][j] = arr[i][j-1]+arr[i][j];
            }
        }

        // for column addition.......
        for (int j = 0; j < m; j++) {
            for (int i = 1; i < n; i++) {
                
                arr[i][j] = arr[i-1][j]+arr[i][j];
            }
        }

    
    }

    public static int Result(int[][] arr, int r1, int c1, int r2, int c2) {

        int tt = arr[n-1][m-1];
        int up = arr[r1-1][c2];
        int left = arr[r2][c1-1];
        int cm = arr[r1-1][c1-1];
        int sum = tt +(-up-left)+cm; 
        return sum;
    }
}
