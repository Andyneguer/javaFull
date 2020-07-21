import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cla35 extends JFrame implements ActionListener{

	private JLabel cami, andy, brito;
	private JComboBox goku, gohan, goten;
	private JButton boton;

	public Cla35(){
	setLayout(null);
	cami=new JLabel("Rojo:");
	cami.setBounds(10,10,100,10);
	add(cami);	
	goku=new JComboBox();
	goku.setBounds(120,10,50,30);
	for(int i=0; i<=255; i++){
		goku.addItem(String.valueOf(i));
	}
	add(goku);

	andy=new JLabel("Verde");
	andy.setBounds(10,50,100,10);
	add(andy);
	gohan=new JComboBox();
	gohan.setBounds(120,50,50,30);
	for(int i=0; i<=255; i++){
		gohan.addItem(String.valueOf(i));
	}
	add(gohan);
	
	brito=new JLabel("Azul");
	brito.setBounds(10,90,100,10);
	add(brito);
	goten=new JComboBox();
	goten.setBounds(120,90,50,30);
	for(int i=0; i<=255; i++){
		goten.addItem(String.valueOf(i));
	}
	add(goten); 

	boton=new JButton("Mezclar");
	boton.setBounds(10,130,100,30);
	add(boton);
	boton.addActionListener(this);
	}
public void actionPerformed(ActionEvent a){
	if(a.getSource()==boton){
		String casd=goku.getSelectedItem().toString();
		String casd1=gohan.getSelectedItem().toString();
		String casd2=goten.getSelectedItem().toString();
		
		int rojo=Integer.parseInt(casd);
		int verde=Integer.parseInt(casd1);
		int azul=Integer.parseInt(casd2);
	
		Color colores=new Color(rojo,verde,azul);
		boton.setBackground(colores);
		}	
	}
public static void main(String []args){
	
	Cla35 dado=new Cla35();
	dado.setBounds(0,0,190,220);
	dado.setVisible(true);
	dado.setResizable(false);
	dado.setLocationRelativeTo(null);
	}
}