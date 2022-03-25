 import java.util.Scanner;
public class Ejercicio27 {
  public static void main(String[] args) {
	  Scanner x=new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int numUs=x.nextInt();
    int suma = 0;
    for (int i = 1; i < numUs; i++){
      if (i%3 == 0){
        System.out.print(i+" ");
        suma += i;
      }
    }
    System.out.print("\n La suma de los múltiplos de 3 entre "+numUs+" y 1 (los números de arriba), es: "+suma);
  }
}