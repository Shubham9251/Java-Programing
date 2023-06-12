package StringsConcept;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "it is Anagram" : "Not Anagram" );
    }

    static boolean isAnagram(String a, String b) {
        
        String A = a.toLowerCase();
        String B = b.toLowerCase();
        String A1 = A.replace(" ", "");
        String B1 = B.replace(" ", "");
        
        char[] a1 = A1.toCharArray();    
        char[] b1 = B1.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);

        if (Arrays.equals(a1, b1)) {
            return true;
        }
        else {
            return false;
        }
      
    }

// other method...

    /*static char[] sort(char [] r){
        for (int i=0; i<r.length;i++) {
            for (int j = i+1; j < r.length; j++) {
                if (r[i] > r[j]) {
                    char temp = r[j];
                    r[j] = r[i];
                    r[i] = temp;
                }
            }
        }
        return r;
    }
    static boolean isAnagram(String a, String b) {
        // Complete the function
        String A = a.toLowerCase();
        String B = b.toLowerCase();
        
        char[] A1 = A.toCharArray();    
        char[] B1 = B.toCharArray();
        
        char[] a1 = sort(A1);
        char[] b1 = sort(B1);
        
        if (a1.length == b1.length) {
            for (int i = 0; i < a1.length; i ++) {
                if (a1 [ i ] != b1 [ i ] ) {

                     return false; 
                }
             }
            return true;
        }
        return false;
    }*/
}
