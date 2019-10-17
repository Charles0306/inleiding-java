package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {
    TextField tv;
    boolean Firstnumber;
    int Hoogstenummer;
    int Laagstenummer;
    int UserInput;
    String Nope;


    public void init() {
        tv = new TextField( "", 20 );
        tv.addActionListener( new Tekstvaklistener() );
        add( tv );
        Hoogstenummer = 0;
        Laagstenummer = 0;
        Firstnumber = true;
        Nope = "";
    }

    public void paint(Graphics g) {
        g.drawString( " Hoogstenummer " + ( Hoogstenummer ),  50, 60 );
        g.drawString( " Laagstenummer " + ( Laagstenummer ),  50, 80 );
        g.drawString( Nope ,50,100 );
    }

    class Tekstvaklistener implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            String UserInputString = tv.getText();
            UserInput = Integer.parseInt( UserInputString );
            if (Firstnumber) {
                Firstnumber = false;
                Hoogstenummer = UserInput;
                Laagstenummer = UserInput;
                repaint();
            } else {
                if (UserInput > Hoogstenummer) {
                    Hoogstenummer = UserInput;
                    Nope = "";
                    repaint();
                } else if (UserInput < Laagstenummer) {
                    Laagstenummer = UserInput;
                    Nope = "";
                    repaint();
                } else {
                    Nope = " sorry maar " + UserInput + " Is niet hoger dan " + Hoogstenummer + " En lager dan " + Laagstenummer;
                    repaint();
                }
            }
        }
    }
}