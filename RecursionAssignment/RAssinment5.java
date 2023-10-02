package RecursionAssinment;
import java.util.Scanner;

public class RAssinment5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        
        String s = Long.toString(num);
        int length = s.length();
        long res = ArmStrong(num, length);

        if (res == num) System.out.println("true");
        else System.out.println("false");
        
        sc.close();
    }

    static long ArmStrong (long num, int length) {
        if (num == 0) {
            return 0;
        }
        else {
        int lastDigit = (int) (num%10);
        long sum = (long) (Math.pow(lastDigit, length));
        return sum + ArmStrong(num/10, length);
        }
    }
}
