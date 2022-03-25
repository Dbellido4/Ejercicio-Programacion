import java.util.Scanner;

public class Prubea {
	public static void main (String[] args) {
		Scanner max=new Scanner (System.in);
		System.out.println("¿Cual es el numero maximo del dado?");
		int maxDado= max.nextInt();
	int tiradaMax = (int) (Math.random()*maxDado);
	System.out.println(tiradaMax);
	int tiradaMax1 = (int) (Math.random()*maxDado);
	System.out.println(tiradaMax);
	int tiradaMax2 = (int) (Math.random()*maxDado);
	System.out.println(tiradaMax);
	}
}
