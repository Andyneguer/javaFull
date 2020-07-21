public class Cla3_24j{

public static void main(String []args){

	int [] brito=new int[150];
	for(int i=0; i<brito.length; i++){
		brito[i]=(int)Math.round(Math.random()*100);
	}
	for(int num:brito){
		System.out.println(num + " ");
		}
	}
}