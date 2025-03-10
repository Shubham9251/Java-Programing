package main.java.shubham.Easy_question;

public class provlemNo35 {
    public static void main(String[] args) {
        int []nums = {1,3,5,6};
        // int target = 5;
        // int target = 2;
        int target = 7;

        int ans = findIndex(nums, target);
        System.out.println(ans);
        
    }
    static int findIndex (int []nums, int target) {
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
                return mid;
            }

        }
        return start;

    }
}
