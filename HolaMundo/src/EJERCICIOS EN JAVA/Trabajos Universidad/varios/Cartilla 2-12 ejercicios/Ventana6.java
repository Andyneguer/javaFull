import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
public class Ventana6 extends JFrame{  
public Ventana6(){
super ("Ejemplo Linea");
Container c = getContentPane();
c.setLayout(new FlowLayout());
this.setSize(250,250);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setVisible(true);

}
public static void main (String [] args){
Ventana6 v = new Ventana6();
}

public void paint (Graphics g){
super.paint(g);
Graphics2D g2 = (Graphics2D)g;
// Dibujo dela línea
g2.setColor(Color.pink);
g2.setStroke(new BasicStroke(3.0f));
Line2D l = new Line2D.Float(50.0f,50.0f,200.0f,200.0f);
g2.draw(l);
}
}
