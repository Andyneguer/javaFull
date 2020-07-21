import javax.swing.*;

import java.awt.event.*;

public class Cla26 extends JFrame implements ActionListener{
	
	private JLabel label1;
	private JLabel label2;
	
	public Cla26(){

	setLayout(null);
	label1=new JLabel("Andy y Brito.");
	label1.setBounds(12,20,300,30);
	add(label1);
	label2=new JLabel("Amor Verdadero");
	label2.setBounds(10,100,100,30);
	add(label2);
	}
	
	public static void main(String args[]){

	Cla26 form1=new Cla26();
	form1.setBounds(0,0,300,200);
	form1.setResizable(false);
	form1.setVisible(true);
	form1.setLocationRelativeTo(null);
	form1.setResizable(false);
	}
}
