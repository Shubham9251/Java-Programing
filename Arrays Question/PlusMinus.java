package ArraysQuestion;

import java.util.Scanner;

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
