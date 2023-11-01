package LeetcodeQuestions.EasyQuestion;
import java.util.Scanner;

// problem --> Merge Strings Alternately
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder finalString = new StringBuilder();
        int i = 0;
        int l = word1.length()+word2.length();
        while (i<l) {
            if (i < word1.length()) {
                
                finalString = finalString.append((word1.charAt(i)));
            }
            if (i < word2.length()) {
                
                finalString = finalString.append((word1.charAt(i)));
            }
            i+=1;
        }

        String FinalString = finalString.toString();
        return FinalString;
    }
}

public class ProblemNo1768 {
    public static void main(String[] args) {
        String word1, word2, finalWord;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two String :");
        word1 = sc.next();
        word2 = sc.next(); 

        Solution S1768 = new Solution();
        finalWord = S1768.mergeAlternately(word1, word2) ;
        
        System.out.println(finalWord);
        sc.close();
    }
}
