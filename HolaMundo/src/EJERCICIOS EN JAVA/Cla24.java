import javax.swing.*;

public class Cla24 extends JFrame{

	private JLabel cami;

	public Cla24(){
	setLayout(null);
	cami=new JLabel("Cami Te Amo Hija Mia");
	cami.setBounds(10,20,200,300);
	add(cami);
	}
public static void main(String []args){
	
	Cla24 andy=new Cla24();
	andy.setBounds(0,0,400,300);
	andy.setResizable(true);
	andy.setVisible(true);
	andy.setLocationRelativeTo(null);
	}
}