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
    int Totaal;
    int getal1;
    int getal2;
    int getal3;
    int getal4;



    public void init() {

        knop1 = new Button("Mannen");
        knop1.addActionListener( new Knop1Listener() );
        add(knop1);


        knop2 = new Button("Vrouwen");
        knop2.addActionListener( new Knop2Listener() );
        add(knop2);

        knop3 = new Button("Jongens");
        knop3.addActionListener( new Knop3Listener() );
        add(knop3);

        knop4 = new Button("Meisjes");
        knop4.addActionListener( new Knop4Listener() );
        Component add = add( knop4 );



        getal1 = 0;
        getal2 = 0;
        getal3 = 0;
        getal4 = 0;

    }

    public void paint(Graphics g) {
      g.drawString(  " Mannen "  + ( getal1 ),50,70 );
        g.drawString(" Vrouwen " + ( getal2 ),50,90 );
        g.drawString(" Jongens " + ( getal3 ),50,110 );
        g.drawString(" Meisjes " + ( getal4 ),50,130 );
        g.drawString(" Totaal  " + ( Totaal ),50 ,170 );
      

    }

    class Knop1Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            getal1 ++;
            Totaal ++;
            repaint();
            
        }
    }

    class Knop2Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            getal2 ++;
            Totaal++;
            repaint();
        }

        private void init(String s) {
        }
    }

    class Knop3Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            getal3 ++;
            Totaal ++;
            repaint();
        }
    }

    class Knop4Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            getal4 ++;
            Totaal ++;
            repaint();

        }
    }

}



