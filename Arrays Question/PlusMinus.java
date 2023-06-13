package ArraysQuestion;
import java.util.Scanner;
// HackerRenk Problem of plus minus.....
 //   Input-->   arr = [-4, 3, -9, 0, 4, 1]
 //   Output-->   Print the following  lines, each to  decimals:
//                 1. proportion of positive values
//                 2. proportion of negative values
//                 3. proportion of zeros

public class PlusMinus {
    public static void main(String[] args) {
        int n, Pv = 0, Nv = 0, Zv = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            if (arr[i]>0) {
                Pv = Pv+1;
            }
            else if (arr[i]<0) {
                Nv = Nv+1;
            }
            else {
                Zv = Zv+1;
            }
        }
        double pv = (double)Pv/n;
        System.out.println(pv);
        double nv = (double)Nv/n;
        System.out.println(nv);
        double zv = (double)Zv/n;
        System.out.println(zv);
    }
}
