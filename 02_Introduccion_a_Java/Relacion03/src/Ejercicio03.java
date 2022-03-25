/**
 *  Números aleatorios
 * 
 * 3. Realiza un programa que muestre al azar el nombre de una carta de la baraja española. 
 * 	  Se utilizará la baraja de
 *    48 cartas: 2, 3, 4, 5, 6, 7, 8, 9, sota, caballo, rey y as.
 *
 */
public class Ejercicio03 {

  public static void main(String[] args) {
    
    String palo = "";
    String carta = "";
    
    switch((int)(Math.random()*4)) {
      case 0:
        palo = "oros";
        break;
      case 1:
        palo = "copas";
        break;
      case 2:
        palo = "bastos";
        break;
      case 3:
        palo = "espadas";
      default:
    }
    
    int numeroCarta = (int)(Math.random()*10) + 1;//obtiene un valor entre 1 y 10
    
    switch(numeroCarta) {
    case 1:
      carta = "As";
      break;
    case 8:
      carta = "Sota";
      break;
    case 9:
      carta = "Caballo";
      break;
    case 10:
      carta = "Rey";
      break;
    default:
      carta = String.valueOf(numeroCarta);
  }
    
    System.out.println(carta + " de " + palo);
  }
}