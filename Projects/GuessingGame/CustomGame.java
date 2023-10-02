package Projects.GuessingGame;
import java.util.Scanner;

class Guesser {
    Scanner sc = new Scanner(System.in);
    int guessnum;

    int guessingnumber () {
        System.out.println(" Get Started!!");
        System.out.println(" Guesser plese! Guess a integer number. ");
        guessnum = sc.nextInt();
        return guessnum;
    }
}

class Player {
    Scanner sc = new Scanner(System.in);
    int []numFromPlayer= new int[3]; 
    
    int[] guessingnumber () {
        System.out.println(" Player, Guess a integer number! ");
    
        for (int i = 0; i < 3; i++) {
            
            numFromPlayer[i] = sc.nextInt();
        }

        return numFromPlayer;
    }
}

class Umpire {
    int numFromGusser;
    int[] numFromPlayer; 
    
    void collectFromGuesser (){
        Guesser g = new Guesser();
        numFromGusser = g.guessingnumber();
    }


    
    void collectFromPlayer () {
        Player p = new Player();
        numFromPlayer = p.guessingnumber();

    }

    void Compair () {
        if (numFromGusser==numFromPlayer[0]) {
            if (numFromGusser==numFromPlayer[1] && numFromGusser==numFromPlayer[2]) {
                System.out.println(" All are Winner! All gives right answre. ");
            }
            else if (numFromGusser==numFromPlayer[1]) {
                System.out.println(" p1 and p2 both are Winner! both gives right answre. ");
            }
            else if (numFromGusser==numFromPlayer[2]) {
                System.out.println(" p1 and p3 both are Winner! both gives right answre. ");
            }
            else {
                System.out.println(" p1 is Winner! p1 gives right answre. ");
            }
        }

        else if (numFromGusser==numFromPlayer[1]) {
            if (numFromGusser==numFromPlayer[2]) {
                System.out.println(" p2 and p3 are Winner! both gives right answre. ");
            }
            else {
                System.out.println(" p2 is Winner! p2 gives right answre. ");
            }
        }

        else if (numFromGusser==numFromPlayer[2]) {
            System.out.println(" p3 is Winner! p3 gives right answre. ");
        }

        else {
            System.out.println(" All are Looser! All gives wrong answre. ");
        }
    }
}
