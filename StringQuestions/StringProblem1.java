package StringsConcept;
import java.util.*;

/*The 2 main differences are that: equals will take any Object as a parameter,
   but compareTo will only take Strings.
   equals only tells you whether they're equal or not,
   but compareTo gives information on how the Strings compare lexicographically.
   
   --->>  .compareTo() return binary value based on condition...
        eg.   1.  (a == b) -> return 0.
              1.  (a < b) -> return -1.
              1.  (a > b) -> return 1.
*/

public class StringProblem1 {
    public static void main(String[] args) {
       
        String A, B;
        try(Scanner sc=new Scanner(System.in)){
            A = sc.next();
            B = sc.next();
        }
        
        int n = A.length() + B.length();        // sum of both length
        System.out.println(n);

        // check alphabetically/lexicographically greater or not
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        // print first letter capital

        String A1 = A.substring(0, 1).toUpperCase();
        String A2 = A.substring(1);
        System.out.print(A1+A2+" ");
        String B1 = B.substring(0, 1).toUpperCase();
        String B2 = B.substring(1);
        System.out.print(B1+B2);
        

    }
}
