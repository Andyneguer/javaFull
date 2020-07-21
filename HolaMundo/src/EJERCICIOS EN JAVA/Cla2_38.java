import javax.swing.*;
import javax.swing.event.*;

public class Cla2_38 extends JFrame implements ChangeListener{
    
	private JCheckBox cami;
    	private JCheckBox brito;
	private JCheckBox andy;
	
	public Formulario() {
        setLayout(null);
        cami=new JCheckBox("Ingl�s");
        cami.setBounds(10,10,150,30);
        cami.addChangeListener(this);
        add(cami);
        brito=new JCheckBox("Franc�s");
        brito.setBounds(10,50,150,30);
        brito.addChangeListener(this);        
        add(brito);
        andy=new JCheckBox("Alem�n");
        andy.setBounds(10,90,150,30);
        andy.addChangeListener(this);        
        add(andy);        
    	}
public void stateChanged(ChangeEvent a){
       
	String cad="";
        if(cami.isSelected()==true) {
            cad=cad+"Ingl�s-";
        }
        if(brito.isSelected()==true) {
            cad=cad+"Franc�s-";
        }
        if(andy.isSelected()==true) {
            cad=cad+"Alem�n-";
        }
        setTitle(cad);
	}
public static void main(String[] ar) {
        
	Cla2_38 form=new Cla2_38();
        form.setBounds(0,0,300,200);
        form.setVisible(true);
    	}    
}