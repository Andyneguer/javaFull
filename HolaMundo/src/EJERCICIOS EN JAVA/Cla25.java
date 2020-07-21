import javax.swing.*;

public class Cla25 extends JFrame{

	private JLabel camila;
	
	public Cla25(){
	setLayout(null);
	camila=new JLabel();
	camila.setBounds(10,20,300,200);
	add(camila);
	}
public static void main(String []args){
	
	Cla25 andy=new Cla25();
	andy.setBounds(0,0,400,500);
	andy.setResizable(false);
	andy.setVisible(true);
	andy.setLocationRelativeTo(null);
	}
}