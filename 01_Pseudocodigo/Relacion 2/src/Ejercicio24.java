 import java.util.Scanner;
public class Ejercicio24 { 
  public static void main(String[] args) {
	  Scanner x=new Scanner(System.in);
  System.out.print("Introduce la altura: ");
  int h=x.nextInt();
    for (int fil = 0; fil <= h; ++fil) {
      for (int col = 0; col <= h-fil-1; ++col) {
        System.out.print(" ");
      }
      int num = fil-1;
      for (int col = 1; col < 2*fil; ++col) {
        if (col <= fil){
          System.out.print(col);
        }
        if (col > fil){
          System.out.print(num);
          num--;
        }
      }
      System.out.println();
    }
  }
}