package LeetcodeQuestions.EasyQuestion;
import java.util.Scanner;

//1295. Find Numbers with Even Number of Digits
public class problemNo1295 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []nums = {12, 123, 45, 4125};

        int res = 0;
        for (int num : nums) {
            int count = 0;
            while (num != 0) {
                count++;
                num /= 10;
            }
            if (count%2 == 0) {
                res = res + 1;
            }
        }

        System.out.println(res);
        sc.close();
    }
}
