/*
 * Seth Levine 
 *  OOP Othello  * 
 */
package userInterface;

import core.Game;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author smaniii
 */
public class OthelloUi extends  JFrame{
    
    Game game;
    GameUi gameUi;
    BoardUi boardUi;
    public void initComponents() {
        
        this.setPreferredSize(new Dimension(1200,700));
        this.setMinimumSize(new Dimension(1200,700));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameUi = new GameUi();
        boardUi = new BoardUi();
        this.add(gameUi, BorderLayout.NORTH);
        this.add(boardUi, BorderLayout.CENTER);
        this.setVisible(true);
        gameUi.initComponents();
        boardUi.initComponents();
    }

    

}
