import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		 System.out.println("Este programa mostrar� los n primeros n�meros de Fibonacci");
		    
		    int fibo1 = 0;
		    int fibo2 = 1;
		    int fiboAux = 0;
		    
		    System.out.print("Indique cu�ntos n�meros desea que se muestren ");
		    int num=x.nextInt();
		    
		    for (int i = 1; i <= num; i++) {
		      if (i == 1) {
		        System.out.print(fibo1 + ", ");
		      } else if (i == 2) {
		        System.out.print(fibo2 + ", ");
		      } else {
		        System.out.print((fibo1 + fibo2) + ", ");
		        fiboAux = fibo2;
		        fibo2 += fibo1;
		        fibo1 = fiboAux;
		      }
		    }
		  }

	}


