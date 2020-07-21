import javax.swing.*;
import java.awt.event.*;

public class Cla29 extends JFrame implements ActionListener{

	private JTextField andy;
	private JLabel brito;
	private JButton boton;

	public Cla29(){
	setLayout(null);//Agregar componentes atraves de coordenadas
	brito=new JLabel("Usuario:");
	brito.setBounds(10,10,100,30);
	add(brito);

	andy=new JTextField();
	andy.setBounds(120,17,150,20);
	add(andy);

	boton= new JButton("Aceptar");
	boton.setBounds(10,80,100,30);
	add(boton);
	boton.addActionListener(this);
	}
public void actionPerformed(ActionEvent a){
	
	if(a.getSource()==boton){
		String texto= andy.getText();
		setTitle(texto);
		}
	}
public static void main(String []args){
	
	Cla29 form= new Cla29();
	form.setBounds(0,0,300,150);
	form.setVisible(true);
	form.setResizable(false);
	form.setLocationRelativeTo(null);
	}
}
		