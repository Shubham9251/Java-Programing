package main.java.shubham.Arrays;

// first occurence in array.........
public class LowerBound {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 7, 7, 8, 8, 9, 10};

        // int target = 4;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i]==target) {
        //         System.out.println(i);
        //         break;
        //     }
        // }

        int target = 8;
        int f = 0;
        int l = arr.length-1;
        int mid, result=0;
        // while (f<=l) {
        //     mid = f+(l-f)/2;
        //     if (arr[mid] == target) {
        //         result = mid;
        //         l = mid-1;
        //     }
        //     else if (arr[mid]<target) {
        //         f = mid+1;
        //     }
        //     else {
        //         l = mid-1;
        //     }
        // }

        // or can be write it like that....
        while (f<=l) {
            mid = f+(l-f)/2;
            if (arr[mid] >= target) {
                result = mid;
                l = mid-1;
            }
            else {
                f = mid+1;
            }
            
        }
        System.out.println(result);  
    }
}
