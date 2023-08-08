package BitManupulation;

import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary number : ");
        String hex = sc.next();

        int dec = 0;
        int base = 1;
        for (int i = hex.length()-1; i >= 0; i--) {

            if (hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F') {
                dec += base*(hex.charAt(i) - 'A' + 10);
            }
            else {
                String s = String.valueOf(hex.charAt(i));       // converting char to string first
                int n = Integer.parseInt(s);                // now converting string to integer 

                if (n >= 0 && n <= 9) {
                    dec += base*(n);
                }
            }
            base *=16;
        }
       
        System.out.println("Decimal conversion is : " + dec);
        sc.close();
    }
}
