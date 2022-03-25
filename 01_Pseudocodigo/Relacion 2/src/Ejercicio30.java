  import java.util.Scanner;
public class Ejercicio30 {
  public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	Scanner y=new Scanner(System.in);
	Scanner z=new Scanner(System.in);
	Scanner t=new Scanner(System.in);
    boolean datos = true;
    System.out.print("Introduce un día: ");
    int dia1Us=x.nextInt();
    switch (dia1Us){
    case 1:
  	  System.out.print("Dia: Lunes");
      break;
    case 2:
  	  System.out.print("Dia: Martes");
        break;
    case 3:
  	  System.out.print("Dia: Miercoles");
        break;
    case 4:
  	  System.out.print("Dia: Jueves");
        break;
    case 5:
  	  System.out.print("Dia: Viernes");
        break;
    case 6:
  	  System.out.print("Dia: Sabado");
        break;
    case 7:
  	  System.out.print("Dia: Domingo");
        break;
    default:
      datos = false;
    }
    System.out.print("Introduce la hora (exacta, sin minutos) del primer día: ");
    int hora1=y.nextInt();
    
    System.out.print("Introduce un día posterior al primero: ");
    int dia2Us=z.nextInt();
    switch (dia2Us){
    case 1:
  	  System.out.print("Dia: Lunes");
      break;
    case 2:
  	  System.out.print("Dia: Martes");
        break;
    case 3:
  	  System.out.print("Dia: Miercoles");
        break;
    case 4:
  	  System.out.print("Dia: Jueves");
        break;
    case 5:
  	  System.out.print("Dia: Viernes");
        break;
    case 6:
  	  System.out.print("Dia: Sabado");
        break;
    case 7:
  	  System.out.print("Dia: Domingo");
        break;
    default:
      datos = false;
    }
    System.out.print("Introduce la hora del segundo día: ");
    int hora2=t.nextInt();

    int dia1 = 0;
    int dia2 = 0;
    int horas = 0;
    
     
    if ((hora1 < 0) || (hora1 > 23) || (hora1 < 0) || (hora1 > 23)){
      datos = false;
    } 
    if (dia1 == dia2){
      if (hora1 > hora2){
        datos = false;
      } else {
        horas = hora2 -hora1;
      }
    } else {
      horas = (24-hora2) + (hora1)+ ((dia2-dia1-1)*24);
    }
    if (datos){
      System.out.print("Las horas transcurridas entre los días introducidos son: "+horas);
    } else {
      System.out.print("Los datos introducidos son incorrectos. Por favor, revísalos");
    }
  }
}