package LeetcodeQuestions.MediunQuestion;
import java.util.Scanner;

class Solution7 {
    public int reverse(int x) {
        // not complete....

        Integer reverse = 0;
        int lastDigit = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        while (x != 0) {
            lastDigit = x % 10;
            reverse = (reverse * 10) + lastDigit;
            x = x/10;

        }
        if (reverse <= max || reverse >= min) {
            
            return reverse;
        }
        else {
            return 0;
        }
        
    }
}

public class ProblemNo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer x = sc.nextInt();

        Solution7 s7 = new Solution7();
        Integer res = s7.reverse(x);
        System.out.println(res);
        sc.close();
    }
}
