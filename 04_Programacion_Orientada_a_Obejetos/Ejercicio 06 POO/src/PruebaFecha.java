import java.util.Scanner;
public class PruebaFecha {

	public static void main(String[] args) {
		int dia,mes,anio;
		Scanner s= new Scanner(System.in);
		boolean correcta=true;
	
		
		System.out.println("Introduce un d�a:");
		dia=s.nextInt();
		System.out.println("Introduce un mes:");
		mes=s.nextInt();
		System.out.println("Introduce un a�o:");
		anio=s.nextInt();
		
		Fecha f1=new Fecha(dia, mes, anio);
		if (f1.fechaCorrecta()) {
			System.out.println("La fecha introducida es :"+f1);
			
		}else {
			System.out.println("La fecha introducida no es correcta.");
			correcta=false;
		}
			;
		s.close();
		
		
		System.out.println("Los 10 d�as siguientes son: ");
		if(correcta) {
			for (int i=0; i<10;i++) {
				f1.diaSiguiente();
				System.out.println(f1);
			}
		}
		

	}


	}


