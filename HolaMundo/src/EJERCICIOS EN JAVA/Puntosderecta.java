package Puntosderecta;

import java.awt.Point;

public class Puntosderecta{
	
	int x1=0;
	int y1=0;
	int x2=0;
	int y2=0;
        
        
	Puntosderecta recta(int x1, int y1, int x2, int y2){
	this.x1=x1;
	this.x2=x2;
	this.y1=y1;
	this.y2=y2;
	return this;
        }
        
	Puntosderecta recta(Point ini, Point fin){
	x1=ini.x;
        x2=fin.x;
        y1=ini.x;
        y2=fin.y;
        return this;
        }
        
        Puntosderecta recta(Point ini,int finx,int finy){
	x1=ini.x;
        x2=finx;
        y1=ini.y;
	y2=finy;
	return this;
	}
	Puntosderecta recta(int finx,int finy,Point ini){
        x1=ini.x;
        x2=finx;
        y1=ini.y;
        y2=finy;
        return this;
        }
        void imprimir()
        {
            System.out.println("la recta < "+ x1 +","+ y1 +"y" );
            System.out.println(x2+ ","+ y2 + ">");
        }
	public static void main(String args[]){
    
    	Puntosderecta linea=new Puntosderecta();
    	System.out.print ("llamando puntos de la recta 25, 25, 50, 50");
    	linea.recta(25,25,50,50);
    	linea.imprimir();
    	System.out.println("******************************************");
	System.out.println("llamado recta de puntos(10,10)y(20,20)");
    	linea.recta (10,10,new Point(20,20));
    	linea.imprimir();
    	System.out.println("******************************************");
    	System.out.println("llamado recta de puntos(28,42)y(51,93)");
    	linea.recta(28,42,new Point(51,93));
    	linea.imprimir();
    	System.out.println("******************************************");
    	System.out.println("Ultimo agregado (7219,622)y puntos(16,11)");
    	linea.recta(16,11,new Point(7219,622));
    	linea.imprimir();
	}
      
}