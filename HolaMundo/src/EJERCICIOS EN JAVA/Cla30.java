import javax.swing.*;
import java.awt.event.*;

public class Cla30 extends JFrame implements ActionListener{

	private JTextField andy;
	private JTextArea brito;
	private JLabel cami;
	private JButton boton;

	public Cla30(){
	setLayout(null);
	cami=new JLabel();
	cami.setBounds(10,10,100,30);
	add(cami);

	andy=new JTextField();
	andy.setBounds(10,10,200,30);
	add(andy);

	brito=new JTextArea();
	brito.setBounds(10,50,450,200);
	add(brito);

	boton=new JButton("Enviar");
	boton.setBounds(10,300,100,30);
	add(boton);
	boton.addActionListener(this);
	}

public void actionPerformed(ActionEvent a){
	
	if(a.getSource()==boton){
		System.exit(0);
		}
	}

public static void main(String []args){
	
	Cla30 form=new Cla30();
	form.setBounds(0,0,700,400);
	form.setVisible(true);
	form.setResizable(false);
	form.setLocationRelativeTo(null);
	}
}
