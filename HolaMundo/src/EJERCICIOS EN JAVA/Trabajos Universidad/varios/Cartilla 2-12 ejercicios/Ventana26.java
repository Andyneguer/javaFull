import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
public class Ventana26 extends JFrame{  
public Ventana26(){
super ("Point2D");
Container c = getContentPane();
c.setLayout(new FlowLayout());
this.setSize(250,250);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setVisible(true);
}
public static void main (String [] args){
Ventana26 v = new Ventana26();
}
public void paint (Graphics g){
Graphics2D g2 = (Graphics2D)g;
g2.setStroke(new BasicStroke(3.0f));
Point2D p1 = new Point2D.Double(23.5, 48.9);
Point2D p2 = new Point2D.Double(158.0, 173.0);
Line2D | = new line2D.Double(p1,p2);
g2.draw(|);
}
}


 