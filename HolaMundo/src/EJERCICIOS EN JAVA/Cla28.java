import javax.swing.*;
import java.awt.event.*;

public class Cla28 extends JFrame implements ActionListener{
	
	private JLabel brito;	
	private JButton boton, boton1, boton2;
	
	public Cla28(){
	setLayout(null);
	boton=new JButton("OP1");
	boton.setBounds(10,100,90,30);
	add(boton);
	boton.addActionListener(this);//this significa ESTE o ESTA	
	
	boton1=new JButton("OP2");
	boton1.setBounds(110,100,90,30);
	add(boton1);
	boton1.addActionListener(this);
	
	boton2=new JButton("OP3");
	boton2.setBounds(210,100,90,30);
	add(boton2);
	boton2.addActionListener(this);
	
	brito=new JLabel("En espera.......");
	brito.setBounds(10,10,300,30);
	add(brito);
	}
public void actionPerformed(ActionEvent andy){ //ActionEvent significa capturar los eventos
	if(andy.getSource()==boton){
		brito.setText("Andy te ama");
	}
	if(andy.getSource()==boton1){
		brito.setText("My Jingglypuff");
	}
	if(andy.getSource()==boton2){
		brito.setText("Cuidemos Esto amor");
	}
	}
public static void main(String []args){
	
	Cla28 form1=new Cla28();
	form1.setBounds(0,0,450,200);
	form1.setResizable(false);
	form1.setVisible(true);
	form1.setLocationRelativeTo(null);
	form1.setResizable(false);
	}
}




