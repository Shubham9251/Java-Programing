package BitManupulation;
import java.util.Scanner;

// based on .... digits*8^2 + digits*8^1 + digits*8^0     right <--- left

public class OctelToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Octel number : ");
        int octel = sc.nextInt();
       
        int decimal = 0;
        int result = 0;
        
        
        int lastDigit = 0;
        int i = 0;
        
        while (octel != 0) {
            lastDigit = octel % 10;
            int pow = 1;

            // for calculating powre of 8.....
            for (int j = 0; j < i; j++) {
                    
                pow = pow * 8;
            }

            // converting octel to decimal
            result = lastDigit * pow;
            decimal = decimal + result;
            i++;

            octel = octel / 10;
        }

        System.out.println("Decimal conversion is : " + decimal);
        sc.close();
    }
}
