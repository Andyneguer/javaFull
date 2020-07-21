import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rectangulo extends JFrame implements ActionListener {
    private JMenuBar mb;
    private JMenu menuOpciones,menuColorFondo;
    private JMenuItem Gray,Dark_Gray,Cyan,Black,miSalir;
    private JLabel labelBienvenido;

    public Rectangulo() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pantalla principal");
        getContentPane().setBackground(new Color(255,220,220));


        mb = new JMenuBar ();
        mb.setBackground(new Color(255, 255, 255));
        add(mb);

        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(255, 0, 0));
        menuOpciones.setFont(new Font("Andale Mono", 1, 14));
        menuOpciones.setForeground(new Color(255, 255, 255));
        mb.add(menuOpciones);

        menuColorFondo = new JMenu("Color de fondo");
        menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
        menuColorFondo.setForeground(new Color(0, 0, 0));
        menuOpciones.add(menuColorFondo);

        Gray=new JMenuItem("Gray");
        Gray.setFont(new Font("Andale Mono", 1, 14));
        Gray.setForeground(new Color(128, 128,128));
        menuColorFondo.add(Gray);
        Gray.addActionListener(this);

        Dark_Gray=new JMenuItem("Dark Gray");
        Dark_Gray.setFont(new Font("Andale Mono", 1, 14));
        Dark_Gray.setForeground(new Color(169, 169, 169));
        menuColorFondo.add(Dark_Gray);
        Dark_Gray.addActionListener(this);

        Cyan=new JMenuItem("Cyan");
        Cyan.setFont(new Font("Andale Mono", 1, 14));
        Cyan.setForeground(new Color(0,255,255));
        menuColorFondo.add(Cyan);
        Cyan.addActionListener(this);

        Black=new JMenuItem("Black");
        Black.setFont(new Font("Andale Mono", 1, 14));
        Black.setForeground(new Color(0,0,0));
        menuColorFondo.add(Black);
        Black.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono", 1, 14));
        miSalir.setForeground(new Color(0, 0, 0));



    }

    public void actionPerformed(ActionEvent a) {


        if (a.getSource() == Gray){
            getContentPane().setBackground(new Color( 128, 128, 128 ));
        }
        if (a.getSource() == Dark_Gray){
            getContentPane().setBackground(new Color(169,169,169));
        }
        if (a.getSource() == Cyan){
            getContentPane().setBackground(new Color(0,255,255));
        }
        if (a.getSource() == Black){
            getContentPane().setBackground(new Color(0,0,0));
        }

    }


    public static void main(String args[]) {

        Rectangulo ventanaPrincipal = new Rectangulo ();
        ventanaPrincipal.setBounds(0,0,640,535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
    }

}

