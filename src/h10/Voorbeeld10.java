package h10;

import com.sun.deploy.security.SelectableSecurityManager;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Voorbeeld10 extends Applet {
      int leeftijd;
      TextField tekstvak;
      Label label;
      String tekst;


    public void init() {
        tekstvak = new TextField( "",5 );
        tekstvak.addActionListener( new VakListener() );
        tekst = "";

        label = new Label( " Geef uw leeftijd" );

        add( label );
        add( tekstvak );

    }

    public void paint(Graphics g) {
        g.drawString( tekst,50,45 );

    }
    class VakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
          String s;

          s = tekstvak.getText();
          leeftijd = Integer.parseInt( s );
          if ( leeftijd > 20);
          tekst = " U bent Goed ";
          repaint();

        }
        else {
            tekst = " U bent minderjarig";
            repaint();

        }

    }

}

