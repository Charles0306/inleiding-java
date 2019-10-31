package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {


    public void init() {


    }


    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for (teller = 3; y <= 30; y++) {
            g.drawString( "" + teller , 60, teller );
            teller *= 3;
        }
    }
}

