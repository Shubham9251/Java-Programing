package StringsConcept;
import java.util.Scanner;

// assending input strings problem

public class StringProblem3 {
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of string : ");
        n = sc.nextInt();
        String[] S = new String[n];
        System.out.println("Enter Strings :");
        for (int i = 0; i < S.length; i++) {
            S[i] = sc.next();
        }
        
        
        for (int i = 0; i < S.length; i++) {
            for (int j = i+1; j < S.length; j++) {
                if (S[i].compareTo(S[j])<0) {
                    String temp = S[j];
                    S[j] = S[i];
                    S[i] = temp;
                }
            }
        }
        System.out.print("[ ");
        for (int i = 0; i < S.length; i++) {
            
            System.out.print(S[i] + " ");
        }
        System.out.println(" ]");
        sc.close();
    }
}
