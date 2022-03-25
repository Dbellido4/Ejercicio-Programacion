import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase, sinEspacios, invertida;
		
		System.out.print("Introduzca una frase: ");
		frase = sc.nextLine();
		frase = frase.toLowerCase();
		sinEspacios = eliminaEspacio(frase);
		invertida = alReves(sinEspacios);
		
		if(sinEspacios.equals(invertida)) {
			System.out.println("La frase es palindroma");
		}else {
			System.out.println("La frase no es palindroma");
		}
	}

	
	static String eliminaEspacio(String cadena) {
		String sin ="";
		for(int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			if (!Character.isWhitespace(c)) {
				sin = sin + c;
			}
		}
		return sin;
	}
	static String alReves(String original) {
		String nueva = "";
		for(int i = 0; i < original.length(); i++) { 
			nueva = original.charAt(i) + nueva;
		}
		return nueva;
	}
}
