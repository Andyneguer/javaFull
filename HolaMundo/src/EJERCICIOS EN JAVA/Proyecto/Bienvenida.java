import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Bienvenida extends JFrame implements ActionListener{

	private JTextField cami;
	private JLabel andy, brito, rocky, gohan;
	private JButton boton;
	public static String texto="";
	
	public Bienvenida(){
	setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setTitle("Bienvenido");
	getContentPane().setBackground(new Color(255,0,0));
	setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
	
	ImageIcon imagen=new ImageIcon("images/logo-coca.png");
	andy=new JLabel(imagen);
	andy.setBounds(25,15,300,150);
	add(andy);
	
	brito=new JLabel("Sistema De Control Vacacional");
	brito.setBounds(35,135,300,30);
	brito.setFont(new Font("Andale Mono", 3, 18));
	brito.setForeground(new Color(255,255,255));
	add(brito);
	
	rocky=new JLabel("Ingresa tu Nombre");
	rocky.setBounds(45,212,200,30);
	rocky.setFont(new Font("Andale Mono", 1, 12));
	rocky.setForeground(new Color(255,255,255));
	add(rocky);

	gohan=new JLabel("©2018 The Coca-Cola Company");
	gohan.setBounds(85,375,300,30);
	gohan.setFont(new Font("Andale Mono", 1, 12));
	gohan.setForeground(new Color(255,255,255));
	add(gohan);
	
	cami=new JTextField();
	cami.setBounds(45,240,255,25);
	cami.setBackground(new Color(224,224,224));
	cami.setFont(new Font("Andale Mono", 1, 14));
	cami.setForeground(new Color(255,0,0));
	add(cami);
	
	boton=new JButton("Ingresar");
	boton.setBounds(125,280,100,30);
	boton.setBackground(new Color(255,255,255));
	boton.setFont(new Font("Andale Mono", 1, 14));
	boton.setForeground(new Color(255,0,0));
	boton.addActionListener(this);
	add(boton);
	}

public void actionPerformed(ActionEvent a){

	if(a.getSource()==boton){
		texto=cami.getText().trim();
		if(texto.equals("")){
			JOptionPane.showMessageDialog(null, "Debes Ingresar tu Nombre");
		}else {
			Acuerdos form=new Acuerdos();
			form.setBounds(0,0,600,360);
			form.setVisible(true);
			form.setLocationRelativeTo(null);
			form.setResizable(false);
			this.setVisible(false);
		}
	    }
	}
public static void main(String []args){
	
		Bienvenida goku=new Bienvenida();
		goku.setBounds(0,0,350,450);
		goku.setVisible(true);
		goku.setLocationRelativeTo(null);
		goku.setResizable(false);
	}
}