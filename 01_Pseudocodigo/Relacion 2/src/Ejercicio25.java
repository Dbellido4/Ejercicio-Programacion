import java.util.Scanner;
public class Ejercicio25 { 
  public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
    System.out.print("Introduce un n�mero: ");
    int num=x.nextInt();;
    System.out.print("El n�mero "+num+" al rev�s es: ");
    int div = 10;
    while (num > 0){
      int reves = num%div;
      System.out.print(reves);
      num = (num - reves*(div/10))/10;
    }
  }
}