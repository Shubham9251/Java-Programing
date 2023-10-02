package Projects.TicTacTooGame;
import java.util.Scanner;

class launchGame {
    int rowSize;
    int colSize;

    public launchGame (int rowSize, int colSize) {
        this.rowSize = rowSize;
        this.colSize = colSize;
        
    }

    // crating gamebord.
    char [][]gameBord = new char[rowSize][colSize];

    // Initialy all box have empty spaces.
    for (int row = 0; row < gameBord.length; row++) {
        for (int col = 0; col < gameBord[row].length; col++) {
            gameBord[row][col] = ' ';
        }
    }

    char player = 'X';
    boolean gameOver = false;
    
    // game logic
    public void implementGame () {
        while (!gameOver) {
            Bord.printGameBord(gameBord);
            
            System.out.println();
            System.out.println("Player " + player + " enter cordinet of box :");
            System.out.println();
            
            Scanner sc = new Scanner(System.in);
            System.out.print("rowIndex : ");
            int rowIndex = sc.nextInt();
            System.out.print("colIndex : ");
            int colIndex = sc.nextInt();
            sc.close();

            if (gameBord[rowIndex][colIndex] == ' ') {
                gameBord[rowIndex][colIndex] = player;

                // ckeaking Winner..
                gameOver = Winner.cheakWon(gameBord, player);
                if (gameOver) {
                    Bord.printGameBord(gameBord);
                    System.out.println();
                    System.out.println("--> " + player + " Won the game !!");
                    System.out.println();
                }
                else {
                    // changing turn of player.
                    player = (player == 'X') ? 'O' : 'X';
                }
            }
            else {
                System.out.println("Invalid move. Try again! ");
            }
        }
    }
}