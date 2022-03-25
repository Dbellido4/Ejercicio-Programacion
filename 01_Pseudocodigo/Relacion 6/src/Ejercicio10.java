import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final char conjunto1[] = {'e','i','k','m','p','q','r','s','t','u','v'};
		final char conjunto2[] = {'p','v','i','u','m','t','e','r','k','q','s'};
		char codificado[];
		String frase;
		
		System.out.println("Introduzca un texto a codificar: ");
		frase = sc.nextLine();
		frase = frase.toLowerCase();
		codificado=new char[frase.length()];
		
		for (int i=0; i<frase.length(); i++) {
			codificado[i]=codifica(conjunto1, conjunto2, frase.charAt(i));
		}
		frase = String.valueOf(codificado);
		System.out.println(frase);
	}
	
	static char codifica(char conjunto1[], char conjunto2[], char c) {
		final String conj1=String.copyValueOf(conjunto1);
		char codificado;
		
		int pos=conj1.indexOf(c);
		if (pos==-1) {
			codificado= c;
		}else {
			codificado=conjunto2[pos];
		}
		return codificado;
	}
}

