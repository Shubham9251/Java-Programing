package main.java.shubham.Easy_question;
//TwoSum problem
// output --> arr[3, 4]or [5, 6]
public class ProblemNo1 {
    public static void main(String[] args) {
        int []arr = {1, 5, 8, 6, 4, 3, 7}; 
        int targat = 10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (targat == sum) {
                    System.out.println("array[" + i + "," + j + "]");
                    break;
                }
            }
        }

    }
}