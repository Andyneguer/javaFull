import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cla36 extends JFrame implements ActionListener{

	private JMenuBar cami;
	private JMenu andy;
	private JMenuItem brito, goku, gohan; 
	
	public Cla36(){
	setLayout(null);
	cami=new JMenuBar();
	setJMenuBar(cami);
	
	andy=new JMenu("Color");
	cami.add(andy);
	
	brito=new JMenuItem("Rojo");
	brito.addActionListener(this);
	andy.add(brito);

	goku=new JMenuItem("Verde");
	goku.addActionListener(this);
	andy.add(goku);
	
	gohan=new JMenuItem("Azul");
	gohan.addActionListener(this);
	andy.add(gohan);
	}
	
	public void actionPerformed(ActionEvent a){
		Container fondo=this.getContentPane();
	
		if(a.getSource()==brito){
		fondo.setBackground(new Color(255,0,0));
		}
		if(a.getSource()==goku){
		fondo.setBackground(new Color(0,255,0));
		}
		if(a.getSource()==gohan){
		fondo.setBackground(new Color(0,0,255));
		}
	}
public static void main(String []args){
	
	Cla36 form=new Cla36();
	form.setBounds(0,0,400,300);
	form.setVisible(true);
	form.setLocationRelativeTo(null);
	form.setResizable(true);
	}
}
	
	