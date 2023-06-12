import java.util.Scanner;

public class Flag {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        for(int r = 0; r < n; r++) {
            for(int c = 0; c < n; c++) {
                if (r==0 ||r==n-1 ||r==(n/2-2)||r==(n/2+1)) {
                    System.out.print("* ");
                }
                else if (c == 0 || c == n-1) {
                     System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int k = n-1; k > 0; k--) {
            System.out.print("* ");
            System.out.println();
        }
    }
}
