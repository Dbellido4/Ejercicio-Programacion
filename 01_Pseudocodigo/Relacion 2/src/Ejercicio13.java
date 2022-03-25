import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.print("Introduce un número ");
	    int num=x.nextInt();
	    int numCifras = 1;
	    int positivos = 0;
	    int negativos = 0;
	    for (int cont = 0; cont < numCifras; cont++){
	      if (num < 0){
	        negativos ++;
	      } else {
	        positivos++;
	      }
	    }
	    System.out.println("Hay "+positivos+" positivios y "+negativos+" negativos.");
	  }

	}

