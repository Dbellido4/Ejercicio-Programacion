import java.util.Scanner;
public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		Scanner x2=new Scanner(System.in);
		System.out.print("Introduce la altura: ");
		int h=x.nextInt();
	    System.out.print("Introduce el caracter: ");
		int car=x.nextInt();
	    for (int fil = 0; fil < h; ++fil) {
	      for (int col = 0; col < h-fil-1; ++col) {
	        System.out.print(" ");
	      }
	      for (int col = 0; col < 2*fil+1; ++col) {
	        System.out.print(car);
	      }
	      System.out.println();
	    }

	}

}
