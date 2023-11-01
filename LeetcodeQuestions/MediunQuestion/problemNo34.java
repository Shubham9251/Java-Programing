package LeetcodeQuestions.MediunQuestion;
import java.util.Arrays;
import java.util.Scanner;
public class problemNo34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []nums = {5,7,7,8,8,10};
        int target = sc.nextInt();

        int []ans = {-1, -1}; 
        ans[0] = searchIndex(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = searchIndex(nums, target, false);
        }

        
        System.out.println(Arrays.toString(ans));
        sc.close();
    }

    static int searchIndex (int []nums, int target, boolean searchFirstIndex) {

        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;

            if (nums[mid] > target) {
                end = mid-1;
            }
            else if (nums[mid] < target) {
                start = mid+1;
            }
            else {
                ans = mid;
                if (searchFirstIndex) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}

