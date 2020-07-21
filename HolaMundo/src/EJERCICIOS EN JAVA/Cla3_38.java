import java.awt.event.*;
import javax.swing.*;

public class Cla3_38 extends JFrame implements ActionListener{

	private JLabel cami;
	private JCheckBox brito, andy, rocky;
	private JButton boton;
	
	public Cla3_38(){
	setLayout(null);
	cami=new JLabel("Selecciona tu navegador favorito");
        cami.setBounds(10,10,200,30);
        add(cami);
	brito=new JCheckBox("Google Chrome");
        brito.setBounds(10,50,150,30);
        add(brito);
        andy=new JCheckBox("Mozilla Firefox");
        andy.setBounds(10,90,150,30);
        add(andy);
	rocky=new JCheckBox("Opera");
	rocky.setBounds(10,130,150,30);
	add(rocky); 
	boton=new JButton("Confirmar");
	boton.setBounds(10,170,100,30);
	add(boton);
	boton.addActionListener(this);
	}
public void actionPerformed(ActionEvent a){
	
	if(a.getSource()==boton){
		String cad="";
	if(brito.isSelected()==true){
		cad=cad+"Google Chrome";
	}
	if(andy.isSelected()==true){
		cad=cad+"Mozilla Firefox";
	}
	if(rocky.isSelected()==true){
		cad=cad+"Opera";
	}
		setTitle(cad);
	}
	
	}
public static void main(String []args){
	
	Cla3_38 form=new Cla3_38();
	form.setBounds(0,0,400,300);
	form.setVisible(true);
	form.setLocationRelativeTo(null);
	form.setResizable(false);
	}
}
	