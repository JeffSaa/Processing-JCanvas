package bouncing_ball;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author JeffSaa
 */
public class Drawer extends Canvas implements ActionListener {

    Ball ball;
    Timer timer = new Timer(10, this);

    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == timer)
            repaint();
    }

    public Drawer(int w, int h) {
        setBackground(Color.BLACK);
        ball = new Ball(10, 10, 40, 20, w, h);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(ball.x, ball.y, ball.rad, ball.rad);
        ball.move();
    }

}
