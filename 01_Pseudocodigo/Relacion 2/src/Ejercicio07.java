import java.util.Scanner;
public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		   int intentos = 4;
		    int contrasenia=6969;
		    boolean acertado = false;
		    
		    do {
		      System.out.print("Introduzca la clave de la caja fuerte: ");
		      int num = sn.nextInt();
		      
		      if (num == contrasenia) {
		        acertado = true;
		      } else {
		        System.out.println("Lo siento, esa no es la combinación");
		      }
		      
		      intentos--;
		  
		    } while((intentos > 0) && (!acertado));
		    
		    if (acertado) {
		      System.out.println("La caja fuerte se ha abierto satisfactoriamente");
		    } else {
		      System.out.println("Lo siento, ha agotado las 4 oportunidades.");
		    }
		  }
		}
