package Projects.TicTacTooGame;
import java.util.Scanner;

class Bord {
    // this method to print the game.
    public static void printGameBord (char [][]gameBord) {
        System.out.println();
        for (int row = 0; row < gameBord.length; row++) {
            for (int col = 0; col < gameBord[row].length; col++) {
                System.out.print(gameBord[row][col] + " | ");
            }
            System.out.println();
        }
    }
}

public class MainGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char choice = 'y';
        do {
            System.out.println();
            System.out.println("--> START THE GAME ");
            System.out.println();

            System.out.println("--> Enter the Gamebord Size. ");
            for(;;) {
        
                System.out.print("rowSize : ");
                int rowSize = sc.nextInt();
                System.out.print("colSize : ");
                int colSize = sc.nextInt(); 

                if ((rowSize == colSize) && (rowSize > 1 && rowSize < 6)) {
                    // Launching game
                    launchGame lg = new launchGame(rowSize, colSize);
                    lg.implementGame();
                    break;
                }
                else {
                    System.out.println("--> Gamebord Size should be * 1 < BordSize > 6 * and both row & col are same.");
                    System.out.println();
                }
            }       
            
            System.out.println();
            System.out.println("Do You Want to play again then enter(y/n)!! ");
            choice = sc.next().charAt(0);
        } while (choice == 'y');
    
        sc.close();
    }
}