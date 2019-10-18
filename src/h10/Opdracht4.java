package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {
    TextField tv;
    Label label;
    String s, tekst;
    int jaartal;


    public void init() {
        tv = new TextField( "", 20 );
        tv.addActionListener( new TekstvakListener() );
        add( tv );

        label = new Label( "Druk op enter om de shrikkeljaar te zien" );
        add( label );

        tekst = "";
    }

    public void paint(Graphics g) {
        g.drawString( tekst, 50, 80 );

    }

    class TekstvakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            s = tv.getText();
            jaartal = Integer.parseInt( s );
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                tekst = "" + jaartal + " is een schrikkeljaar ";
            } else {
                tekst = "" + jaartal + " is geen schrikkeljaar";
            }
             repaint();
        }
    }
}