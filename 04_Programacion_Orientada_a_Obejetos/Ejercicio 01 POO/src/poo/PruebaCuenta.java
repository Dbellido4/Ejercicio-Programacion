package poo;

import java.util.Scanner;

public class PruebaCuenta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String nombre, numero;
		 double interes, importe;
		
		Cuenta cuenta1 = new Cuenta();
		Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300.00);
		Cuenta cuenta3 = new Cuenta(cuenta1);
		
		 System.out.print("Nombre : ");
		 nombre = sc.nextLine();
		 System.out.print("Número de cuenta : ");
		 numero = sc.nextLine();
		 System.out.print("Tipo de interes : ");
		 interes = sc.nextDouble();
		 System.out.print("Saldo: ");
		 importe = sc.nextDouble();

		 cuenta1.setNombre(nombre);
		 cuenta1.setNumeroCuenta(numero);
		 cuenta1.setTipoInteres(interes);
		 cuenta1.setSaldo(importe);
		 
		 System.out.println("Datos de la cuenta 1");
		 System.out.println("Nombre del titular: " + cuenta1.getNombre());
		 System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
		 System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
		 System.out.println("Saldo: " + cuenta1.getSaldo());
		 System.out.println();
		       

	}

}
