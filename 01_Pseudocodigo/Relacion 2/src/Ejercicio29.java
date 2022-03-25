import java.util.Scanner;
public class Ejercicio29 { 
  public static void main(String[] args) {
	  Scanner x=new Scanner(System.in);
	  Scanner y=new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int num1=x.nextInt();
    System.out.print("Introduce otro número: ");
    int num2=y.nextInt();
    boolean ninguno = true;
    System.out.print("Los números positivos menores que "+num1+" que además son divisibles entre "+num2+" son: ");
    for (int i = 1; i <= num1; i++){
      if (i%num2 == 0){
        ninguno = false;
        System.out.print(i+" ");
      }
    }
    if (ninguno){
      System.out.print("ninguno.");
    }
  }
}