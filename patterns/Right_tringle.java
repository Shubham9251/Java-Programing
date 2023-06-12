import java.util.Scanner;

class solution {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    void tringle () {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("  ");
            }
            for (int k=1; k<=n-i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Right_tringle {
    public static void main(String[] args) {
        solution so = new solution();
        so.tringle();
    }
}