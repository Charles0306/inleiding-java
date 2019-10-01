package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    int seconden;
    int uur;
    int dag;
    int jaar;
    int  res;
    int res2;
    int res3;



    public void init() {
        uur = 1;
       dag = 1440;
       jaar = 525948;
       seconden = 60;

       res = uur * seconden;
       res2 = dag * seconden;
       res3 = jaar * seconden;


    }

    public void paint(Graphics g) {
        g.drawString( " Seconden in een uur = "  + (res),50,100 );
        g.drawString( " Seconden in een dag  = " + ( res2 ), 50,120 );
        g.drawString( " Seconden in een jaar  = " + (res3),50,140);


    }
}

