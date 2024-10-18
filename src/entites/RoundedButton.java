package entites;

import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Insets;

public class RoundedButton extends JButton {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int ARC_WIDTH = 20;  
    private static final int ARC_HEIGHT = 20; 

    public RoundedButton(String label) {
        super(label);
        setContentAreaFilled(false);
        setFocusPainted(false);      
        setBorderPainted(false);    
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isPressed()) {
            g.setColor(Color.LIGHT_GRAY); 
        } else if (getModel().isRollover()) {
            g.setColor(Color.GRAY);      
        } else {
            g.setColor(getBackground());
        }
        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, ARC_WIDTH, ARC_HEIGHT);
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, ARC_WIDTH, ARC_HEIGHT);
    }

    @Override
    public Insets getInsets() {
        return new Insets(10, 20, 10, 20);
    }
}