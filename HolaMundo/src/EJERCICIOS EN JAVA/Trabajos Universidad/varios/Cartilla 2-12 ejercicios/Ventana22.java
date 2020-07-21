import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
public class Ventana22 extends JFrame { 
public Ventana22(){
super ("Crepusculo");
Container c = getContentPane();
c.setLayout(new FlowLayout());
this.setSize(250,250);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setVisible(true);

}
public static void main (String [] args){
Ventana22 v = new Ventana22();
}

public void paint (Graphics g){
Graphics2D g2 = (Graphics2D)g;
//Dibujo del cielo. Este es el fondo.
//Se ha usado gradiente que va desde el azul al negro
GradientPaint gp 1 = new GradienPaint(10.0f 125.0f,Color.blue,250.0f, 125.0f, Color.black);
Rectangle2D r = new Rectangle2D.Double( 0.0, 0.0,250.0, 250.0);
g2.setPaint(gp1);
g2.fill(r);
//Dibujo de la luna sobre el fondo
GradientPaint gp2 = new REctangle2D.(50.0f,50.0f,Color.yellow,300.0f, 50.0f, Color.darkGray);
g2.setPaint(gp2);
Ellipse2D e1 = new Ellipse2D.Double(70.0, 100.0, 80.0, 80.0);
Ellipse2D e2 = new Ellipse2D.Double(100.0, 100.0, 80.0, 80.0);
Area a1 = new Area(e1);
Area a2 = new Area(e2);
a1.subtract(a2);
g2.fill(a1);
}
}








