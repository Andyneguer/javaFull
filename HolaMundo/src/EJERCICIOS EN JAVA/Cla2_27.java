import javax.swing.*;
import java.awt.event.*;

public class Cla2_27 extends JFrame implements ActionListener{

	private JLabel andy;
	private JLabel brito;
	private JButton boton;

	public Cla2_27(){
	setLayout(null);
	andy=new JLabel("Andy & Brito");
	andy.setBounds(30,30,100,30);
	add(andy);
	brito=new JLabel("Tu eres la luz de mis ojos la niña que amo y adoro");
	brito.setBounds(10,70,1000,30);
	add(brito);
	boton=new JButton("Cerrar");
	boton.setBounds(300,200,100,30);
	add(boton);
	boton.addActionListener(this);
	}
public void actionPerformed(ActionEvent and){
	if(and.getSource()==boton){
	System.exit(0);
	}
	}
public static void main(String args[]){

	Cla2_27 form1=new Cla2_27();
	form1.setBounds(0,0,500,300);
	form1.setResizable(false);
	form1.setVisible(true);
	form1.setLocationRelativeTo(null);
	form1.setResizable(false);
	}
}