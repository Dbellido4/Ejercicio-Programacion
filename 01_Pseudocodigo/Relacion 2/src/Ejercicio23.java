 import java.util.Scanner;
public class Ejercicio23 { 
  public static void main(String[] args) {
	  Scanner x=new Scanner(System.in);
    double num = 0;
    double dividendo = 0;
    double contador = 0;
    do{
      System.out.print("Introduce un n�mero: ");
      int num1=x.nextInt();
      dividendo = dividendo + num1;
      contador++;
    } while (dividendo < 10000);
    dividendo -= num;
    double media = (dividendo-num)/(contador-2);
    System.out.println("Ha introducido "+contador+" n�meros.");
    System.out.println("La suma de todos los n�meros es: "+dividendo+".");
    System.out.println("La media es: "+ media +".");
  }
}
  