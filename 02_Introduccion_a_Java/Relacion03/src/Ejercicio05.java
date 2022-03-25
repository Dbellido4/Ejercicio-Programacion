/**
 * N�meros aleatorios
 * 
 * 5. Muestra 50 n�meros enteros aleatorios entre 100 y 199 (ambos incluidos)
 *    separados por espacios. Muestra el m�ximo, el m�nimo y la media de esos n�meros.
 *
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    
    int maximo = 100;
    int minimo = 199;
    int suma = 0;
    int n;
    
    for (int i = 0; i < 50; i++) {
      n = (int)(Math.random()*100) + 100;
      System.out.print(n + " ");
      suma += n;
      
      if (n < minimo) {
        minimo = n;
      }
      
      if (n > maximo) {
        maximo = n;
      }
    }
    
    System.out.println("\nM�nimo: " + minimo + "\nM�ximo: " + maximo + "\nMedia: " + suma / 50);
  }
}