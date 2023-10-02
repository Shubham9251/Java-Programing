package DSA.Binary_Search;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int ans = Answer(n);
        System.out.println(ans);
        sc.close();
    }

    public static int Answer(int n) {
        int lr = 0;
        int hr = n/2;
        int res = -1;
        while (lr<=hr) {
            int mid = lr + (hr-lr)/2;
            int r = mid*mid;

            if (r == n) {
                return mid;
            }
            else if (r < n) {
                res = mid;
                lr = mid+1;
            }
            else {
                hr = mid-1;
            }
        }
        return res;
    }
}
