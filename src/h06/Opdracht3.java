package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {


    int getal1;
    int getal2;
    int res;


    public void init() {
        getal1 = 10;
        getal2 = 15;

        res = getal2 / getal1 - 4;

    }

    public void paint(Graphics g) {
        g.drawString( "" + (res),50,70 );

    }
}
