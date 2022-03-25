import java.util.Scanner;

/**
 * Bucles
 * 
 * 25. Realiza un programa que pida un n�mero por teclado y que luego
 *     muestre ese n�mero al rev�s.
 * 
 */
public class Ejercicio25 {

  public static void main(String[] args) {
	  
	  Scanner s= new Scanner(System.in);

    System.out.print("Introduzca un n�mero entero: ");
    int numero=s.nextInt();

 
    System.out.print("\nSi le damos la vuelta al " + numero + " tenemos el " );
    
    while (numero > 0) {
    	  System.out.print(numero%10);
    	  numero /= 10;
         
    } // while
     
    s.close();
  }
 
}