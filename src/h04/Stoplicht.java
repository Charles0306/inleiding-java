import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {

    public void init () {

    }

    public void paint (Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.fillRect(40,30,60,140);
        g.setColor(Color.RED);
        g.fillOval(50,40,40,40);
        g.setColor(Color.YELLOW);
        g.fillOval(50,80,40,40);
        g.setColor(Color.GREEN);
        g.fillOval(50,120,40,40);

    }
}
