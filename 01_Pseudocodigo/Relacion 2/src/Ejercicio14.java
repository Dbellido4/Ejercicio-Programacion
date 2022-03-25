import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner base=new Scanner(System.in);
		Scanner exponente=new Scanner(System.in);
		 	System.out.print("Introduce la base ");
		  	int num=base.nextInt();
		    System.out.print("Introduce el exponente ");
		    int num2=exponente.nextInt();
		    double total = 1;
		    for(int i = 0; i < num2; i++){
		      total = num * total;
		    }
		    System.out.print(num+ " elevado a "+ num2+" = "+total+".");

	}

}
