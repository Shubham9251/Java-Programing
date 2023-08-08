package BitManupulation;
import java.util.Scanner;

// base on 2^0 + 2^1 + 2^3 + .......

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary number : ");
        String binary = sc.next();
       
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {

            int formula = 1;
            if (binary.charAt(binary.length()-i-1) == '1') {

                for (int j = 0; j < i; j++) {
                    
                    formula = formula * 2;
                }

                decimal = decimal + formula;
            }
        }
        System.out.println("Decimal conversion is : " + decimal);
        sc.close();
    }

}
