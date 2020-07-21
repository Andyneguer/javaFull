import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Acuerdos extends JFrame implements ActionListener, ChangeListener{
	
	private JLabel cami, rocky;
	private JTextArea brito;
	private JCheckBox andy;
	private JScrollPane gohan;
	private JButton boton, goku;
	String nombre="";

	public Acuerdos(){
	setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setTitle("Nosotros");
	setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
	Bienvenida ventPrincipal=new Bienvenida();
	nombre= ventPrincipal.texto;	
	
	cami=new JLabel("TERMINOS & CONDICIONES");
	cami.setBounds(215,5,200,30);
	cami.setFont(new Font("Andale Mono", 1, 14));
	cami.setForeground(new Color(0,0,0));
	add(cami);
	
	brito=new JTextArea();
	brito.setEditable(false);
	brito.setFont(new Font("Andale Mono", 0, 9));
	brito.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                    "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN." +
                    "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
                    "\n            C.  ANDRES ARBOLEDA NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                    "\n          (ANDRES ARBOLEDA EL AUTOR), NO SE RESPONSABILIZA DEL USO QUE USTED" + 
                    "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (CANCELAR) Y NO UTILICE ESTE SOFTWARE." + 
                    "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                    "\n          https://www.facebook.com/");

	gohan=new JScrollPane(brito);
	gohan.setBounds(10,40,575,200);
	add(gohan);
	
	andy=new JCheckBox("Yo "+ nombre +" Acepto");
	andy.setBounds(10,250,300,30);
	andy.addChangeListener(this);
	add(andy);

	boton=new JButton("Continuar");
	boton.setBounds(10,290,100,30);
	boton.addActionListener(this);
	boton.setEnabled(false);
	add(boton);
	
	
	goku=new JButton("Cancelar");
	goku.setBounds(120,290,100,30);
	goku.addActionListener(this);
	goku.setEnabled(true);
	add(goku);
	
	ImageIcon imagen=new ImageIcon("images/logo-coca.png");
	rocky=new JLabel(imagen);
	rocky.setBounds(315,135,300,300);
	add(rocky);
	}

public void stateChanged(ChangeEvent a){
	
	if(andy.isSelected()==true){
		boton.setEnabled(true);
		goku.setEnabled(false);
	    }else{
       		boton.setEnabled(false);
		goku.setEnabled(true);
	}
	}

public void actionPerformed(ActionEvent a){

	if(a.getSource()==boton){

		Datos ventanaPrincipal = new Datos();
	        ventanaPrincipal.setBounds(0,0,640,535);
        	ventanaPrincipal.setVisible(true);
        	ventanaPrincipal.setResizable(false);
        	ventanaPrincipal.setLocationRelativeTo(null);
		this.setVisible(false);

	}else if(a.getSource()==goku){

		Bienvenida goku=new Bienvenida();
		goku.setBounds(0,0,350,450);
		goku.setVisible(true);
		goku.setLocationRelativeTo(null);
		goku.setResizable(false);
		this.setVisible(false);
	}
	}
public static void main(String []args){
	
		Acuerdos form=new Acuerdos();
		form.setBounds(0,0,600,360);
		form.setVisible(true);
		form.setLocationRelativeTo(null);
		form.setResizable(false);
	}
}






