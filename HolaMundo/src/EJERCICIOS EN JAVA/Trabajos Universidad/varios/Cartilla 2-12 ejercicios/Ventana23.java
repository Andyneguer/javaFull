import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
public class Ventana23 extends JFrame { 
public Ventana23(){
super ("Crepusculo");
Container c = getContentPane();
c.setLayout(new FlowLayout());
this.setSize(250,250);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setVisible(true);

}
public static void main (String [] args){
Ventana23 v = new Ventana23();
}

public void paint (Graphics g){
super.paint(g);
Graphics2D g2 = (Graphics2D)g;
g2.setColor(Color.blue);
g2.setStroke(new BasicStroke(3.0f));
QuadCurve2D q = new QuadCurve2D.Float(
40.0f,70.0f,40.0f, 170.0f, 190.0f, 220.0f);
g2.draw(q);
g2.setColor(color.red);
g2.draw(new Rectangle2D.Float(40.0f, 70.0f, 1.0f, 1.0f));
g2.draw(new Rectangle2D.Float(40.0f, 170.0f, 1.0f, 1.0f));
g2.draw(new Rectangle2D.Float(190.0f, 220.0f, 1.0f, 1.0f));
}
}