package StringQuestion;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        
        String s = "He is a very very good boy, isn't he?";
        // Scanner sc = new Scanner(System.in);
        // S = sc.nextLine();

        s = s.trim(); // so that .split() works properly ---> it removes the extra white space after and before the string.
        
        /* Check special cases */
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        
        /* Split on all non-alphabetic characters */
        String [] words = s.split("[^a-zA-Z]+");  
        // String [] words = s.split("[,?._'@]");  


        /* Split on all alphabetic characters */
        // String [] words = s.split("[a-zA-Z]+");
        
        /* Print output */
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
        // sc.close();
    }
}
