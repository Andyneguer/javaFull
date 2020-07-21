import javax.swing.*;
import java.awt.event.*;

public class Cla32 extends JFrame implements ActionListener{

	private JTextField andy;
	private JTextArea brito;
	private JScrollPane rocky;
	private JButton boton;
	private JButton boton2;
	
	String cami= "";

	public Cla32(){
	setLayout(null);
	andy=new JTextField();
	andy.setBounds(10,10,200,30);
	add(andy);

	boton=new JButton("Agregar");
	boton.setBounds(250,10,100,30);
	add(boton);
	boton.addActionListener(this);
	
	brito=new JTextArea(); 
	rocky=new JScrollPane(brito);
	brito.setBounds(10,50,450,200);
	rocky.setBounds(10,50,450,200);
	add(rocky);
	
	boton2=new JButton("Salir");
	boton2.setBounds(10,300,100,30);
	add(boton2);
	}

public void actionPerformed(ActionEvent a){
	
	if(a.getSource()==boton){
		cami += andy.getText() + "\n";
		brito.setText(cami);
		andy.setText("");

	}if(a.getSource()==boton2){
		System.exit(0);
		}
	}

public static void main(String []args){

	Cla32 form=new Cla32();
	form.setBounds(0,0,540,400);
	form.setResizable(false);
	form.setVisible(true);
	form.setLocationRelativeTo(null);
	form.setResizable(false);
	}
}