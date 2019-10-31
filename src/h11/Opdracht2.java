package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {



    public void init() {


    }


    public void paint(Graphics g) {
        int teller = 20;
        int y = 10;

        while (teller >= 10) {
           g.drawString( "" + teller, 50,y );
            y += 20;
            teller--;
        }
    }
}
