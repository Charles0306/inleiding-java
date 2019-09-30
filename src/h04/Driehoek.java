import java.applet.Applet;
import java.awt.*;





public class Driehoek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(100, 0, 0, 120);
        g.drawLine(120,110,90,0);
    }
}