import java.util.Scanner;
public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		Scanner x2=new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num1=x.nextInt();
	    System.out.print("Introduce otro número diferente: ");
		int num2=x2.nextInt();
	    if (num1 == num2){
	      System.out.print("¡ D I F E R E N T E S !");
	    } else {
	      int menor = 0;
	      int mayor = 0;
	      int i = 0;
	      if (num1 < num2){
	        menor = num1;
	        mayor = num2;
	      } else {
	        menor = num2;
	        mayor = num1;
	      }
	      for(i = 0; menor < mayor; i++){
	        menor+= 7;
	      }
	      System.out.print("El número 7 cabe "+(i-1)+" veces entre el "+num1+" y el "+num2);
	    }

	}

}
