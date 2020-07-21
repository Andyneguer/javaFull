import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
public class Ventana20 extends JFrame {

public Ventana20(){
super ("Ejemplo utilizando GeneralPath");
Container c = getContentPane();
c.setLayout(new FlowLayout());
this.setSize(250,250);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setVisible(true);

}
public static void main (String [] args){
Ventana20 v = new Ventana20();
}

public void paint (Graphics g){
Graphics2D g2 = (Graphics2D)g;
// Creacion del GeneralPath();
g2.setColor(Color.green);
GeneralPath gp = new GeneralPath();
gp.moveTo(50.0f,50.0f);
gp.lineTo(100.0f,50.0f);
gp.curveTo(120.0f,30.0f,120.0f,100.0f,180.0f,125.0f);
gp.lineTo(50.0f,150.0f);
gp.closePath();
// Relleno y contorno
g2.fill(gp);
g2.setColor(Color.blue);
g2.draw(gp);
}
}
