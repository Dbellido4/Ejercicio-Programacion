import java.util.Scanner;

public class JuegoOca {
		
	public static void main (String[] args) {
		int fichaJ1=0, fichaJ2=0;
		int maximo = 0;
		int minimo = 0;
		int contador;
		boolean esPrimo=false;
		boolean ganador=false;
	
		
		System.out.println("!BIENVENIDO A LA CARRERA DEL SIGLO");
		tiraDados(maximo,  minimo);
		Scanner nom1=new Scanner (System.in);
		Scanner nom2=new Scanner (System.in);
		System.out.println("¿Cual es el nombre del jugador 1?");
		String nomJ1= nom1.next();
		System.out.println("¿Cual es el nombre del jugador 2?");
		String nomJ2= nom2.next();
		
		
		System.out.println("!COMENCEMOS A JUGAR¡");
		pintaPista(fichaJ1, fichaJ2);
		
		
	
	}
	
	public static void tiraDados(int maximo, int minimo) {
		int tirada1, tirada2;
		Scanner min=new Scanner (System.in);
		Scanner max=new Scanner (System.in);
		
		System.out.println("¿Cual es el numero maximo del dado?");
		int maxDado= max.nextInt();
		System.out.println("¿Cual es el numero minimo del dado?");
		int minDado= min.nextInt();
		
		tirada1 =(int) (Math.random()*(maxDado+1-minDado))+minDado;
		tirada2 =(int) (Math.random()*(maxDado+1-minDado))+minDado;
		System.out.println("Has sacado un "+tirada1+" en la primera tirada");
		System.out.println("Has sacado un "+tirada2+" en la segunda tirada");
	}
	
	public static void pintaPista(int fichaJ1, int fichaJ2) {
			for(int i=1; i<=11;i++) {
				System.out.println("  "+i);
			}
			System.out.println("\nJ1");
			System.out.println("\nJ2");
			System.out.println("\t");
		}
	
		static boolean sumaDeNumerosEsPrimo(int tirada1, int tirada2, int contador) {
		for(int i=1;i<=tirada1+tirada2;i++) {
			if((tirada1+tirada2%i)==0) {
				contador++;
			}
		}
		if (contador<=2) {
			System.out.println("TIRADA VALIDA");
			return true;
		}else {
			System.out.println("TIRADA NO VALIDA");
		}return false;
	}
	
		static String imprimeComoVaLaCarrera() {
			
			
		}
		
		static void EsGanador() {
			int fichaJ1=0;
			int fichaJ2=0;
			switch(fichaJ1) {
			case 1:
				System.out.println("    ");
				break;
			case 2:
				System.out.println("        ");
				break;
			case 3:
				System.out.println("             ");
				break;
			case 4:
				System.out.println("                  ");
				break;
			case 5:
				System.out.println("                       ");
				break;
			case 6:
				System.out.println("                            ");
				break;
			case 7:
				System.out.println("                                   ");
				break;
			case 8:
				System.out.println("                                           ");
				break;
			case 9:
				System.out.println("                                                ");
				break;
			case 10:
				System.out.println("                                                      ");
				break;
			case 11:
				System.out.println("                                                          ");
				System.out.println( nomJ1);

				break;
				
			}
			switch(fichaJ2) {
			case 1:
				System.out.println("    ");
				break;
			case 2:
				System.out.println("        ");
				break;
			case 3:
				System.out.println("             ");
				break;
			case 4:
				System.out.println("                  ");
				break;
			case 5:
				System.out.println("                       ");
				break;
			case 6:
				System.out.println("                            ");
				break;
			case 7:
				System.out.println("                                   ");
				break;
			case 8:
				System.out.println("                                           ");
				break;
			case 9:
				System.out.println("                                                ");
				break;
			case 10:
				System.out.println("                                                      ");
				break;
			case 11:
				System.out.println("                                                          ");
				System.out.println( nomJ2);

				
			}
			
		}
}
