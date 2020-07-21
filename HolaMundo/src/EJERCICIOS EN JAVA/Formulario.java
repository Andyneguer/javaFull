import javax.swing.*;

public class Formulario extends JFrame{
	
	private JLabel labelandy;
	public Formulario(){
	setLayout(null);//setLayout significa coordenadas
	labelandy=new JLabel("Andy el terrible jejeje");
	labelandy.setBounds(10,20,200,300);
	add(labelandy);//add significa agregar
	}
	public static void main(String args[]){
		Formulario formulario1=new Formulario();
		formulario1.setBounds(0,0,400,300);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null);
		}
	}
	
