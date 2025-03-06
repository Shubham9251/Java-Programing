package main.java.shubham.Recursion;

import java.util.Scanner;

// we have n number of stair and two fixed steps at a time if 1 stair or 2 stair,
// so find the number of way to reach final or last stair.

public class StairProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stairs: ");
        int stairs = sc.nextInt();

        int res = StairProblem.numberOfWays(stairs);
        System.out.println(res);

        sc.close();
    }

    private static int numberOfWays(int stairs) {
        int totalNumberOfWays = 0;

        //base condition...

//        if (stairs < 1)
//            return 0;
//        if (stairs == 1 )
//            return 1;
        if (stairs <= 1)
            return stairs;

//        int temp1 = numberOfWays(stairs-1);
//        int temp2 = numberOfWays(stairs-2);
        totalNumberOfWays = numberOfWays(stairs-1) + numberOfWays(stairs-2);
        return totalNumberOfWays;
    }
}
