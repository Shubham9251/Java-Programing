package DSA.ArraysQuestion;
import java.util.Scanner;
// only for 4by4 matrix.......
public class Rotation2DArr {
    
    public static void main(String[] args) {
        
        int n, m;
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

        Transpose(arr);
        SwapCol(arr);
        sc.close();
    }    

    public static void Transpose(int[][] arr) {
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[i].length; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("\nTranspose array : ");
        for (int i[] : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void SwapCol(int[][] arr) {
        int swp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length/2; j++) {
                swp = arr[i][j];
                arr[i][j] = arr[i][arr[i].length-j-1];
                arr[i][arr[i].length-j-1] = swp;
            }
        }
        System.out.println("\nRotation array : ");
        for (int i[] : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
