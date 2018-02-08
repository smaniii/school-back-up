/*
Seth Levine 
OOP Othello
 */
package core;
import static core.Constants.*;

/**
 *
 * @author smaniii
 */
//create the board and set the starting posistions
public class Board {
    private Disc[][] board;
    public void initObjects() {
         Disc[][] board = new Disc[ROWS][COLUMNS];
         board[3][3].setDiscColor(Constants.LIGHT);
         board[3][4].setDiscColor(Constants.DARK);
         board[4][3].setDiscColor(Constants.DARK);
         board[4][4].setDiscColor(Constants.LIGHT);
        
    }

    /**
     * @return the board
     */
    public Disc[][] getBoard() {
        return board;
    }

    /**
     * @param board the board to set
     */
    public void setBoard(Disc[][] board) {
        this.board = board;
    }
    
}
