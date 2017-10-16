package bouncing_ball;

import javax.swing.JFrame;

/**
 *
 * @author JeffSaa
 */
public class WFrame extends JFrame{
    
    public WFrame(){
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new Drawer(getWidth(), getHeight()));
        setVisible(true);
    }
    
}
