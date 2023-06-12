package StringsConcept;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());

        while(testCases>0){
			String pattern = sc.nextLine();
            try {
                
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
            finally{

                testCases--;
            }
		}

        sc.close();

    }
}
