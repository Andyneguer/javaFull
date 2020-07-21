public class CiclosFWD{

public static void main(String args[]){
	
	int i=0;
	
		System.out.println("***************");
		System.out.println("Serie con for: ");
		System.out.println("***************");
	
		for (i=1; i<=10; i++){
			if (i<10){
			System.out.print(i + ",");
			}else {
			System.out.print(i);
			}
		}
		i=1;
		System.out.println("");

		System.out.println("***************");
		System.out.println("Serie con while");
		System.out.println("***************");

		while(i <=10){
			if (i<10){
			System.out.print(i + ",");
			}else {
			System.out.print(i);
			}
		i++;
		}
		i=1;
		System.out.println("");

		System.out.println("******************");
		System.out.println("Serie con do-while");
		System.out.println("******************");
		
		do{
			if (i<10){
			System.out.print(i + ",");
			}else {
			System.out.print(i);
			}
			i++;
		}while(i <=10);
		
	}
}