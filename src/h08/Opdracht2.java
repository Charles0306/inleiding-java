package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;
    int counterMannen;
    int CounterVrouwen;
    int CounterJongens;
    int CounterMeisjes;
    int Totaal;
    int a = +1;
    TextField tekstvak;

    public void init() {
        tekstvak = new TextField();

        knop1 = new Button("Mannen");
        add(knop1);

        knop2 = new Button("Vrouwen");
        add(knop2);

        knop3 = new Button("Jongens");
        add(knop3);

        knop4 = new Button("Meisjes");
        Component add = add( knop4 );

    }

    public void paint(Graphics g) {
      g.drawString(" Mannen " + a ,50,70);
      

    }

    class Knop1Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            repaint();
            
        }
    }

    class Knop2Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            repaint();
        }

        private void init(String s) {
        }
    }

    class Knop3Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            repaint();
        }
    }

    class Knop4Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            repaint();

        }
    }

}



