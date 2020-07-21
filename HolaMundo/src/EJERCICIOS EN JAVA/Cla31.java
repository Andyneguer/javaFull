import javax.swing.*;
import java.awt.event.*;

public class Cla31 extends JFrame implements ActionListener{

	private JTextField andy;
	private JTextArea brito;
	private JLabel cami;
	private JScrollPane rocky;
	private JButton boton;

	public Cla31(){
	setLayout(null);
	cami=new JLabel();
	cami.setBounds(10,10,100,30);
	add(cami);

	andy=new JTextField();
	andy.setBounds(10,10,200,30);
	add(andy);

	brito=new JTextArea();
	rocky=new JScrollPane(brito);
	brito.setBounds(10,50,450,200);
	rocky.setBounds(10,50,450,200);	
	add(rocky);

	boton=new JButton("Salir");
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
	
	Cla31 form=new Cla31();
	form.setBounds(0,0,540,400);
	form.setResizable(false);
	form.setVisible(true);
	form.setLocationRelativeTo(null);
	form.setResizable(false);


	}
}
	