import javax.swing.*;

public class Cla21j{

public static void main(String args[]){

	int arroba=0;			
	
	String mail=JOptionPane.showInputDialog("Introduce mail");
	
	for (int i=0; i<mail.length(); i++){

		if(mail.charAt(i)=='@'){
		arroba++;
		}
        }
		if(arroba==1){
		System.out.println(mail + " Es correcto");
		}
		else{
		System.out.println(mail + " No es correcto");
		}	
	}
}