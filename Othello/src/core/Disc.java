/*
Seth Levine 
OOP Othello
 */
package core;

import java.awt.Color;

/**
 *
 * @author smaniii
 */
//set up the discs
public class Disc {

    
    
    
    private Color discColor;

    /**
     * @return the discColor
     */
    public Color getDiscColor() {
        return discColor;
    }

    /**
     * @param discColor the discColor to set
     */
    public void setDiscColor(Color discColor) {
        this.discColor = discColor;
    }

    void setColor(Color LIGHT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
