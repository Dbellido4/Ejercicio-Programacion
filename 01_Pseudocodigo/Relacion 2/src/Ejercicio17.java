import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		   System.out.print("Introduce un n�mero entero positivo: ");
			int num=x.nextInt();
		    if (num < 0){
		      System.out.print("P O S I T I V O   H E   D I C H O");
		    } else {
		      System.out.print("La suma de siguientes 100 n�meros a "+num+" son: ");
		      int suma = 0;
		      for(int i = num; i < (num+100); i++){
		        suma += i;
		      }
		      System.out.print(suma);
		    }

	}

}