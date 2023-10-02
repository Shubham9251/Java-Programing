package Projects.GuessingGame;
import java.util.Scanner;

class Launch_game {
    Scanner sc = new Scanner(System.in);
    String s;

    void launchgame() {
        
        for(;;){
            System.out.println();
            System.out.println("*-------------------------------------*");
            System.out.println(" 1. With Computer. \n 2. Custom Play.");
            System.out.println(" Plese!! Enter One Mode to Play Game: ");
            System.out.println("*-------------------------------------*");
            System.out.println();
            s = sc.next();
            try {
                int n = Integer.parseInt(s);
                while (n>=1 || n<=2) {
                
                    if (n == 1) {
                        ComputerGame r = new ComputerGame();
                        r.run();
                        break;
                    }
                    else if (n == 2) {
                        Umpire U = new Umpire();
                        U.collectFromGuesser();
                        U.collectFromPlayer();
                        U.Compair();
                        break;
                    }
                    else{
                        System.out.println("Enter correct choise: ");
                        n = sc.nextInt();
                    }
                }
                break;
            } catch (Exception e) {
                System.out.println("Plese! Enter Write Input: ");
            }
        }    
              
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = 'y';
        do {
            Launch_game k = new Launch_game();
            k.launchgame();
            System.out.println();
            System.out.println("Do You Want to play again then enter(y/n)!! ");
            choice = sc.next().charAt(0);
        } while (choice == 'y');
        sc.close();
    }
}
