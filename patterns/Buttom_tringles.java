import java.util.Scanner;

public class Buttom_tringles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int r = 1; r <= n; r++) {
            for (int s = r; s < n; s++) {
                System.out.print("  ");
            }
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            for (int l = 1; l < r; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
