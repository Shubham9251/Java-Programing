package StringsConcept;
import java.util.Scanner;

class nextLine {
    /*The nextLine() method reads the text until the end of the line.
     After reading the line, it throws the cursor to the next line.
    */

    static String s;
    static Scanner sc = new Scanner(System.in);

    static void res1 () {
        s = sc.nextLine();
        System.out.println(s);
    }
}

class next {
    /*The next() method only accepts the string until the first space is encountered.
     * The next method basically returns the next token that it encounters, i.e., until an empty character is encountered. 
     *  If there is no next token it throws the NoSuchElementException.
     */

    static String s;
    static Scanner sc = new Scanner(System.in);

    static void res2 () {
        s = sc.next();
        System.out.println(s);
    }
}

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

class hasnext2 {
    static String s;
    static int count = 0;

    static void res3 () {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                count += 1;
                s = sc.next();
                System.out.println(count + " " + s);
            }
        }
    }    
}






public class StringInput {
    public static void main(String[] args) {
    //    nextLine.res1();
    //    next.res2();
       hasnext.res3();
    //    hasnext2.res3();
    }
}
