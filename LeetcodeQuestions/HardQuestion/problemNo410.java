package LeetcodeQuestions.HardQuestion;
import java.util.Scanner;

public class problemNo410 {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int largestSum = splitArray(nums, m);
        System.out.println(largestSum);
        sc.close();
    }

    static int splitArray (int []nums, int m) {
        int start = 0;
        int end = 0;
        int length = nums.length-1;

        for (int i = 0; i < length; i++ ) {
            start = Math.max(start, nums[i]); // in the end of loop this will contain the max item from the array.
            end += nums[i];
        }

        // binary search
        while (start < end) {
            // try for the middle as potential ans
            int mid = start + (end - start)/2;

            // calculate how many pieces you can divide this in with max su,
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum = num 
                    sum = num;
                    pieces++;

                }
                else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid +1;
            }
            else {
                end = mid;
            }

        }

        return end; // hers start == end
    }
}
