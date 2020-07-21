import javax.swing.*;
import java.awt.event.*;

public class Cla33 extends JFrame implements ActionListener{

	private JTextField andy, brito;
	private JLabel cami, rocky, chic;
	private JButton boton;

	public Cla33(){
	setLayout(null);
	cami=new JLabel("Numero 1:");
	cami.setBounds(50,5,100,30);
	add(cami);

	rocky=new JLabel("Numero 2:");
	rocky.setBounds(50,35,100,30);
	add(rocky);
	
	chic=new JLabel("Resul:");
	chic.setBounds(120,80,100,30);
	add(chic);

	andy=new JTextField();
	andy.setBounds(120,10,150,20);
	add(andy);
	
	brito=new JTextField();
	brito.setBounds(120,40,150,20);
	add(brito);
	
	boton=new JButton("Suma");
	boton.setBounds(10,80,100,30);
	add(boton);
	boton.addActionListener(this);	
	}
public void actionPerformed(ActionEvent a){
	
	if(a.getSource()==boton){
		int num1=0, num2=0, resultado=0;
		num1 =Integer.parseInt(andy.getText());
		num2 =Integer.parseInt(brito.getText());
		resultado=num1+num2;
		chic.setText("Resul: " + resultado);
		}
	}
public static void main(String []args){
	
	Cla33 form=new Cla33();
	form.setBounds(0,0,300,150);
	form.setResizable(false);
	form.setVisible(true);
	form.setLocationRelativeTo(null);
	form.setResizable(false);
	}
}








