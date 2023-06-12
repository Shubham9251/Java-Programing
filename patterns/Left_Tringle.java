import java.util.Scanner;

class solution {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    void tringle() {
        for (int i = 1; i <= n; i++) {
            for (int r = 1; r <= i; r++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int r = 1; r <= n - i; r++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Left_Tringle {
    public static void main(String[] args) {
        solution so = new solution();
        so.tringle();
    }
}