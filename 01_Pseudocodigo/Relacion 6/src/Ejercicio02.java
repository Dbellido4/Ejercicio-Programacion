import java.util.Scanner;
public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String contrasena, palabra;
		
		System.out.print("Jugador 1. Introduzca la contraseña: ");
		contrasena = sc.nextLine();
		int l = contrasena.length();
		
		char primer = contrasena.charAt(0);
		char ultimo = contrasena.charAt(l-1);
		
		System.out.println("Pistas\nLongitud: "+ 1);
		System.out.println("Primer caracter: "+ primer);
		System.out.println("Ultimo caracter: "+ ultimo);
		
		do {
			System.out.println("Jugador 2. Palabra: ");
			palabra = sc.nextLine();
		}while (!contrasena.equals(palabra));
		
		System.out.println("Acertastes");
	}

}
