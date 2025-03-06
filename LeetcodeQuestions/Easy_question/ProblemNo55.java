package main.java.shubham.Easy_question;

public class ProblemNo55 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};

        boolean ans = jumpGame2(nums);
        System.out.println(ans);
    }

    private static boolean jumpGame(int[] nums) {
        int length = nums.length;
        if (length == 1)
            return true;
        if (length == 2)
            return nums[0] > 0;

        boolean flag = false;
        int prev = length-2; int goal = length-1;

        while (prev >= 0) {
            int jump = nums[prev];

            if (jump + prev >= goal){
                flag = true;
                goal = prev;
            }
            else
                flag = false;

            prev -= 1;
        }
        return flag;
    }

    private static boolean jumpGame2(int[] nums) {
        int length = nums.length;
        if (length == 1)
            return true;
        if (length == 2)
            return nums[0] > 0;


        int window = 0; int maxJump = 0;
        int i = 0;
        while (i < length) {

            if (i > window){
                return false;
            }

            int jump = nums[i] + i;

            window = window>jump? window:jump;

            if (window >= length-1){
                return true;
            }

            i++;
        }
        return false;
    }

}
