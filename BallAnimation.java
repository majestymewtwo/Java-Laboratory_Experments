
//10
import java.applet.Applet;
import java.awt.*;

public class BallAnimation extends Applet implements Runnable {
    int width = 40, height = 40;

    @Override
    public void init() {
        Thread animationThread = new Thread(this);
        animationThread.start();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(10, 40, width, height);
    }

    @Override
    public void run() {
        while (true) {
            try {
                for (int i = 0; i < 10; i++) { // Modify the loop to control the number of threads and resize steps
                    width += 1;
                    height += 1;
                    repaint();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException exception) {
                break;
            }
        }
    }
}
/*
 * <applet code="BallAnimation.class" height="500" width="300" ></applet>
 */