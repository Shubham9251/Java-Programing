package main.java.shubham.Easy_question;
import java.util.Scanner;

class Solution14 {
    public static String longestCommonPrefix2(String[] strs) {
        String someWord = strs[0];
        if (strs.length == 1) return someWord;

        String prefix = strs[0];

        for(String word : strs) {
            while (!word.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() -1);
            }
        }

        return prefix;
    }

    public String longestCommonPrefix(String[] strs) {
        // StringBuilder ans = new StringBuilder();
        // Arrays.sort(strs);
        // String first = strs[0];
        // String last = strs[strs.length-1];
        // for (int i=0; i<Math.min(first.length(), last.length()); i++) {
        //     if (first.charAt(i) != last.charAt(i)) {
        //         return ans.toString();
        //     }
        //     ans.append(first.charAt(i));
        // }
        // return ans.toString();

        
        java.util.Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}

public class ProblemNo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = {"flower","flow","flight"};

        Solution14 s14 = new Solution14();
        String res = s14.longestCommonPrefix2(str);
        System.out.println(res);


        sc.close();
    }
}    