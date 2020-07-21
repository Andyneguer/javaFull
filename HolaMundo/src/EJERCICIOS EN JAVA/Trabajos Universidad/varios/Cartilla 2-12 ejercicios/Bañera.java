import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
public class Bañera extends JFrame {  
public Bañera(){
super ("Bañera");
Container c = getContentPane();
c.setLayout(new FlowLayout());
this.setSize(250,250);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setVisible(true);

}
public static void main (String [] args){
Bañera v = new Bañera();
}

public void paint (Graphics g){
Graphics2D g2 = (Graphics2D)g;
Rectangle2D r = new Rectangle2D.Float(50.0f, 50.0f,110.0f, 200.0f);
RoundRectangle2D rr = new RoundRectangle2D.Float(60.0f,60.0f,90.0f,180.0f,25.0f,25.0f);
Ellipse2D e = new Ellipse2D.Float(100.0f, 80.0f, 10.0f, 10.0f);
g2.draw(r);
g2.draw(rr);
g2.draw(e);
}
}