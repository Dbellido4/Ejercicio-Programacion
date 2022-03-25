import java.util.Scanner;


public class Ejercicio3 {

  // N determina el tamaño del array
  static int N = 50;
  
  public static void main(String[] args) {
	Scanner opc=new Scanner (System.in);
	Scanner cod=new Scanner (System.in);
	Scanner desc=new Scanner (System.in);
	Scanner km=new Scanner (System.in);
	Scanner precioVenta=new Scanner (System.in);
	Scanner dn=new Scanner (System.in);
	Scanner nom=new Scanner (System.in);
	Scanner verMarca=new Scanner (System.in);
	
	
    int opcion;
    int primeraLibre;
    int i;
    String kilometros = null;
    double precioDeVentaIntroducido = 0;
    String matricula;
    String matriculaIntroducida = "";
    String marca = null;
    String descripcionIntroducida = null;
    double precioDeVentaIntroducido1;
    String nombrePropietario = null;
    String dni = null;
    boolean existeMatricula;
    
    //Crea el array de artículos
    Vehiculo[] vehiculo = new Vehiculo[N];

    // Crea todos los artículos que van en cada una de
    // las celdas del array
    for(i = 0; i < N; i++) {
      vehiculo[i] = new Vehiculo();
    }
    
    // Menu
    do {
      System.out.println("1. Nuevo Vehiculo");
      System.out.println("2. Listar Matricula");
      System.out.println("3. Buscar Vehiculo");
      System.out.println("4. Modificar Kilometros");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = opc.nextInt();
      
      switch (opcion) {          
        case 1:
          System.out.println("\nNUEVO VEHICULO");
          System.out.println("==============");
          
          // Busca la primera posición libre del array
          primeraLibre = 0;
          matricula = vehiculo[primeraLibre].getMatricula();
          while ((primeraLibre < N) && (!(matricula.equals("LIBRE")))) {
            primeraLibre++;
            if (primeraLibre < N) {
              matricula = vehiculo[primeraLibre].getMatricula();
            }
          }
          
          if (primeraLibre == N) {
            System.out.println("Lo siento, a base de datos está llena.");
          } else {
            
            // Introducción de datos 
            
            System.out.println("Por favor, introduzca los datos del artículo.");  
            System.out.print("Matricula: ");
            
            // Comprueba que el código introducido no se repita
            existeMatricula = true;
            while (existeMatricula) {
              existeMatricula = false;
              matriculaIntroducida = cod.next();
              
              for (i = 0; i < N; i++) {
                if (matriculaIntroducida.equals(vehiculo[i].getMatricula())) {
                  existeMatricula = true;
                }
              }
              
              if (existeMatricula) {
                System.out.println("Esa matricula ya existe en la base de datos.");
                System.out.print("Introduzca otra matricula: ");
              }
            } 
            
            vehiculo[primeraLibre].setMatricula(matriculaIntroducida);
            
            System.out.print("Marca: ");
            marca = desc.next();
            vehiculo[primeraLibre].setMarca(marca);
            
            System.out.print("Nº de kilometros: ");
            kilometros = km.next();
            vehiculo[primeraLibre].setKilometros(kilometros);
            
            System.out.print("Descripcion: ");
            descripcionIntroducida = desc.next();
            vehiculo[primeraLibre].setDescripcion(descripcionIntroducida);
            
            System.out.print("Precio: ");
            precioDeVentaIntroducido1 = Double.parseDouble(precioVenta.next());
            vehiculo[primeraLibre].setPrecioDeVenta(precioDeVentaIntroducido);
            
            System.out.print("Nombre: ");
            nombrePropietario = nom.next();
            vehiculo[primeraLibre].setNombre(nombrePropietario);
            
            System.out.print("DNI: ");
            dni = dn.next();
            vehiculo[primeraLibre].setDNI(dni);
            
          }
          
          
          break;            
        case 2:
        	System.out.println("\nLISTADO DE VEHICULOS");
            System.out.println("=======");
            
            for(i = 0; i < N; i++) {
              if (!vehiculo[i].getMatricula().equals("LIBRE")) {
                System.out.println(vehiculo[i]);
              }
            }
    
          
          break;          
        case 3:
        	  System.out.println("\nBUSCADOR DE VEHICULOS");
              System.out.println("====");
              
              System.out.print("Por favor, introduzca la matricula del vehiculo: ");
              matriculaIntroducida = verMarca.next();
        
              i = -1;
              matricula = "";
              do {
                i++;
                if (i < N) {
                  matricula = vehiculo[i].getMatricula();
                }
              } while (!(matricula.equals(matriculaIntroducida)) && (i < N));
          
              if (i == N) {
                System.out.println("Lo siento, la matricula introducido no existe.");
              } else {
                vehiculo[i].setMatricula(matricula);
                System.out.println("Matricula: "+matricula);  
                vehiculo[i].setMarca(marca);
                System.out.println("Matricula: "+marca);  
                vehiculo[i].setKilometros(kilometros);
                System.out.println("Kilometros: "+kilometros);  
                vehiculo[i].setDescripcion(descripcionIntroducida);
                System.out.println("Descripcion: "+descripcionIntroducida);  
                vehiculo[i].setPrecioDeVenta(precioDeVentaIntroducido);
                System.out.println("Precio: "+precioDeVentaIntroducido);  
                vehiculo[i].setNombre(nombrePropietario);
                System.out.println("Nombre: "+nombrePropietario);  
                vehiculo[i].setDNI(dni);
                System.out.println("DNI: "+dni);
              }
          break;              
          case 4:
        	  System.out.println("\nMODIFICACIÓN");
              System.out.println("============");
              
              System.out.print("Por favor, introduzca la matricula del vehiculo cuyos datos desea cambiar: ");
              matriculaIntroducida = cod.next();
        
              i = -1;
              do {
                i++;
              } while (!((vehiculo[i].getMatricula()).equals(matriculaIntroducida)));
              
              System.out.println("Introduzca los nuevos datos.");
        
              
              System.out.println("Kilometros: " + vehiculo[i].getKilometros());
              System.out.print("Nuevos Kilometros: ");
              kilometros = km.next();
              if (!kilometros.equals("")) {
                vehiculo[i].setKilometros(kilometros);
              }
              break;                
            case 5:
            	  System.out.println("\nAÑOS ANTIGÜEDAD");
                  System.out.println("====");
                  
                  System.out.print("Por favor, introduzca la matricula del vehiculo: ");
                  matriculaIntroducida = verMarca.next();
            
                  i = -1;
                  matricula = "";
                  do {
                    i++;
                    if (i < N) {
                      matricula = vehiculo[i].getMatricula();
                    }
                  } while (!(matricula.equals(matriculaIntroducida)) && (i < N));
              
                  if (i == N) {
                    System.out.println("Lo siento, la matricula introducido no existe.");
                  } else {
                    vehiculo[i].setMarca(marca);
                    System.out.println("Años: "+marca);  
                  }
              break;
            case 6:
          	  System.out.println("\nPROPIETARIO");
                System.out.println("====");
                
                System.out.print("Por favor, introduzca la matricula del vehiculo: ");
                matriculaIntroducida = verMarca.next();
          
                i = -1;
                matricula = "";
                do {
                  i++;
                  if (i < N) {
                    matricula = vehiculo[i].getMatricula();
                  }
                } while (!(matricula.equals(matriculaIntroducida)) && (i < N));
            
                if (i == N) {
                  System.out.println("Lo siento, la matricula introducido no existe.");
                } else {
                  vehiculo[i].setNombre(nombrePropietario);
                  System.out.println("Propietario: "+nombrePropietario);  
                }
            break;
            case 7:
            	  System.out.println("\nDESCRIPCION");
                  System.out.println("====");
                  
                  System.out.print("Por favor, introduzca la matricula del vehiculo: ");
                  matriculaIntroducida = verMarca.next();
            
                  i = -1;
                  matricula = "";
                  do {
                    i++;
                    if (i < N) {
                      matricula = vehiculo[i].getMatricula();
                    }
                  } while (!(matricula.equals(matriculaIntroducida)) && (i < N));
              
                  if (i == N) {
                    System.out.println("Lo siento, la matricula introducido no existe.");
                  } else {
                    vehiculo[i].setDescripcion(descripcionIntroducida);
                    System.out.println("Descripcion: "+descripcionIntroducida);  
                  }
              break;
            case 8:
          	  System.out.println("\nPRECIO");
                System.out.println("====");
                
                System.out.print("Por favor, introduzca la matricula del vehiculo: ");
                matriculaIntroducida = verMarca.next();
          
                i = -1;
                matricula = "";
                do {
                  i++;
                  if (i < N) {
                    matricula = vehiculo[i].getMatricula();
                  }
                } while (!(matricula.equals(matriculaIntroducida)) && (i < N));
            
                if (i == N) {
                  System.out.println("Lo siento, la matricula introducido no existe.");
                } else {
                  vehiculo[i].setPrecioDeVenta(precioDeVentaIntroducido);
                  System.out.println("Descripcion: "+precioDeVentaIntroducido);  
                }
            break;
      } 
    } while (opcion != 5);
  }
}