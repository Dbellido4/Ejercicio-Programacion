import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		String frase;
		int numEspacioBlanco = 0;
		char c;
		System.out.print("Escribe una frase: ");
		frase = sc.nextLine();
		
		for(int i = 0; i < frase.length(); i++) {
			c = frase.charAt(i);
			if (Character.isSpaceChar(c)) {
				numEspacioBlanco++;
			}
		}
		System.out.println("Tiene: "+ numEspacioBlanco + " espacio en blanco");
	}

}
