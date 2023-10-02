package DSA.Linear_Search;
import java.util.Scanner;

// Time complexcity --> O(n^2)
// Space complexcity --> O(1)

public class Linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sc.close();
        for (int f = 0; f < 10; f++) {
            if (arr[f] == n) {
                System.out.println(arr[f] + " and index is:" + f);
            }
        }
             
    }
}
