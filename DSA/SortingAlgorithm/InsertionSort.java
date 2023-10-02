package DSA.SortingAlgorithm;
import java.util.Arrays;

// Time complexcity --> worst case O(n^2) &&  when given arr is almost sort then best case O(n)
// Space complexcity --> O(1)
public class InsertionSort {
    public static void main(String[] args) {
        
        int []arr = {50, 12, 45, 23, 10, 8, 5};

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j-1])  {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
