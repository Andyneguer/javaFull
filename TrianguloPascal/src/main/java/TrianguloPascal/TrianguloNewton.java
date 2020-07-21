/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TrianguloPascal;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Jaime Andres Arboleda Garzon
 * @author Brillit Lorena Chala Pabon
 */

public class TrianguloNewton 
{
    public static void main(String[] args) 
    {
        int code=0;
        int pisos=0;
        int []arreglo = new int[1];
        int x;
        int y;
        int n = 0;
        int op2 = 0;
        while (op2!=2)
        {
        
            System.out.println("|-------------------------------------------------|");
            System.out.println("|----------------MENU DE OPCIONES-----------------|");
            System.out.println("|-------------------------------------------------|");

            String menu="MENU DE OPCIONES \n";

            menu+="1. Ejercicio 1 TrianguloPascal\n";
            menu+="2. Ejercicio 1 Colores\n";//
            menu+="3. Ejercicio 2 Fibonacci\n";//
            menu+="4. Ejercicio 3 Inversos\n";//
            menu+="5. Ejercicio 1 TrianguloNewton\n";
            menu+="6. Ejercicio 1 Numeroxxx\n";
            menu+="7. Ejercicio 1 SumarDiagonales\n";//
            menu+="8. Ejercicio 1 Graficar Triangulo\n";//
            menu+="9. Ejercicio 1 Salir\n\n";//
            menu+="Ingrese una Opcion";

            Scanner sc=new Scanner(System.in);
            code=Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (code)
            {
                case 1:
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--------Seleccionaste Triangulo de Pascal--------|");
                    System.out.println("|-------------------------------------------------|");
                
                    pisos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para realizar el triangulo de pascal"));
        
                    for (int i = 1; i <= pisos; i++)
                    {
                        int[]pascal=new int[i];
            
                        for (int j = pisos; j > i; j--) 
                        {
                            System.out.print("  ");
                        }
            
                        for (int k = 0; k < i; k++)
                        {
                            if (k==0 || k==(i -1))
                            {
                                pascal[k]=1;
                            }
                            else
                            {
                                pascal[k] = arreglo[k] + arreglo[k -1];
                            }
                                System.out.print("[" + pascal[k] + "]");
                        }
                                arreglo = pascal;
                                System.out.println();
                    }
                    op2=Integer.parseInt(JOptionPane.showInputDialog("Desea ir al menu 1=si\nDeseas Salir 2=si"));
                    
                    if(op2 ==2)
                    {
                        return;
                    }
                    else if(op2 !=2 && op2 == 1)
                    {
                        System.out.println("El programa se cerro con exito");
                    }
                    
                    break;

                case 2:
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--------Seleccionas Ejercicio Colores------------|");
                    System.out.println("|-------------------------------------------------|");

                    String menu1="MENU DE OPCIONES \n";

                    menu1+="1. Rojo Amarillo\n";
                    menu1+="2. Rojo Azul\n";
                    menu1+="3. Rojo Verde\n";
                    menu1+="4. Amarillo Azul\n";
                    menu1+="5. Amarillo Verde\n";
                    menu1+="6. Azul Verde\n\n";
                    
                    int code1 = Integer.parseInt(JOptionPane.showInputDialog(menu1));
                    
                    switch (code1)
                    {  
                        case 1: 
                            System.out.println("Naranja");
                        break;
                        
                        case 2: 
                            System.out.println("Morado");
                        break;
                        
                        case 3:
                            System.out.println("Cafe");
                        break;
                   
                        case 4: 
                            System.out.println("Verde");
                        break;
    
                        case 5: 
                            System.out.println("Verde claro");
                        break;
         
                        case 6:
                            System.out.println("Verde menta");
                        break;
                    }
                    op2=Integer.parseInt(JOptionPane.showInputDialog("Desea ir al menu 1=si\nDeseas Salir 2=si"));
                    
                    if(op2 ==2)
                    {
                        return;
                    }
                    else if(op2 !=2 && op2 == 1)
                    {
                        System.out.println("El programa se cerro con exito");
                    }
                    break;

                case 3:
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|-------Seleccionaste Ejercicio 2 Fibonacci-------|");
                    System.out.println("|-------------------------------------------------|");
                    int op3=0;
                    while(op3!=4)
                    {
                    System.out.println("|----------------MENU DE FIBONACCI----------------|");
                    System.out.println("|-------------------------------------------------|");

                    String menu2="MENU DE OPCIONES \n";

                    menu2+="1. Serie Con For\n";
                    menu2+="2. Serie con While\n";
                    menu2+="3. Serie con Do While\n\n";
                    int code2 = Integer.parseInt(JOptionPane.showInputDialog(menu2));
                    int num;	
                    int a=0;
                    int b;
                    int c=0;
                    int d=0;
                
                    switch (code2)
                    {
                        case 1:
                            System.out.println("|-------------------------------------------------|");
                            System.out.println("|----------------Serie con for:-------------------|");
                            System.out.println("|-------------------------------------------------|");
                            b=Integer.parseInt(JOptionPane.showInputDialog("que tipo de salto quieres en For"));
                            System.out.println("");
                            num=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));
                
                            for(d=0; d<num; d++)
                            {
                                if (d<num)
                                {
                                    System.out.print(a +",");
                                    c=a+b;
                                    a=b;
                                    b=c;	
                                }
                                else
                                { 	
                                    System.out.print(a);
                                }
                            }
                            System.out.println(" ");
                            d=0;
                            a=0;
                            b=num;
                            c=0;
                            System.out.println();
                    
                            
                            op3=Integer.parseInt(JOptionPane.showInputDialog("Desea ir al menu2 3=si\nDeseas Salir 4=si"));
                            if(op3==4)
                            {
                                return;
                            }
                            else if(op3 !=3 && op3 == 4)
                            {
                                System.out.println("El programa se cerro con exito");
                            }
                            break;
                        
                        case 2:
                            System.out.println("|-------------------------------------------------|");
                            System.out.println("|---------------Serie con while:------------------|");
                            System.out.println("|-------------------------------------------------|");
                            b=Integer.parseInt(JOptionPane.showInputDialog("que tipo de salto quieres en While"));
                            System.out.println("");
                            num=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));
	
                            while(d<num)
                            {
                                if (d<num)
                                {
                                    System.out.print(a +",");
                                    c=a+b;
                                    a=b;
                                    b=c;	
                                }
                                else
                                { 	
                                    System.out.print(a);
                                }
                                d++;
                            }
                            System.out.println("");
                            d=0;
                            a=0;
                            b=num;
                            c=0;
                            System.out.println();
                    
                            op3=Integer.parseInt(JOptionPane.showInputDialog("Desea ir al menu2 3=si\nDeseas Salir 4=si"));
                            if(op3==4)
                            {
                                return;
                            }
                            else if(op3 !=3 && op3 == 4)
                            {
                                System.out.println("El programa se cerro con exito");
                            }
                            break;
                        
                        case 3:
                            System.out.println("|-------------------------------------------------|");
                            System.out.println("|------------Serie con do-while:------------------|");
                            System.out.println("|-------------------------------------------------|");
                            b=Integer.parseInt(JOptionPane.showInputDialog("que tipo de salto quieres en do-While"));
                            System.out.println("");
                            num=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));
		    
                            do
                            {
                                if (d<num)
                                {
                                    System.out.print(a +",");
                                    c=a+b;
                                    a=b;
                                    b=c;	
                                }
                                else
                                { 	
                                    System.out.print(a);
                                }
                                d++;
                            }
                            while(d<num);
                            System.out.println();
                            
                            op3=Integer.parseInt(JOptionPane.showInputDialog("Desea ir al menu 1=si\nDesea ir al menu2 3=si\nDeseas Salir 4=si"));
                            if(op3==4)
                            {
                                return;
                            }
                            else if(op3 !=3 && op3 == 4)
                            {
                                System.out.println("El programa se cerro con exito");
                            }
                            
                    }
                            if (op3 <=2) 
                            {
                                op2=Integer.parseInt(JOptionPane.showInputDialog("Seguro Desea Regresar al menu:\n"+"Desea ir al menu 1=si\nDeseas Salir 2=si"));
                                if(op2 ==2)
                                {
                                    return;
                                }
                                else if(op2 !=2 && op2 == 1)
                                {
                                    System.out.println("El programa se cerro con exito");
                                }
                        break;
                            }
                   }
                    break;

                case 4:
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|-------Seleccionaste Ejercicio Inversos----------|");
                    System.out.println("|-------------------------------------------------|");

                    int numero;
                    String mensa="";

                    numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));

                    if (numero<0)
                    {
                        numero=numero*-1;
                        mensa="El numero es Negativo asi que se pasa a Positivo";
                        System.out.println("numero = " + numero);
                    }
                    else if (numero>0)
                    {
                        numero=numero*(-1);
                        mensa="El numero es Positivo asi que se pasa a Negativo";
                        System.out.println("numero = " + numero);
                    }
                    System.out.println("mensa = " + mensa+" "+numero);
                    
                    op2=Integer.parseInt(JOptionPane.showInputDialog("Desea ir al menu 1=si\nDeseas Salir 2=si"));
                    
                    if(op2 ==2)
                    {
                        return;
                    }
                    else if(op2 !=2 && op2 == 1)
                    {
                        System.out.println("El programa se cerro con exito");
                    }
                    break;

                case 5:
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|------------Ejercicio 1 TrianguloNewton----------|");
                    System.out.println("|-------------------------------------------------|");
                
                    pisos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para realizar el triangulo de newton"));
                
                    for (int i = 1; i <= pisos; i++)
                    {
                        int[]pascal=new int[i];
            
                        for (int j = pisos; j > i; j--) 
                        {
                            System.out.print("  ");
                        }
            
                        for (int k = 0; k < i; k++)
                        {
                            if (k==0 || k==(i -1))
                            {
                                pascal[k]=1;
                            }
                            else
                            {
                                pascal[k] = arreglo[k] + arreglo[k -1];
                            }
                                System.out.print("[" + pascal[k] + "]");
                        
                            if (n==k)
                            {
                                arreglo = pascal;
                                n++;
                                System.out.println("("+ k + "+" + k + ")^"+ n + "=" + Math.pow( (i+k), n));
                            }
                        }
                    }
                            op2=Integer.parseInt(JOptionPane.showInputDialog("Desea ir al menu 1=si\nDeseas Salir 2=si"));
                    
                            if(op2 ==2)
                            {
                                return;
                            }
                            else if(op2 !=2 && op2 == 1)
                            {
                                System.out.println("El programa se cerro con exito");
                            }
                    break;

                case 6:
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|---------Selecciono Ejercicio 1 Numeroxxx--------|");
                    System.out.println("|-------------------------------------------------|");

                    x=Integer.parseInt(JOptionPane.showInputDialog("\nIngrese el valor de x"));
                    y=Integer.parseInt(JOptionPane.showInputDialog("\nIngrese el valor de y"));
                    n=Integer.parseInt(JOptionPane.showInputDialog("\nIngrese el valor de n"));

                    System.out.println("("+ x + "+" + y + ")^"+ n + "=" + Math.pow( (x+y), n));
                    
                    op2=Integer.parseInt(JOptionPane.showInputDialog("Desea ir al menu 1=si\nDeseas Salir 2=si"));
                    if(op2 ==2)
                    {
                        return;
                    }
                    else if(op2 !=2 && op2 == 1)
                    {
                        System.out.println("El programa se cerro con exito");
                    }
                    break;

                case 7:
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|-------------Selecciono SumarDiagonales----------|");
                    System.out.println("|-------------------------------------------------|");
                
                    int rows=Integer.parseInt(JOptionPane.showInputDialog("Numero de filas"));
                
                    for(int i = 0; i < rows; i++) 
                    {
                        int number = 1;
                        System.out.format("%"+(rows-i)*2+"s","");
                    
                        for(int j=0;j<=i;j++) 
                        {
                            System.out.format("%4d",number);
                            number = number * (i - j) / (j + 1);
                        }
                            System.out.println();
                    }
                    
                        op2=Integer.parseInt(JOptionPane.showInputDialog("Desea ir al menu 1=si\nDeseas Salir 2=si"));    
                        if(op2 ==2)
                        {
                            return;
                        }
                        else if(op2 !=2 && op2 == 1)
                        {
                            System.out.println("El programa se cerro con exito");
                        }
                    break;
                
                case 8:
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|----Selecciono Ejercicio 1 Graficar Triangulo----|");
                    System.out.println("|-------------------------------------------------|");
                 /* Atributos
                    String cjto;
                    int fases = 0;
                    int recto = 0;
                    int cp[] = {250,60,550,350};
        
                    void ListaConjuntos_Action(Event event)
                    {
                    // to do: place event handler code here.
                    cjto = Lista_conjuntos.getSelectedItem();
                    // Repaint the Panel
                    repaint(cp[0],cp[1],cp[2]-cp[0],cp[3]-cp[1]);
                    //}
                    }	
                    
                    void bajarFases_Clicked(Event event) 
                    {
                    if (fases > 0) fases --;
                    sel_fases.setText(Integer.toString(fases));
                    repaint(cp[0],cp[1],cp[2]-cp[0],cp[3]-cp[1]);
                    // to do: place event handler code here.
                    }

                    void subirFases_Clicked(Event event)
                    {
                    fases ++;
                    sel_fases.setText(Integer.toString(fases));
                    repaint(cp[0],cp[1],cp[2]-cp[0],cp[3]-cp[1]);
                    // to do: place event handler code here.
                    }
                    
                    public void init() {
                    super.init();
                    //{{INIT_CONTROLS
                    setLayout(null);
                    addNotify();
                    resize(591,383);
                    setBackground(new Color(13094609));
                    Lista_conjuntos = new java.awt.Choice();
                    Lista_conjuntos.addItem("Triangulo Sierpinski");
                    
                    int c=-1;
                    try
                    {
                        c = Integer.parseInt(getParameter("conjunto"));
                    }
                    catch (NumberFormatException e)
                    {
                    
                    }
                    cjto = "Triangulo Sierpinski";
              
                    try 
                    {
			Lista_conjuntos.select(cjto);
                    }   
                    catch (IllegalArgumentException e)
                    {
                    
                    }
                    
                    add(Lista_conjuntos);
                    Lista_conjuntos.reshape(36,96,158,21);
                    Lista_conjuntos.setFont(new Font("Dialog", Font.BOLD, 12));
                    Etiqueta = new java.awt.Label("Triangulo de Sierpinski.",Label.CENTER);
                    Etiqueta.reshape(60,12,446,39);
                    Etiqueta.setFont(new Font("Dialog", Font.BOLD|Font.ITALIC, 40));
                    add(Etiqueta);
                    Etiqueta2 = new java.awt.Label("# de it: ");
                    Etiqueta2.reshape(36,132,63,29);
                    Etiqueta2.setFont(new Font("Dialog", Font.BOLD, 14));
                    add(Etiqueta2);
                    sel_fases = new java.awt.TextField();
                    sel_fases.setEditable(false);
                    sel_fases.setText("0");
                    sel_fases.reshape(108,132,36,23);
                    add(sel_fases);
                    subir_fases = new java.awt.Button("+");
                    subir_fases.reshape(156,132,18,14);
                    add(subir_fases);
                    bajar_fases = new java.awt.Button("-");
                    bajar_fases.reshape(156,144,18,14);
                    add(bajar_fases);
                    etiqueta3 = new java.awt.Label("Tipo de conjunto:");
                    etiqueta3.reshape(36,72,142,24);
                    add(etiqueta3);
		//}}
            }

                public boolean handleEvent(Event event)
                {
                    if (event.target == Lista_conjuntos && event.id == Event.ACTION_EVENT)
                    {
			ListaConjuntos_Action(event);
			return true;
                    }
                    if (event.target == subir_fases && event.id == Event.ACTION_EVENT) 
                    {
			subirFases_Clicked(event);
			return true;
                    }
                    if (event.target == bajar_fases && event.id == Event.ACTION_EVENT)
                    {
			bajarFases_Clicked(event);
			return true;
                    }
                    return super.handleEvent(event);
                }

                //{{DECLARE_CONTROLS
                java.awt.Choice Lista_conjuntos;
                java.awt.Label Etiqueta;
                java.awt.Label Etiqueta2;
                java.awt.TextField sel_fases;
                java.awt.Button subir_fases;
                java.awt.Button bajar_fases;
                java.awt.Label etiqueta3;
                //}}
	
                public void paint(Graphics g)
                {
                    //setBackground(Color.white);
                    g.drawRect(cp[0],cp[1],cp[2]-cp[0],cp[3]-cp[1]);
                    if (cjto=="Cantor")
                    {
                        int x1,x2,y;
                        x1 = cp[0]+ 10;
                        x2 = cp[2]- 10;
                        y  = ((cp[3]-cp[1])/2)+ cp[1];
                        g.drawLine(x1,y,x2,y);
                        cantorizar(g,x1,y,x2,y,fases);
                    }
                    else if (cjto=="Triangulo Sierpinski")
                    {
                        int cx[] = new int[3];
                        int cy[] = new int[3];
                        cx[0] = cp[0]+10;
                        cy[0] = cp[3]-10;
                        cy[1] = cp[1]+10;
                        cx[2] = cp[2]-10;
                        cy[2] = cy[0];
                        cx[1] = ((cx[2]-cx[0])/2)+cx[0];
                        g.fillPolygon(cx, cy, 3);
                        sierp(g, cx[0], cy[0], cx[1], cy[1], cx[2], cy[2],fases);
                    }
                    else if (cjto=="Sierpinski recto")
                    {
                        int c_x[] = new int[3];
                        int c_y[] = new int[3];
                        c_x[0] = cp[0]+10;
                        c_y[0] = cp[3]-10;
                        c_y[1] = cp[1]+10;
                        c_x[2] = cp[2]-10;
                        c_y[2] = c_y[0];
                        c_x[1] = c_x[0];
                        g.fillPolygon(c_x, c_y, 3);
                        sierp(g, c_x[0], c_y[0], c_x[1], c_y[1], c_x[2], c_y[2],fases);
                    }
                    else if (cjto=="Koch")
                    {
                        int x_1,x_2,y_1;
                        x_1 = cp[0]+ 10;
                        x_2 = cp[2]- 10;
                        y_1  = ((cp[3]-cp[1])/3)*2 + cp[1];
                        g.drawLine(x_1,y_1,x_2,y_1);
                        kochizar(g,x_1,y_1,x_2,y_1,fases);   
                    }
                    else if (cjto=="Alfombra Sierpinski")
                    {
                        g.fillRect(cp[0]+25,cp[1]+20,cp[3]-cp[1]-40,cp[3]-cp[1]-40);
                        alfombrizar(g,cp[0]+25,cp[1]+20,cp[0]+cp[3]-cp[1]-15,cp[3]-20,fases);   
                    }
                }
    
                public void alfombrizar(Graphics g, int x1, int y1, int x2, int y2, int f)
                {
                    g.setColor(Color.white);
                    if (f > 0)
                    {
                    f--;
                    g.fillRect((x2-x1)/3+x1,(y2-y1)/3+y1,(x2-x1)/3,(y2-y1)/3);
                    alfombrizar(g,x1,y1,(x2-x1)/3+x1,(y2-y1)/3+y1,f);    
                    alfombrizar(g,(x2-x1)/3+x1,y1,(x2-x1)*2/3+x1,(y2-y1)/3+y1,f);    
                    alfombrizar(g,(x2-x1)*2/3+x1,y1,x2,(y2-y1)/3+y1,f);    
                    alfombrizar(g,x1,(y2-y1)/3+y1,(x2-x1)/3+x1,(y2-y1)*2/3+y1,f);    
                    alfombrizar(g,(x2-x1)*2/3+x1,(y2-y1)/3+y1,x2,(y2-y1)*2/3+y1,f);    
                    alfombrizar(g,x1,(y2-y1)*2/3+y1,(x2-x1)/3+x1,y2,f);    
                    alfombrizar(g,(x2-x1)/3+x1,(y2-y1)*2/3+y1,(x2-x1)*2/3+x1,y2,f);    
                    alfombrizar(g,(x2-x1)*2/3+x1,(y2-y1)*2/3+y1,x2,y2,f);    
                    }
                }
        
                public void kochizar(Graphics g, int x1, int y1, int x2, int y2, int f)
                {
                    float unt_x,unt_y,dost_x,dost_y,pico_x,pico_y,med_x,med_y;
                    if (f>0)
                    {
                        f--;
                        unt_x = ((x2-x1)/3)+x1;
                        unt_y = ((y2-y1)/3)+y1;
                        dost_x= unt_x + ((x2-x1)/3);
                        dost_y= unt_y + ((y2-y1)/3);
                        med_x = (x1+x2)/2;
                        med_y = (y1+y2)/2;
                        pico_x = med_x + ((y2-y1)/3);
                        pico_y = med_y - ((x2-x1)/3);
                        // Borrar la linea del medio
                        g.setColor(Color.white);
                        g.drawLine((int)unt_x,(int)unt_y,(int)dost_x,(int)dost_y);          
                        g.drawLine((int)unt_x,(int)unt_y-1,(int)dost_x,(int)dost_y-1);
                        g.drawLine((int)unt_x,(int)unt_y+1,(int)dost_x,(int)dost_y+1);
                        g.drawLine((int)unt_x,(int)unt_y-2,(int)dost_x,(int)dost_y-2);
                        g.drawLine((int)unt_x,(int)unt_y+2,(int)dost_x,(int)dost_y+2);
            
            
                        g.setColor(Color.black);
                        g.drawLine((int)unt_x,(int)unt_y,(int)pico_x,(int)pico_y);
                        g.drawLine((int)pico_x,(int)pico_y,(int)dost_x,(int)dost_y);
                        kochizar(g,x1,y1,(int)unt_x,(int)unt_y,f);
                        kochizar(g,(int)unt_x,(int)unt_y,(int)pico_x,(int)pico_y,f);
                        kochizar(g,(int)pico_x,(int)pico_y,(int)dost_x,(int)dost_y,f);
                        kochizar(g,(int)dost_x,(int)dost_y,x2,y2,f);
                    }
                }
                   
                public void cantorizar(Graphics g,int x1, int y1, int x2, int y2,int f)
                {
                    float untercio,dostercios;
                    untercio = (x1+((x2-x1)/3)) ;
                    dostercios = (2*((x2-x1)/3))+x1;
                    g.setColor(Color.white);
                    if (f > 0)
                    {
                        f--;
                        g.drawLine((int)untercio,y1,(int)dostercios,y2);
                        cantorizar(g, x1, y1, (int)untercio , y2,f);
                        cantorizar(g, (int)dostercios, y1, x2, y2,f);
                    }
                }
                    
                public void sierp (Graphics g, int x0,int y0,int x1,int y1,int x2,int y2, int f)
                {
                    int nx[] = new int[3];
                    int ny[] = new int[3];
                    // Punto medio del lado izquierdo
                    nx[0]=((x1-x0)/2)+x0;
                    ny[0]=((y0-y1)/2)+y1;
                    // Punto medio de la base
                    nx[1]=((x2-x0)/2)+x0;
                    ny[1]=y0;
                    // Punto medio del lado derecho
                    nx[2]=((x2-x1)/2)+x1;
                    ny[2]=ny[0];
        
                    if (f>0)
                    {
                        f--;
                        //Borrar triangulo central
                        g.setColor(Color.blue);
                        g.fillPolygon(nx, ny, 3);
                        //Lanzar llamada recursiva en el primer triangulo
                        sierp(g, x0, y0, nx[0], ny[0], nx[1], ny[1], f);
                        //Lanzar llamada recursiva en el segundo triangulo
                        sierp(g, nx[0], ny[0], x1, y1, nx[2], ny[2], f);
                        //Lanzar llamada recursiva en el tercer triangulo
                        sierp(g, nx[1], ny[1], nx[2], ny[2], x2, y2, f);
                    } 
                }
    
                /*
                public void box_counting()
                {
                    Image imagen1;
                    imagen1 = createImage();
                }
                */    
                break;
                case 9:
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--------------Saliendo del sistema---------------|");
                    System.out.println("|-------------Gracias Vuelve Pronto---------------|");
                    System.out.println("|-------------------------------------------------|");
            
                    op2=Integer.parseInt(JOptionPane.showInputDialog("Gracias Vuelve Pronto\n"
                                                                   + "Desea ir al menu 1=si\n"
                                                                   + "Deseas Salir 2=si"));
                    if(op2 ==2)
                    {
                        return;
                    }
                    else if(op2 !=2 && op2 == 1)
                    {
                        System.out.println("|-----------------------------------------|");
                        System.out.println("|-----El programa se cerro con exito------|");
                        System.out.println("|-----------------------------------------|");
                    }
                break;
            }
        }
    }
}