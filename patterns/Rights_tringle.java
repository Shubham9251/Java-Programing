import java.util.Scanner;

class solution {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    void tringle () {
        for (int i=1; i<=n; i++) {
            for (int k=1; k<=n; k++) {
                if ((i+k>=n+1 && i<=(n+1)/2) || (i<=k && i+k>n+1) || k==n) { // For n== ODD values only
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

public class Rights_tringle {
    public static void main(String[] args) {
        solution so = new solution();
        so.tringle();
    }
}

