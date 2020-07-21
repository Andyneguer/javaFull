import javax.swing.*;
import java.awt.event.*;
//JComboBox
public class Cla34 extends JFrame implements ItemListener{

	private JComboBox cami;
	
	public Cla34(){
	setLayout(null);
	cami=new JComboBox();
	cami.setBounds(0,0,100,70);
	add(cami);

	cami.addItem("MENU");	// addItem significa añadir o agregar texto
	cami.addItem("AMOR");
	cami.addItem("AMISTAD");
	cami.addItem("RELACION");
	cami.addItem("SEXO");
	cami.addItem("AMANTES");
	cami.addItemListener(this);
	}
public void itemStateChanged(ItemEvent a){
	
	if(a.getSource()==cami){
		String selec= cami.getSelectedItem().toString();
		setTitle(selec);
		}
	}
public static void main(String []args){
	
	Cla34 form=new Cla34();
	form.setBounds(0,0,400,250);
	form.setVisible(true);
	form.setResizable(false);
	form.setLocationRelativeTo(null);
	}
}