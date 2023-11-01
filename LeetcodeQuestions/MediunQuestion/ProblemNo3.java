package LeetcodeQuestions.MediunQuestion;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//  Longest Substring Without Repeating Characters

class Solution {
    // runtime --> 506ms
    /*public int lengthOfLongestSubstring(String s) {

        int Sublength = 0;
        int i=1, j = 0, k = 0;

        while (i < s.length()) {
            
            while (j >= k) {
                if (s.charAt(i) != s.charAt(j)) {
                    Sublength = Math.max(Sublength, i-j+1);     // finding maximum length with Math.max() method..
                }
                else {
                    // if condition for same charecter in string...
                    if (Sublength <= 1) {
                        Sublength = 1;
                    }
                    
                    i = j+1;    // this update for new itretion..
                    k = i;      // here k is for inner while loop condition..
                    break;
                }
                j--;
            }

            i++;
            j = i-1;
        }

        if (s.length() == 1) {
            Sublength = 1;
        }
        return Sublength;
    }*/

    // runtime --> 6ms
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        
        return maxLength;
    }

}

public class ProblemNo3 {
    public static void main(String[] args) {
        int Length = 0;

        Scanner sc = new Scanner(System.in);
        String s = " "; 

        Solution S3 = new Solution();
        Length = S3.lengthOfLongestSubstring(s);
        
        System.out.println(Length);
        sc.close();
    }    
}
