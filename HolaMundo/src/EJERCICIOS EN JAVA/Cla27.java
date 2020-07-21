import javax.swing.*;
import java.awt.event.*;
public class Cla27 extends JFrame implements ActionListener{
	
	private JLabel label1;
	private JLabel label2;
	private JButton boton1;
	
	public Cla27(){
	setLayout(null);
	label1=new JLabel("Andy y Brito.");
	label1.setBounds(12,20,300,30);
	add(label1);
	label2=new JLabel("algo");
	label2.setBounds(10,100,100,30);
	add(label2);
	boton1=new JButton("Cerrar");
	boton1.setBounds(300,250,100,30);
	add(boton1);
	boton1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent andy){
	if(andy.getSource()==boton1){
	System.exit(0);
	}
	}
	
	public static void main(String args[]){

	Cla27 form1=new Cla27();
	form1.setBounds(0,0,300,200);
	form1.setResizable(false);
	form1.setVisible(true);
	form1.setLocationRelativeTo(null);
	form1.setResizable(false);
	}
}
