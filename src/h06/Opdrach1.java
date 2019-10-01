package h06;

        import javax.swing.*;
        import java.applet.Applet;
        import java.awt.*;

public class Opdrach1 extends Applet {


    double getal1;
    double res;



    public void init() {
        getal1 = 113;

        res = getal1 / 4;


    }

    public void paint(Graphics g) {
        g.drawString("" + (res) ,80,60);
        g.drawString("" + (res) ,80,80);
        g.drawString("" + (res) ,80,100);
        g.drawString("" + (res) ,80,120);
        g.drawString( "jan =",50,60 );
        g.drawString( "Ali  =" ,50, 80 );
        g.drawString( "Jeanette =",20,100 );
        g.drawString( "Charles =",20,120 );
    }
}

