package App;

import java.awt.Color;
import java.awt.event.*;

public class MouseMovement extends Panel implements MouseListener, MouseMotionListener
{
    //Variables 
    int xPos;
    int yPos;
    boolean isClicked = false;

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked (pressed and released) on a component      
        isClicked = true;
        if (isClicked)
        {
            System.out.println("Clicked");
            isClicked = false;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component.

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component. 

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component.
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component.
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Invoked when the mouse is dragged. 
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // Invokes when the mouse is being moved.
    } 
}
