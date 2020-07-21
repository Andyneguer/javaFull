import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
public class Ventana7 extends JFrame{
public Ventana7(){
super ("Ejemplo Rectangulo");
Container c = getContentPane();
c.setLayout(new FlowLayout());
this.setSize(250,250);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setVisible(true);

}
public static void main (String [] args){
Ventana7 v = new  Ventana7();
}

public void paint (Graphics g){ 
super.paint(g);
Graphics2D g2 = (Graphics2D)g;
// Creacion del Rectangle2D
g2.setColor(Color.red);
g2.setStroke(new BasicStroke(3.0f));
Rectangle2D r = new Rectangle2D.Float(100.0f, 75.0f, 50.0f, 100.0f);
g2.draw(r);
}
}