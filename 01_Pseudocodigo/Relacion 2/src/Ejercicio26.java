import java.util.Scanner;
public class Ejercicio26 {
	  public static void main(String[] args) {
		  Scanner x=new Scanner(System.in);
		  Scanner y=new Scanner(System.in);
	    System.out.print("Introduce un n�mero: ");
	    int numUs=x.nextInt();;
	    System.out.print("Introduce un d�gito de ese n�mero: ");
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
	    System.out.print("El d�gito "+digUs+" est� en ");
	    int dig;
	    int pos;
	    for (pos = 1; pos <= numDig ; pos++){
	      dig = reves%10;
	      if (dig == digUs){
	        esta = true;
	        System.out.print(pos+"� ");
	      }
	      reves /= 10;
	    }
	    if (esta = false){
	      System.out.print("ninguna ");
	    }
	    System.out.print("posicion en el n�mero "+numUs); 
	  }
	}