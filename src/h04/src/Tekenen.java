import java.applet.Applet;
import java.awt.*;



    public class Tekenen extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRect(60,100,200,150);
        g.drawRect(200, 150, 50,100);
        g.drawRect(100,140,50,60);
        g.drawLine(155,10,60,100);
        g.drawLine(264,101,155,10);
        }
    }


