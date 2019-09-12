import java.awt.*;
import java.applet.*;

public class Geleovaal extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.YELLOW);
        g.fillArc(20,20,150,90,50,420);
    }
}