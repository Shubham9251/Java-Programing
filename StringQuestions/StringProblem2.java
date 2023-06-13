package StringQuestion;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

//  Substring Comparisons and print smallest and largest substring .........

public class StringProblem2 {
     
    public static String getSmallestAndLargest(String S, int n) {
        String smallest = "null";
        String largest = "null";

        List<String> R = new ArrayList<>();

        int len = S.length()-n+1;        
        for (int i = 0; i < len; i++) {
            
            R.add(S.substring(i, n+i));   
        }
        
       Collections.sort(R);
       
       smallest = R.get(0);
       largest = R.get(R.size()-1);

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        
        System.out.println("Enter String : ");
        String S = sc.next();
        System.out.println("Enter range of substring: ");
        int n = sc.nextInt();
        
        System.out.println(getSmallestAndLargest(S, n));
        sc.close(); 
    }


}
