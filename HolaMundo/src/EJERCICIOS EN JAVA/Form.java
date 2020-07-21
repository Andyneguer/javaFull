import javax.swing.*;

public class Form extends JFrame{

	private JLabel andy;
	private JLabel brito;
	
	public Form(){
	setLayout(null);
	andy=new JLabel("Interfaz grafica");
	andy.setBounds(10,20,300,30);
	add(andy);
	brito=new JLabel("Version 1.0");
	brito.setBounds(10,100,500,30);
	add(brito);
	}

public static void main(String []args){

	Form form_U=new Form();
	form_U.setBounds(0,0,300,200);
	form_U.setResizable(false);
	form_U.setVisible(true);
	form_U.setLocationRelativeTo(null);
	form_U.setResizable(false);
	}	
}