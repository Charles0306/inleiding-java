import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Knoppen extends Applet {
    Button knop;
    String schermtekst;

    public void init() {
        schermtekst = "Deze knop doet iets";
        knop = new Button("Klik op mij");
        Knoplistener kl = new Knoplistener();
        knop.addActionListener( kl );
        add(knop);

    }
    public void paint(Graphics g) {
        g.drawString("schermtekst", 50,  60);
    }
    class Knoplistener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            schermtekst = "Yo, dit doet iets";
            repaint();
    }
     }
}