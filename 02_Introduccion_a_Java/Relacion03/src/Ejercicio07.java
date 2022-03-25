/**
 * N�meros aleatorios
 * 
 * 7. Realiza un programa que vaya generando n�meros aleatorios pares
 *    entre 0 y 100 y que no termine hasta que no saque el n�mero 24. El
 *    programa deber� decir al final cu�ntos n�meros se han generado.
 *
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    
    int n = 0;
    int cuentaNumeros = 0;
    
    while (n != 24) {
      n = (int)(Math.random() * 51) * 2;
      System.out.print(n + " ");
      cuentaNumeros++;
    }
    System.out.println("\nSe han generado " + cuentaNumeros + " n�meros.");
  }
}