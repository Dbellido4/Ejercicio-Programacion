import java.util.Scanner;
public class Ejercicio08 {

	public static void main(String[] args) {
		
		Scanner x=new Scanner(System.in);
		System.out.print("Introduce el  numero de la tabla:");
		int num=x.nextInt();
		int i=0;
	    while(i <= 10) {
	      System.out.println(i +" x "+num+ " = "+(i*num));
	      i+=1;
	    }
	    
	}
}
