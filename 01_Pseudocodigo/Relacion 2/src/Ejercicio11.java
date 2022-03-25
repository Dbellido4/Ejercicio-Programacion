import java.util.Scanner;
public class Ejercicio11{

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int num=x.nextInt();
		  for (int i = num; i < num + 5; i++) {
		    System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
		  }
		}

	}