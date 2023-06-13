package ArraysQuestion;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        
        int [] arr = {1, 2, 4, 4, 6, 6, 4, 8, 9, 9};

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int j, frq = 1;
            for (j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frq +=1;
                }
                else {
                    break;
                }
            }
            i = j-1;
            if (frq>1) {
                
                System.out.println(arr[i] + "-->" + frq);
            }
        }

        // by linear search....
        // for (int i = 0; i < arr.length; i++) {
        //     int frq = 1;
        //     for (int j = i+1; j < arr.length; j++) {
        //         if (arr[i]==arr[j]) {
        //             frq +=1;
        //             System.out.println(arr[i]);
        //             break;
        //         }
        //     }
        // }
    }
}
