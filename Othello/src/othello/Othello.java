/*
Seth Levine 
OOP Othello
 */
package othello;
import userInterface.*;
import core.*;
/**
 *
 * @author smaniii
 */
public class Othello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game game = new Game(); //have memory for this game
        game.initObjects();//create the game objects 
        OthelloUi othelloui = new OthelloUi(); 
        othelloui.initComponents();
        
    }
    
}
