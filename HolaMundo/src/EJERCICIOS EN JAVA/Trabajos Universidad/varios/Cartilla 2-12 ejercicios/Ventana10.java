import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
public class Ventana10 extends JFrame {  
public Ventana10(){
super ("La clase Arc2D");
Container c = getContentPane();
c.setLayout(new FlowLayout());
this.setSize(250,250);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setVisible(true);

}
public static void main (String [] args){
Ventana10 v = new Ventana10();
}

public void paint (Graphics g){
super.paint(g);
Graphics2D g2 = (Graphics2D)g; 
// Dibujo del rectangulo de referencia
g2.setColor(Color.blue);
g2.setStroke(new BasicStroke(1.0f));
Rectangle2D r = new Rectangle2D.Float(100.0f, 75.0f, 50.0f, 100.0f);
g2.draw(r);
// Dibujo del arco
g2.setColor(Color.red);
g2.setStroke(new BasicStroke(3.0f));
Arc2D a =
new Arc2D.Float(100.0f, 75.0f, 50.0f, 100.0f, 0.0f, 135.0f, Arc2D.PIE);
g2.draw(a);
}
}
