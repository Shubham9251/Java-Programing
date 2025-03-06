package main.java.shubham.Recursion;
import java.util.Scanner;

public class MultipleOfNumber {
    public static void multiplesOfDIgit(int digit, int num) {
        if (num == 1) {
            System.out.print(digit + ", ");
            return;
        }
        
        multiplesOfDIgit(digit, num-1);
        System.out.print(digit * num + ", ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit : ");
        int digit = sc.nextInt();
        System.out.println("Enter numbre for how many times multiples you wants : ");
        int num = sc.nextInt();
        sc.close();

        multiplesOfDIgit(digit, num);

    }
}
