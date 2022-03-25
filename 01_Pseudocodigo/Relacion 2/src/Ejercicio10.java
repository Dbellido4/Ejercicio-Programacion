import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		int numeros=0;
				int suma=0;
			    Scanner x=new Scanner(System.in);
			    System.out.println("Introduce los numeros: ");
			    	int num=x.nextInt();
			    while (num >= 0) {
			      numeros++;
			      suma += num;
			    }
			    
			    System.out.println("La media de los números positivos introducidos es " + (suma - num)/ (numeros - 1));

			  }
			}