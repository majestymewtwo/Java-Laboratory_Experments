
//11A
import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;

public class MouseMove extends Applet {
    private String message = "Move mouse cursor into the window";

    @Override
    public void paint(Graphics g) {
        g.drawString(message, 20, 20);
    }

    @Override
    public boolean mouseEnter(Event evt, int x, int y) {
        // TODO Auto-generated method stub
        message = "Mouse x " + x + " y " + y;
        repaint();
        return true;
    }

    @Override
    public boolean mouseExit(Event evt, int x, int y) {
        message = "Mouse left the window";
        repaint();
        return true;
    }

    @Override
    public boolean mouseMove(Event evt, int x, int y) {
        message = "Mouse x " + x + " y " + y;
        repaint();
        return true;
    }

    @Override
    public boolean mouseDrag(Event evt, int x, int y) {
        message = "Mouse x " + x + " y " + y;
        repaint();
        return true;
    }
}
/*
 * <applet code = "MouseMove.class" width="300" height="500"></applet>
 */