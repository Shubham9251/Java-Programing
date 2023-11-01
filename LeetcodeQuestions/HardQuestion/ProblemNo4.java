package LeetcodeQuestions.HardQuestion;
// import java.util.Arrays;
import java.util.Scanner;

// Median of Two Sorted Arrays

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // first method to solve it.......
        /*double result = 0.0;
        int size = nums1.length + nums2.length;
        int []nums3 = new int[size];

        for (int i = 0; i < nums1.length; i++) {
            nums3[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            nums3[nums1.length+i] = nums2[i];
        }
        
        Arrays.sort(nums3);
        int mid = (0 + (nums3.length-1)) / 2;
        if (size%2 != 0) {
            
            return nums3[mid];
        }
        else {
            double sum = nums3[mid] + nums3[mid+1];
            result = (double)sum / 2;
            return result;
        }*/

        // second method to solve it....

        int size = nums1.length + nums2.length;
        int []nums3 = new int[size];

        int i = 0, j = 0, k = 0;
        while( (i <= nums1.length && j <= nums2.length) && (k < size) ) {

            // For if any array length is zero and if value of i ad j is same with there array length....
            if (i == nums1.length) {
                while (j < nums2.length) {
                    nums3[k] = nums2[j];
                    j++;
                    k++;
                }
                break;
            }
            if (j == nums2.length) {
                while (i < nums1.length) {
                    nums3[k] = nums1[i];
                    i++;
                    k++;
                }    
                break;
            }

            // For comparing......
            if (nums1[i] < nums2[j]) {
                nums3[k] = nums1[i];
                i++;
            }
            else {
                nums3[k] = nums2[j];
                j++;
            }

            k = k+1;
              
        } 

        if (size%2 != 0) {
            
            return nums3[(nums3.length-1) / 2];
        }
        else {
            int sum = nums3[(nums3.length-1) / 2] + nums3[(nums3.length) / 2];
            return (double)sum / 2;
        }
        
    }
   
}

public class ProblemNo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []nums1 = {};
        int []nums2 = {1, 2, 5, 8, 10};

        Solution S = new Solution();        
        double result = S.findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
        sc.close();
    }
}

