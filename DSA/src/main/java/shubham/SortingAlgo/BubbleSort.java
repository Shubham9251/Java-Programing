package main.java.shubham.SortingAlgo;

// Time complexcity --> O(n^2)
// Space complexcity --> O(1)

public class BubbleSort {
    public static void main(String[] args) {

        int []arr = {10, 50, 40, 80, 1, 23, 42};

        for (int i = 0; i < arr.length; i++) {
            boolean swpped = false;
            // in each iteration we got max value on last index.
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                    swpped = true;
                }
            }

            if (!swpped) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}