import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cla37 extends JFrame implements ActionListener{
	
	private JMenuBar cami;
	private JMenu andy, brito, rocky;
	private JMenuItem goku, gohan, picoro, goten, vegeta, crilin;
	
	public Cla37(){
	setLayout(null);
	cami=new JMenuBar();
	setJMenuBar(cami);
	cami.setBounds(0,0,300,200);
	
	andy=new JMenu("Opciones");
	cami.add(andy);
	
	brito=new JMenu("Tamaño de ventana");
	andy.add(brito);
	goku=new JMenuItem("640*480");
	brito.add(goku);
	goku.addActionListener(this);
	gohan=new JMenuItem("800*600");
	brito.add(gohan);
	gohan.addActionListener(this);
	picoro=new JMenuItem("1024*768");
	brito.add(picoro);
	picoro.addActionListener(this);
				
	rocky=new JMenu("Color de fondo");
	andy.add(rocky);
	goten=new JMenuItem("Futsia");
	rocky.add(goten);
	goten.addActionListener(this);
	vegeta=new JMenuItem("Morado");
	rocky.add(vegeta);
	vegeta.addActionListener(this);
	crilin=new JMenuItem("Azul Clarito");
	rocky.add(crilin);
	crilin.addActionListener(this);
	}
public void actionPerformed(ActionEvent a){
	
	if(a.getSource()==goku){
        	setSize(640,480);
        }
        if(a.getSource()==gohan){
          	setSize(800,600);
        }
	if(a.getSource()==picoro){
		setSize(1024,768);
	}
        if(a.getSource()==goten){
            	getContentPane().setBackground(new Color(255,20,147));
        }
        if(a.getSource()==vegeta){
            	getContentPane().setBackground(new Color(178,58,238));
        }
	if(a.getSource()==crilin){
		getContentPane().setBackground(new Color(0,178,238));	
	}
    }
public static void main(String[] args) {
 
       	Cla37 form=new Cla37();
        form.setBounds(0,0,300,200);
        form.setVisible(true);
	form.setLocationRelativeTo(null);
	}     
}	
	

