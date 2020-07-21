import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
public class Ventana8 extends JFrame {
public Ventana8 () {
super ("Ejemplo rectangulo redondeado");
Container c = getContentPane();
c.setLayout(new FlowLayout());
this.setSize(250,250);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setVisible(true);

}
public static void main (String [] args){
Ventana8 v = new Ventana8();
}

public void paint (Graphics2D g){
super.paint(g);
Graphics2D g2 = (Graphics2D)g;
// Dibujo delrectángulo redondeado
g2.setColor(Color.pink);
g2.setStroke(new BasicStroke(3.0f));
}
}


RoundRectangle2D q = new RoundRectangle2D.Float(50.0f,50.0f, 100.0f, 150.0f,25.0f,25 .0f);
g2.draw(q);
}
}