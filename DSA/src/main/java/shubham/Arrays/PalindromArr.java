package main.java.shubham.Arrays;

import java.util.Scanner;

public class PalindromArr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:  ");
        int n = sc.nextInt();
        

        int[] arr = new int[n];
        System.out.println("Enter the eement of arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int[] arr1 = new int[n];

        //revers
        for (int i = 1; i <= n; i++) {
            arr1[i-1] = arr[n-i];
        }

        //chaking
        boolean r = true;
        for (int i = 0; i < n/2; i++) {
            
            if (arr1[i] != arr[i]) {
                r = false;
                break;
            }
            
        }
        if (r) {
            System.out.println(r);
        }
        else{
            System.out.println(r);
        }
    }
}