
public class Ejercicio09 {

	public static void main(String[] args) {
		int[][] cuadrante = new int[12][12];
		
		for(int i = 0; i < 12; i++) {
		     for(int j = 0; j < 12; j++) {
		    	  cuadrante[i][j] = (int)(Math.random() * 145);
		     }
		     }
		 
		
		 System.out.println(cuadrante);
	}

}
