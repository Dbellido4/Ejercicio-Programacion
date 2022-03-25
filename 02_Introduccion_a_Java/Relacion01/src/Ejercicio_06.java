/**
 *
 * 6. Escribe un programa que calcule el total de una factura a partir
 *    de la base imponible (precio sin IVA). La base imponible estará
 *    almacenada en una variable.
 *
 */

public class Ejercicio_06 {
  public static void main(String[] args) {
	final double IVA=0.21;
    double baseImponible = 100;

    System.out.println("Base imponible "+ baseImponible);
    System.out.println("IVA            "+(baseImponible * IVA));
    System.out.println("-----------------------");
    System.out.println("Total          "+ (baseImponible * IVA+baseImponible));
  }
}