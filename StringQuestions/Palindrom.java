package StringsConcept;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        String A ;
        Scanner sc = new Scanner(System.in);
        A = sc.next();

        // System.out.println( A.equals( new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );
        
        //or
        
        boolean b = false;
        for (int i = 1; i <= A.length(); i++) {
            if (A.charAt(i-1) == A.charAt(A.length()-i)) {
                b = true;
            }
            else {
               b = false;
               break;
            }
        }
        if (b) {
            System.out.println("Yas! it is palindrom.");
        }
        else {
            System.out.println("No! it is not palindrom.");
        }
    }
}
