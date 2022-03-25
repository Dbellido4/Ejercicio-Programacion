import java.util.Scanner;
public class Ejercicio26 {
	  public static void main(String[] args) {
		  Scanner x=new Scanner(System.in);
		  Scanner y=new Scanner(System.in);
	    System.out.print("Introduce un número: ");
	    int numUs=x.nextInt();;
	    System.out.print("Introduce un dígito de ese número: ");
	    int digUs=y.nextInt();
	    boolean esta = false;
	    int div = 10;
	    int numBasura = numUs;
	    int reves = 0;
	    int numDig = 0;
	    while (numBasura > 0){
	      reves = ((reves*10) + (numBasura % 10));
	      numBasura /=10;
	      numDig++;
	    }
	    System.out.print("El dígito "+digUs+" está en ");
	    int dig;
	    int pos;
	    for (pos = 1; pos <= numDig ; pos++){
	      dig = reves%10;
	      if (dig == digUs){
	        esta = true;
	        System.out.print(pos+"ª ");
	      }
	      reves /= 10;
	    }
	    if (esta = false){
	      System.out.print("ninguna ");
	    }
	    System.out.print("posicion en el número "+numUs); 
	  }
	}