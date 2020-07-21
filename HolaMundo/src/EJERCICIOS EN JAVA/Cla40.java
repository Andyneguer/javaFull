import javax.swing.*;
import javax.swing.event.*;

public class Cla40 extends JFrame implements ChangeListener{

	private JRadioButton cami, andy, brito;
	private ButtonGroup rocky;
	
	public Cla40(){
	setLayout(null);
	rocky=new ButtonGroup();
	cami=new JRadioButton("640*480");
	cami.setBounds(10,20,100,30);
	cami.addChangeListener(this);
	add(cami);
	rocky.add(cami);
	andy=new JRadioButton("800*600");
	andy.setBounds(10,70,100,30);
	andy.addChangeListener(this);
	add(andy);
	rocky.add(andy);
	brito=new JRadioButton("1024*768");
	brito.setBounds(10,120,100,30);
	brito.addChangeListener(this);
	add(brito);
	rocky.add(brito);
	}
public void stateChanged(ChangeEvent a){
	
        if (cami.isSelected()) {
            setSize(640,480);
        }
        if (andy.isSelected()) {
            setSize(800,600);
        }
        if (brito.isSelected()) {
            setSize(1024,768);
        } 
	}
public static void main(String []args){
	
	Cla40 form=new Cla40();
	form.setBounds(0,0,350,230);
	form.setVisible(true);
	form.setLocationRelativeTo(null);
	}
}
   
	