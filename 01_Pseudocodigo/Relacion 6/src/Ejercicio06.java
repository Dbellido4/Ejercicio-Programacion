import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String antes, despues;
		
		System.out.print("Escriba una cadena: ");
		antes = sc.nextLine();
		
		despues = alReves(antes);
		System.out.println(despues);
	}
	static String alReves(String original) {
		String nueva =" ";
		char t[] = original.toCharArray();
		return nueva;
	}
}
