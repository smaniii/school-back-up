/*
Seth Levine 
OOP Othello
 */
package core;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author smaniii
 */

//lets start the game 
public class Game {
    private ArrayList<Player> players = new ArrayList<>(); //create player array
    Board board; //make the board 
    public void initObjects() { //create the objects 
        createPlayer();
        printPlayer(players);
        
    }

    private void createPlayer() { //create the playerss 
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Player player1 = new Player();
        Player player2 = new Player();
        player1.setName(JOptionPane.showInputDialog(null, "Enter player's name"));
        player2.setName(JOptionPane.showInputDialog(null, "Enter player's name"));
        player1.setDiscColor(Constants.DARK);
        player2.setDiscColor(Constants.LIGHT);
        players.add(player1);
        players.add(player2);
    }

    private void printPlayer(ArrayList<Player> players) { // print the players 
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int i = 0;
        System.out.println("The game has the following players:"); 
        for(i=0;i<2;i++){
            System.out.println("Player " + players.get(i).getName() +" is playing disc color " + players.get(i).getDiscColor());   
        }
   
    }


    
}
