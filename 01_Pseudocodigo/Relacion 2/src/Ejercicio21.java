 import java.util.Scanner;
public class Ejercicio21 { 
  public static void main(String[] args) {
	  Scanner x=new Scanner(System.in);
    double dividendo = 0;
    int contadorimp = 0;
    double mayor = 0;
    double impar = 0;
    int contador = 0;
    double num=0;
    for (int num1=1; num1>0; num1++){
      System.out.print("Introduce un número ");
      int num11=x.nextInt();;
      if (num11%2 != 0){
        impar = num11;
        dividendo += num11;
        contadorimp++;
      } else {
        if (num11 > mayor){
          mayor = num11;
        }
      }
      contador++;
    } while (num > 0);
    double media = (dividendo-impar)/(contadorimp-1);
    System.out.println("Ha introducido "+ contador + " números.");
    System.out.println("La media de los impares es: "+ media +".");
    System.out.println("El mayor número par ha sido el: "+mayor+".");
  }
}