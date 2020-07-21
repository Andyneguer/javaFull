import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
	
public class Cla38 extends JFrame implements ActionListener, ChangeListener{
	
	private JLabel cami;
	private JCheckBox brito;
	private JButton boton;
	
	public Cla38(){
	setLayout(null);
	cami=new JLabel("Esta de acuerdo con las normas del Servicio");
	cami.setBounds(10,10,400,30);
	add(cami);
	brito=new JCheckBox("Acepto");
	brito.setBounds(10,50,100,30);
	brito.addChangeListener(this);
	add(brito);
	boton=new JButton("Continuar");
	boton.setBounds(10,100,100,30);
	add(boton);
	boton.addActionListener(this);
	boton.setEnabled(false);
	}
public void stateChanged(ChangeEvent a){
	
	if(brito.isSelected()==true){
		boton.setEnabled(true);
	}
	if(brito.isSelected()==false){
		boton.setEnabled(false);
	}
	}
public void actionPerformed(ActionEvent a){
	
	if(a.getSource()==boton){
		System.exit(0);			
	}
	}
public static void main(String []args){
	
	Cla38 form=new Cla38();
	form.setBounds(0,0,350,200);
	form.setVisible(true);
	form.setLocationRelativeTo(null);
	form.setResizable(false);
	}
}