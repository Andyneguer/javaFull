import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
public class Ventana9 extends JFrame {
public Ventana9(){
super ("Ejemplo Elipse 2D");
Container c = getContentPane();
c.setLayout(new FlowLayout());
this.setSize(250,250);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setVisible(true);

}
public static void main (String [] args){
Ventana9 v = new Ventana9();
}

public void paint (Graphics g){
super.paint(g);
Graphics2D g2 =(Graphics2D)g;
g2.setColor(Color.orange);
g2.setStroke(new BasicStroke(3.0f));
Ellipse2D e = new Ellipse2D.Float(100.0f,75.0f,50.0f,100.0f);
}
}
g2.draw(e);