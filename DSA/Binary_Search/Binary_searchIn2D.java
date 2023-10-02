package DSA.Binary_Search;
import java.util.Arrays;
import java.util.Scanner;

public class Binary_searchIn2D {

    static int[] searchIn2D(int [][]arr, int target) {
        int row = 0;
        int col = arr[0].length-1;
        while (row < arr.length && col >= 0) {

            if (arr[row][col] == target) {
                return new int [] {row, col};
            }

            if (target > arr[row][col]) {
                row++;
            }
            else {
                col--;
            }
        }
 
        return new int[] { -1, -1 };
    }

                    //  ANOTHER CODE

    //Time Complexity: O(log N*M)

    /*static int[] searchIn2D(int [][]arr, int target, int lower, int higher) {

        while (lower <= higher) {
            int mid = lower + (higher - lower) / 2;

            // for find mid cordinets.....
            int tC = mid % arr[0].length;
            int tR = mid / arr[0].length;
            int val = arr[tR][tC];

            if (val == target)
                return new int[] { tR, tC };
 
            if (val < target)
                lower = mid + 1;
            else
                higher = mid - 1;
        }
 
        return new int[] { -1, -1 };
    }*/

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
        
        // Case 2 function define...
        /*int lower = 0;
        int higher = (n*m)-1;
        int []result = searchIn2D(arr, target, lower, higher);
        System.out.println("The index is : " + Arrays.toString(result));*/

        sc.close();
    }
}
