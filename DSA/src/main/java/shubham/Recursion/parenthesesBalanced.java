package main.java.shubham.Recursion;

import java.util.Scanner;

public class parenthesesBalanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pairsOfParentheses(n, 0, 0, "");
        
        sc.close();
    }

    static void pairsOfParentheses (int n , int countOP, int countCP, String ans) {
        // base condition..
        if (countOP == n && countCP == n) { // in if --> ans.leanth() == 2*n
            System.out.println(ans);
            return;
            
        }

        // function calling...
        if (countOP < n) {
            pairsOfParentheses(n, countOP+1, countCP, ans+"(");
        }
        if (countCP < countOP) {
            pairsOfParentheses(n, countOP, countCP+1, ans+")");
        }
        
    }
}
