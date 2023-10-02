package Projects.GuessingGame;

import java.lang.Math;
import java.util.Scanner;

class Guess {
    double temp;
    int guess;

    void computerGuess() {
        temp = Math.random() * 100;
        guess = (int) temp;
    }
}

class User {
    Scanner sc = new Scanner(System.in);
    int userGuess;

    void userGuess() {
        userGuess = sc.nextInt();
    }
}

class ComputerGame {

    Guess g = new Guess();
    User u = new User();
    

    void run() {

        System.out.println();
        System.out.println(" Get Started!!");
        System.out.println(" Guess the number between  1 to 100: ");
        System.out.println();

        g.computerGuess();
        int attemp = 0;
        while (attemp != 5) {
            u.userGuess();
            attemp++;
            if (attemp == 5) {
                if (u.userGuess == g.guess) {
                    System.out.println(" You Guess it correct! You Won");    
                }
                else {
                    System.out.println(" You Lost\nCorrect Number was " + g.guess);
                    break;
                }
            }
            if (u.userGuess < g.guess) {
                System.out.println(" Guess Bigger");
            } else if (u.userGuess > g.guess) {
                System.out.println(" Guess Lesser");
            } else {
                System.out.println(" You Guess it correct! You Won");
                break;
            }
        }
    }
    
}

