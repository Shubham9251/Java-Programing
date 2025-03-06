package main.java.shubham.SortingAlgo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        
        int []arr = {50, 12, 45, 23, 10, 8, 5};

        for (int i = 0; i < arr.length; i++) {
            int min_ind = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min_ind]) {
                    min_ind = j;
                }
            }
            if(min_ind!=i)
            {
                int temp = arr[min_ind];
                arr[min_ind] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
