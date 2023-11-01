package LeetcodeQuestions.EasyQuestion;
import java.util.Arrays;
import java.util.Scanner;

//Convert Integer to the Sum of Two No-Zero Integers.

public class ProblemNo1317 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] res = getNoZeroIntegers(n);
        System.out.println(Arrays.toString(res));
        sc.close();
    }

    static int[] getNoZeroIntegers(int n) {
        int a = n-1;
        int b = 1;

        boolean flag = true;
        while (flag != false) {
            flag = false;
            String A = Integer.toString(a);
            String B = Integer.toString(b);
        
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) == '0') {
                    flag = true;
                    break;
                }
            }                   
            for (int i = 0; i < B.length(); i++) {
                if (B.charAt(i) == '0') {
                    flag = true;
                    break;
                }
            }                   
            if (flag) {
                a = a-1;
                b = b+1;
            }
            
        }
        return new int [] {a , b};

    }
}