import java.util.Scanner;

/**
 * Bucles
 * 
 * 25. Realiza un programa que pida un número por teclado y que luego
 *     muestre ese número al revés.
 * 
 */
public class Ejercicio25 {

  public static void main(String[] args) {
	  
	  Scanner s= new Scanner(System.in);

    System.out.print("Introduzca un número entero: ");
    int numero=s.nextInt();

 
    System.out.print("\nSi le damos la vuelta al " + numero + " tenemos el " );
    
    while (numero > 0) {
    	  System.out.print(numero%10);
    	  numero /= 10;
         
    } // while
     
    s.close();
  }
 
}