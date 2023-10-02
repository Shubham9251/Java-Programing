package Projects.TicTacTooGame;

class Winner {
    // this Method to cheak the winner. 
    public static boolean cheakWon (char [][]gameBord, char player) {
        boolean flag = false;

        // cheak for rows.
        for (int row = 0; row < gameBord.length; row++) {
            int col;
            for (col = 0; col < gameBord[row].length; col++) {
                if (gameBord[row][col] == player) {
                    flag = true;
                }
                else {
                    flag = false;
                    break;
                }
            }
            if (flag && col == gameBord.length) {
                return flag;
            }
        }
        // cheak for columns.
        for (int col = 0; col < gameBord.length; col++) {
            int row;
            for (row = 0; row < gameBord.length; row++) {
                if (gameBord[row][col] == player) {
                    flag = true;
                }
                else {
                    flag = false;
                    break;
                }
            }
            if (flag && row == gameBord.length) {
                return flag;
            }
        }

        // cheak for Diganal--> \
        for (int row = 0; row < gameBord.length; row++) {
            int col = row;
            if (gameBord[row][col] == player) {
                flag = true;
            }
            else {
                flag = false;
                break;
            }
            if (flag && row == gameBord.length-1) {
                return flag;
            }
        }
        // cheak for Diganal--> /
        for (int row = 0; row < gameBord.length; row++) {
            int col = gameBord.length-1-row;
            if (gameBord[row][col] == player) {
                flag = true;
            }
            else {
                flag = false;
                break;
            }
            if (flag && row == gameBord.length-1) {
                return flag;
            }
        }
        
        return flag;
    }
}
