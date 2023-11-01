package LeetcodeQuestions.EasyQuestion;
import java.util.Scanner;

// Roman to Integer

class Solution13 {
    public int romanToInt(String s) {
        int answer = 0, number = 0, prev = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if (number < prev) {
                answer -= number;
            }
            else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }
}

public class ProblemNo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        String s = sc.next();
        int num = 0;

        Solution13 s13 = new Solution13();
        num = s13.romanToInt(s);
        System.out.println(num);
        sc.close();
    }
}
