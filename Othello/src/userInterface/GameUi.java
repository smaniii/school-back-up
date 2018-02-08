/*
 * Seth Levine 
 *  OOP Othello  * 
 */
package userInterface;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author smaniii
 */
public class GameUi extends  JPanel {

    JLabel nameOne;
    JLabel nameTwo;
    JLabel scoreOne;
    JLabel scoreTwo;
    void initComponents() {
        
        this.setPreferredSize(new Dimension(1000,100)); 
        this.setMinimumSize(new Dimension(1000,100));
        nameOne = new JLabel("Player 1: Seth ");
        nameOne.setMinimumSize(new Dimension(200,50));
        scoreOne = new JLabel(" Score 1: Over 9000 ");
        scoreOne.setMinimumSize(new Dimension(200,50));
        nameTwo = new JLabel(" Player 2: Seth 2 ");
        nameTwo.setMinimumSize(new Dimension(200,50));
        scoreTwo = new JLabel(" Score 2: Over 8000");
        scoreTwo.setMinimumSize(new Dimension(200,50));
        
        this.add(nameOne);
        this.add(scoreOne);
        this.add(nameTwo);
        this.add(scoreTwo);

        
        
    }

    

    
}
