import java.util.Scanner;

public class Vpattern {
    public static void main(String[] args) {
        int n;
        try(Scanner sc = new Scanner(System.in)){
            n = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j && i<=(n-1)/2 || i+j==(n-1) && j>(n-1)/2) {
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
