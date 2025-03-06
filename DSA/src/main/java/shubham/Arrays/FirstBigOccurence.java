package main.java.shubham.Arrays;

public class FirstBigOccurence {
    public static void main(String[] args) {
        int []arr = {4, 5, 2, 18, 9, 12, 3, 4, 11, 5, 0};

        BroutForceApproch(arr);
    }

    public static void BroutForceApproch (int[] arr) {
        int l = arr.length;
        int [] arr1 = new int[l];

        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = i+1; j < arr.length; j++) {
                if (arr[j]>arr[i]) {
                    arr1[i] = arr[j];
                    break;
                }
            }
            if (j==l) {
                arr1[i] = -1;
            }
            System.out.println( arr1[i]);
        }
    }
}