package LeetcodeQuestions.EasyQuestion;
import java.util.Scanner;

// 1672. Richest Customer Wealth
public class problemNo1672 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][]accounts = {
            {1,5},
            {7,3},
            {3,5} 
        };

        int welthy = 0;
        for (int[] Customer : accounts) {
            int total = 0;
            for (int money : Customer) {
                total = total+money;
            }
            if (welthy < total) {
                welthy = total;
            }
        }

        System.out.println(welthy);
        sc.close();
    }
}
