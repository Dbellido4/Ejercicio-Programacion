
public class Ejercicio05 {

	public static void main(String[] args) throws InterruptedException {
		
		int [][] num=new int [6][10];
		
		int fila ;
		int columna;
		
		int minimo=0;
		int filaminimo=0;
		int columnaminimo=0;
		
		int maximo=0;
		int filamaximo=0;
		int columnamaximo=0;
		
		  System.out.print("\n      ");
		    for(columna = 0; columna < 10; columna++) {
		      System.out.print("   " + columna + "  ");
		    }
		    System.out.println();
		
		    System.out.print("    ┌");
		    for(columna = 0; columna < 10; columna++) {
		      System.out.print("──────");
		    }
		    System.out.println("┐");
		    
		    for(fila = 0; fila < 6; fila++) {
		        System.out.print("  " + fila + " │");
		        for(columna = 0; columna < 10; columna++) {
		          num[fila][columna] = (int)(Math.random() * 1001);
		          System.out.printf("%5d ", num[fila][columna]);
		          Thread.sleep(100);
		
		          if (num[fila][columna] < minimo) {
		            minimo = num[fila][columna];
		            filaminimo = fila;
		            columnaminimo = columna;
		          }
		          
		      
		          if (num[fila][columna] > maximo) {
		            maximo = num[fila][columna];
		            filamaximo = fila;
		            columnamaximo = columna;
		          }
		        }
		        System.out.println("│");
		      }
		      System.out.print("    └");
		      for(columna = 0; columna < 10; columna++) {
		        System.out.print("──────");
		      }

		      System.out.println("┘\n\nEl máximo es " + maximo + " y está en la fila " + filamaximo + ", columna " + columnamaximo);
		      System.out.println("El mínimo es " + minimo + " y está en la fila " + filaminimo + ", columna " + columnaminimo);
		    }
		  }