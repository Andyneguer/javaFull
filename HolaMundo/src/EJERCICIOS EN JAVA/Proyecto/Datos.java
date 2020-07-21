import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Datos extends JFrame implements ActionListener{
  
    	private JMenuBar mb;
    	private JMenu menuOpciones,menuCalcular,menuAcercaDe,menuColorFondo;
    	private JMenuItem miCalculo,Rojo,Negro,Morado,Futsia,Azul,miElCreador,miSalir,miNuevo;
    	private JLabel labelLogo,labelBienvenido,labelTitle,labelNombre,labelAPaterno,labelAMaterno,
    	               labelDepartamento,labelAntiguedad,labelResultado,labelfooter;
    	private JTextField txtNombreTrabajador,txtAPaternoTrabajador,txtAMaternoTrabajador;
    	private JComboBox comboDepartamento,comboAntiguedad;
    	private JScrollPane scrollpane1; 
    	private JTextArea textarea1;
    	String nombreAdministrador = "";

    	public Datos() {
      	setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
     	setTitle("Pantalla principal");
      	getContentPane().setBackground(new Color(255,0,0));
      	setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
      	Bienvenida ventanaBienvenida = new Bienvenida();
      	nombreAdministrador = ventanaBienvenida.texto;

      	mb = new JMenuBar();
      	mb.setBackground(new Color(255, 0, 0));
      	setJMenuBar(mb);

      	menuOpciones = new JMenu("Opciones");
      	menuOpciones.setBackground(new Color(255, 0, 0));
      	menuOpciones.setFont(new Font("Andale Mono", 1, 14));
      	menuOpciones.setForeground(new Color(255, 255, 255));
      	mb.add(menuOpciones);

      	menuCalcular = new JMenu("Calcular");
      	menuCalcular.setBackground(new Color(255, 0, 0));
      	menuCalcular.setFont(new Font("Andale Mono", 1, 14));
      	menuCalcular.setForeground(new Color(255, 255, 255));
      	mb.add(menuCalcular);

      	menuAcercaDe = new JMenu("Acerca de");
     	menuAcercaDe.setBackground(new Color(255, 0, 0));
     	menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
      	menuAcercaDe.setForeground(new Color(255, 255, 255));
      	mb.add(menuAcercaDe);

	menuColorFondo = new JMenu("Color de fondo");
      	menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
      	menuColorFondo.setForeground(new Color(255, 0, 0));
      	menuOpciones.add(menuColorFondo);

      	miCalculo = new JMenuItem("Vacaciones");
      	miCalculo.setFont(new Font("Andale Mono", 1, 14));
      	miCalculo.setForeground(new Color(255, 0, 0));
      	menuCalcular.add(miCalculo);
      	miCalculo.addActionListener(this);

	Rojo=new JMenuItem("Rojo");
      	Rojo.setFont(new Font("Andale Mono", 1, 14));
      	Rojo.setForeground(new Color(255, 0, 0));
      	menuColorFondo.add(Rojo);
      	Rojo.addActionListener(this);

	Negro=new JMenuItem("Negro");
      	Negro.setFont(new Font("Andale Mono", 1, 14));
      	Negro.setForeground(new Color(255, 0, 0));
      	menuColorFondo.add(Negro);
	Negro.addActionListener(this);

	Morado=new JMenuItem("Morado");
      	Morado.setFont(new Font("Andale Mono", 1, 14));
      	Morado.setForeground(new Color(255,0,0));
      	menuColorFondo.add(Morado);
      	Morado.addActionListener(this);
	
	Futsia=new JMenuItem("Futsia");
	Futsia.setFont(new Font("Andale Mono", 1, 14));
	Futsia.setForeground(new Color(255,0,0));
	menuColorFondo.add(Futsia);
	Futsia.addActionListener(this);

	Azul=new JMenuItem("Azul Clarito");
	Azul.setFont(new Font("Andale Mono", 1, 14));
	Azul.setForeground(new Color(255,0,0));
	menuColorFondo.add(Azul);
	Azul.addActionListener(this);

      	miNuevo = new JMenuItem("Nuevo");
      	miNuevo.setFont(new Font("Andale Mono", 1, 14));
      	miNuevo.setForeground(new Color(255, 0, 0));
      	menuOpciones.add(miNuevo);
      	miNuevo.addActionListener(this);

      	miElCreador = new JMenuItem("El creador");
      	miElCreador.setFont(new Font("Andale Mono", 1, 14));
      	miElCreador.setForeground(new Color(255, 0, 0));
      	menuAcercaDe.add(miElCreador);
      	miElCreador.addActionListener(this);

      	miSalir = new JMenuItem("Salir");
      	miSalir.setFont(new Font("Andale Mono", 1, 14));
      	miSalir.setForeground(new Color(255, 0, 0));
      	menuOpciones.add(miSalir);
      	miSalir.addActionListener(this);

      	ImageIcon imagen = new ImageIcon("images/logo-coca.png");
      	labelLogo = new JLabel(imagen);  
      	labelLogo.setBounds(5,5,250,100);
      	add(labelLogo);

      	labelBienvenido = new JLabel("Bienvenido " + nombreAdministrador);  
      	labelBienvenido.setBounds(280,30,300,50);
      	labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
      	labelBienvenido.setForeground(new Color(255, 255, 255));
      	add(labelBienvenido);

      	labelTitle = new JLabel("Datos del trabajador para el cálculo de vacaciones");
      	labelTitle.setBounds(45,140,900,25);
      	labelTitle.setFont(new Font("Andale Mono", 0, 24));
      	labelTitle.setForeground(new Color(255, 255, 255));
      	add(labelTitle);

      	labelNombre = new JLabel("Nombres:");
      	labelNombre.setBounds(25,188,180,25);
      	labelNombre.setFont(new Font("Andale Mono", 1, 12));
      	labelNombre.setForeground(new Color(255, 255, 255));
      	add(labelNombre);

      	txtNombreTrabajador = new JTextField();
      	txtNombreTrabajador.setBounds(25,213,150,25);
      	txtNombreTrabajador.setBackground(new java.awt.Color(224, 224, 224));
      	txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
      	txtNombreTrabajador.setForeground(new java.awt.Color(255, 0, 0));
      	add(txtNombreTrabajador);

      	labelAPaterno = new JLabel("Apellido Paterno:");
      	labelAPaterno.setBounds(25,248,180,25);
      	labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
      	labelAPaterno.setForeground(new Color(255, 255, 255));
      	add(labelAPaterno);

	txtAPaternoTrabajador = new JTextField();
      	txtAPaternoTrabajador.setBounds(25,273,150,25);
      	txtAPaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
      	txtAPaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
      	txtAPaternoTrabajador.setForeground(new java.awt.Color(255, 0, 0));
      	add(txtAPaternoTrabajador);

	labelAMaterno = new JLabel("Apellido Materno:");
      	labelAMaterno.setBounds(25,308,180,25);
      	labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
      	labelAMaterno.setForeground(new Color(255, 255, 255));
      	add(labelAMaterno);

	txtAMaternoTrabajador = new JTextField();
      	txtAMaternoTrabajador.setBounds(25,334,150,25);
      	txtAMaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
      	txtAMaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
      	txtAMaternoTrabajador.setForeground(new java.awt.Color(255, 0, 0));
      	add(txtAMaternoTrabajador);

	labelDepartamento = new JLabel("Selecciona el Departamento:");
      	labelDepartamento.setBounds(220,188,180,25);
      	labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
      	labelDepartamento.setForeground(new Color(255, 255, 255));
      	add(labelDepartamento);

	comboDepartamento = new JComboBox();
      	comboDepartamento.setBounds(220,213,220,25);
      	comboDepartamento.setBackground(new java.awt.Color(224, 224, 224));
      	comboDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
      	comboDepartamento.setForeground(new java.awt.Color(255, 0, 0));
      	add(comboDepartamento);
      	comboDepartamento.addItem("");
      	comboDepartamento.addItem("Atención al Cliente");
      	comboDepartamento.addItem("Departamento de Logística");
	comboDepartamento.addItem("Departamento de Gerencia");

      	labelAntiguedad = new JLabel("Selecciona la Antigüedad:");
	labelAntiguedad.setBounds(220,248,180,25);
      	labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
      	labelAntiguedad.setForeground(new Color(255, 255, 255));
      	add(labelAntiguedad);

	comboAntiguedad = new JComboBox();
      	comboAntiguedad.setBounds(220,273,220,25);
      	comboAntiguedad.setBackground(new java.awt.Color(224, 224, 224));
      	comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
      	comboAntiguedad.setForeground(new java.awt.Color(255, 0, 0));
      	add(comboAntiguedad);
      	comboAntiguedad.addItem("");
      	comboAntiguedad.addItem("1 año de servicio");
      	comboAntiguedad.addItem("2 a 6 años de servicio");
      	comboAntiguedad.addItem("7 años o más de servicio");

	labelResultado = new JLabel("Resultado del Cálculo:");
      	labelResultado.setBounds(220,307,180,25);
      	labelResultado.setFont(new Font("Andale Mono", 1, 12));
      	labelResultado.setForeground(new Color(255, 255, 255));
      	add(labelResultado);

	textarea1 = new JTextArea();
      	textarea1.setEditable(false);
      	textarea1.setBackground(new Color(224, 224, 224));
      	textarea1.setFont(new Font("Andale Mono", 1, 11));
      	textarea1.setForeground(new Color(255, 0, 0));
      	textarea1.setText("\n   Aquí aparece el cálculo de las vacaciones.");
      	scrollpane1 = new JScrollPane(textarea1);
      	scrollpane1.setBounds(220,333,385,90);
      	add(scrollpane1); 

	labelfooter = new JLabel("©2018 The Coca-Cola Company | Todos los derechos reservados");
      	labelfooter.setBounds(135,445,500,30);
      	labelfooter.setFont(new java.awt.Font("Andale Mono", 1, 12));
      	labelfooter.setForeground(new java.awt.Color(255, 255, 255));
      	add(labelfooter);
    	}

public void actionPerformed(ActionEvent a) {

		if (a.getSource() == miCalculo){

			String nombreTrabajador = txtNombreTrabajador.getText();
	    		String AP = txtAPaternoTrabajador.getText();
		        String AM = txtAMaternoTrabajador.getText();
	    		String Departamento = comboDepartamento.getSelectedItem().toString();
	    		String Antiguedad = comboAntiguedad.getSelectedItem().toString();

	         if(nombreTrabajador.equals("") || AP.equals("") || AM.equals("") ||
               		Departamento.equals("") || Antiguedad.equals("")){
               
                	JOptionPane.showMessageDialog(null,"Debes de llenar todos los campos.");

	         } else {
                 if(Departamento.equals("Atención al Cliente")){

                                if(Antiguedad.equals("1 año de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 6 días de vacaciones.");
				}
				if(Antiguedad.equals("2 a 6 años de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 14 días de vacaciones.");
				}
				if(Antiguedad.equals("7 años o más de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 20 días de vacaciones.");
				}
                     
                  }
	          if(Departamento.equals("Departamento de Logística")){

				if(Antiguedad.equals("1 año de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 7 días de vacaciones.");
				}
				if(Antiguedad.equals("2 a 6 años de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 15 días de vacaciones.");
				}
				if(Antiguedad.equals("7 años o más de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 22 días de vacaciones.");
				}
	    	   }
	    	   if(Departamento.equals("Departamento de Gerencia")){

				if(Antiguedad.equals("1 año de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 10 días de vacaciones.");
				}
				if(Antiguedad.equals("2 a 6 años de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 20 días de vacaciones.");
				}
				if(Antiguedad.equals("7 años o más de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 30 días de vacaciones.");
				}
			}
		}
        }
        if (a.getSource() == Rojo){
		getContentPane().setBackground(new Color(255,0,0));
        }
        if (a.getSource() == Negro){
		getContentPane().setBackground(new Color(0,0,0));
        }
	if (a.getSource() == Morado){
		getContentPane().setBackground(new Color(50,0,85));        
	}
        if (a.getSource() == Futsia){
		getContentPane().setBackground(new Color(255,20,147));
	}
	if (a.getSource() == Azul){
		getContentPane().setBackground(new Color(0,178,238));
	}
        if (a.getSource() == miNuevo){	
	        
		txtNombreTrabajador.setText("");
	    	txtAPaternoTrabajador.setText("");
	    	txtAMaternoTrabajador.setText("");
            	comboDepartamento.setSelectedIndex(0);
	    	comboAntiguedad.setSelectedIndex(0);
	    	textarea1.setText("\n   Aquí encontraras el cálculo de tus vacaciones.");	 

        }
	if (a.getSource() == miSalir){
		
		Bienvenida goku=new Bienvenida();
		goku.setBounds(0,0,350,450);
		goku.setVisible(true);
		goku.setLocationRelativeTo(null);
		goku.setResizable(false);
		this.setVisible(false);
	}
        if (a.getSource() == miElCreador){
		JOptionPane.showMessageDialog(null,"\n Desarrollado por Andres Arboleda"+
						   "\n Estudiante de Analisis Y Desarrollo de Sistemas de Información"+
						   "\n Estudiante de Quinto trimestre en el Sena"+
						   "\n Correo andres.arboleda794@gmail.com"+
						   "\n Numero de Contacto 3212361688");
        }
	}

public static void main(String args[]) {

	Datos ventanaPrincipal = new Datos();
        ventanaPrincipal.setBounds(0,0,640,535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
    } 
}