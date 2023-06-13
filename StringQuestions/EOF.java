package StringQuestion;
import java.util.*;

class hasnext {
    static String s;
    static int count = 0;

    static void res3 () {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                count += 1;
                s = sc.nextLine();
                System.out.println(count + " " + s);
            }
        }
    }    
}
// class hasnexzt {
//     static String s;
//     static int count = 0;

//     static void res3 () {
//         try (Scanner sc = new Scanner(System.in)) {
//             for(;;){
//                 count += 1;
//                 s = sc.nextLine();
//                 System.out.println(count + " " + s);
//             }
//         }
//     }    
// }

public class EOF {
    public static void main(String[] args) {
        hasnext.res3();

            // OR

        // hasnexzt.res3();
    }
}
