package h10;

import org.omg.IOP.ENCODING_CDR_ENCAPS;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {
    TextField tekstvak;
    String s, tekst;
    int Engels;
    int Duits;
    int Lo;
    int Gemiddelde;

    public void init() {
        tekstvak = new TextField( "", 20 );
        tekstvak.addActionListener( new TekstvakListener () );
        tekstvak.addActionListener( new TekstvakListener2() );
        tekst = "";
        add( tekstvak );
        s = "";

        Engels = 6;
        Duits= 5;
        Lo = 4;
        Gemiddelde = Engels + Duits + Lo /4;
    }

    public void paint(Graphics g) {
        g.drawString( " Engels "  + Engels ,50,60 );
        g.drawString( " Duits " +   Duits  ,50,80 );
        g.drawString( " Lo " +       Lo  ,50,100 );
        g.drawString( " Gemiddelde " + Gemiddelde,50,120 );


    }
    class TekstvakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            Engels = Integer.parseInt( s );
            repaint();

        }

    }
    class TekstvakListener2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            tekst = tekstvak.getText( );
            Duits = Integer.parseInt( tekst );


        }


    }
}

}
