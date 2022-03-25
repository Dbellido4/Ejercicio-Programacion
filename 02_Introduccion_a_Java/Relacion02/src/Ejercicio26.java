import java.util.Scanner;

/**
 * Bucles
 * 
 * 26. Realiza un programa que pida primero un n�mero y a continuaci�n un d�gito. El programa nos
 *     debe dar la posici�n (o posiciones) contando de izquierda a derecha que ocupa ese d�gito en
 *     el n�mero introducido.
 * 
 */
public class Ejercicio26 {

  public static void main(String[] args) {
	 Scanner s= new Scanner(System.in);
    
    System.out.print("Introduzca un n�mero entero: ");
    int numeroIntroducido = s.nextInt();

    System.out.print("Introduzca un d�gito: ");
    int digito = s.nextInt();

    System.out.print("Contando de izquierda a derecha, el " + digito + " aparece dentro de " + numeroIntroducido + " en las siguientes posiciones: ");
 // le da la vueta al n�mero y calcula la longitud
    int numero = numeroIntroducido;
    int volteado = 0;
    int longitud = 0;
    int posicion = 1;
    
    if (numero == 0) {
        longitud = 1;
      }
      
      while (numero > 0) {
        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
        longitud++;
      } // while
          
      // comprueba la posici�n
      while (volteado > 0) {
        if ((volteado % 10) == digito) {
          System.out.print(posicion + " ");
        }
        volteado /= 10;
        posicion++;
      } // while
      s.close();
  }
}
