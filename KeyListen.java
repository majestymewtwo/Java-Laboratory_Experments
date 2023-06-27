
//11B
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListen extends Applet implements KeyListener {
    String msg = "";

    @Override
    public void init() {
        addKeyListener(this);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        showStatus("Key is released");
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        showStatus("Key is typed");
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        showStatus("Key pressed");
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, 20, 20);
    }
}
/*
 * <applet code = "KeyListen.class" width="300" height="500"></applet>
 */
