  import java.util.Scanner;
public class Ejercicio28 { 
  public static void main(String[] args) {
	  Scanner x=new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int numUs=x.nextInt();
    int factorial = 1;
    for (int i = 1; i <= numUs; i++){
      factorial *= i;
    }
    System.out.print(numUs+"! = "+factorial);
  }
}