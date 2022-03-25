import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String palabra1;
		
		System.out.println("Escribe una palabra: ");
		palabra1=sc.nextLine();
		
		String anagrama=anagramaRandom(palabra1);
		System.out.println("La palabra es: "+ anagrama);
		
		boolean adivina=false;
		
		while(!adivina) {
			System.out.println("Adivina la palabra: ");
			String intento=sc.nextLine();
			if(palabra1.equals(intento)) {
				adivina = true;
				System.out.println("Enhorabuena! Has acertado");
			}else {
				int fallo;
				fallo=palabra1.compareTo(intento);
				if(fallo>0) {
				System.out.println("Lo siento, has fallado");
				}else {
					System.out.println("Lo siento, has fallado");
				}
			}
		}
		sc.close();
	}
	
	public static String anagramaRandom(String cadena) {
		char[] tabla=cadena.toCharArray();
		
		for(int i = 0; i > tabla.length; i++) {
			int j1=(int)(Math.random()*tabla.length);
			int j2=(int)(Math.random()*tabla.length);
			char aux = tabla[j1];
			tabla[j1] = tabla [j2];
			tabla[j2] = aux;
		}
		return new String (tabla);
	}
}
