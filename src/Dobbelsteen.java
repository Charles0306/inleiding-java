import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    public void init() {

    }
    public void paint (Graphics g) {
        setBackground(Color.BLACK);
        g.setColor(Color.WHITE);
        g.fillRoundRect(20,20,100,100,10,10);
        g.setColor(Color.BLACK);
        g.fillOval(20,20,40,40);
        g.fillOval(80,20,40,40);
        g.fillOval(20,80,40,40);
        g.fillOval(80,80,40,40);
    }
 }