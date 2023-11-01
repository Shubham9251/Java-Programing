package LeetcodeQuestions.MediunQuestion;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

// Generate Parentheses
/*  Input: n = 3
    Output: ["((()))","(()())","(())()","()(())","()()()"] */

public class problemNo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> ans = generateParenthesis(n);
        System.out.println(ans);
        sc.close();
    }

    static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        StringBuilder ans = new StringBuilder("");
        pairsOfParenthese(n, 0, 0, ans, res);
        return res;
    }

    static void pairsOfParenthese (int n , int countOP, int countCP, StringBuilder ans, List<String> res) {
        
       // base condition..
        if (ans.length() == 2*n) {
            // System.out.println(ans);
            res.add(ans.toString());
            return;
            
        }

        // function calling...
        if (countOP < n) {
            pairsOfParenthese(n, countOP+1, countCP, ans.append("("), res);
            ans.deleteCharAt(ans.length()-1);
            
        }
        if (countCP < countOP) {
            pairsOfParenthese(n, countOP, countCP+1, ans.append(")"), res);
            ans.deleteCharAt(ans.length()-1);
        }
    }
}