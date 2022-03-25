import java.util.Scanner;
public class Bingo {

public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);
 int [][] jug1;
 int [][] jug2;
 int bola = 0;
 int cont1=0;
 int cont2=0;
 int din1=0;
 int din2=0;
 int contlinea1=0;
 int contlinea2=0;
 int contlinea3=0;
 int cont2linea1=0;
 int cont2linea2=0;
 int cont2linea3=0;
 int linea= 0;
 final int acertar =0;
 boolean salir = false;
 jug1=new int[3][5];
 jug2=new int[3][5];
 
 
 
 
 
 //Se elabora el carton del jugador 1
 String c = "";
  for(int i = 0; i < 3; i++) {
     for(int j = 0; j < 1; j++) {
       jug1[i][j] = (int)(Math.random() * 9) + 1;
       switch(jug1[i][j]) {
       case acertar:
         jug1[i][j]= acertar;
         break;
       default:
     }
     
     }
  }
 
  for(int i = 0; i < 3; i++) {
     for(int j = 1; j < 2; j++) {
       jug1[i][j] = (int)(Math.random() * 9) + 10;
       switch(jug1[i][j]) {
       case acertar:
         jug1[i][j]= acertar;
         break;
       default:
     }
     
     }
  }
 
  for(int i = 0; i < 3; i++) {
     for(int j = 2; j < 3; j++) {
       jug1[i][j] = (int)(Math.random() * 9) + 20;
       switch(jug1[i][j]) {
       case acertar:
         jug1[i][j]= acertar;
         break;
       default:
     }
     
     }
  }
 
  for(int i = 0; i < 3; i++) {
     for(int j = 3; j < 4; j++) {
       jug1[i][j] = (int)(Math.random() * 9) + 30;
       switch(jug1[i][j]) {
       case acertar:
         jug1[i][j]= acertar;
         break;
       default:
     }
     
     }
  }
 
  for(int i = 0; i < 3; i++) {
     for(int j = 4; j < 5; j++) {
       jug1[i][j] = (int)(Math.random() * 9) + 40;
       switch(jug1[i][j]) {
       case acertar:
         jug1[i][j]= acertar;
         break;
       default:
     }
     
     }
  }
 
  
 
  //Se elabora el carton del jugador 2
  for(int i = 0; i < 3; i++) {
     for(int j = 0; j < 1; j++) {
       jug2[i][j] = (int)(Math.random() * 9) + 1;
     }
  }
 
  for(int i = 0; i < 3; i++) {
     for(int j = 1; j < 2; j++) {
       jug2[i][j] = (int)(Math.random() * 9) + 10;
     }
  }
 
  for(int i = 0; i < 3; i++) {
     for(int j = 2; j < 3; j++) {
       jug2[i][j] = (int)(Math.random() * 9) + 20;
     }
  }
 
  for(int i = 0; i < 3; i++) {
     for(int j = 3; j < 4; j++) {
       jug2[i][j] = (int)(Math.random() * 9) + 30;
     }
  }
 
  for(int i = 0; i < 3; i++) {
     for(int j = 4; j < 5; j++) {
       jug2[i][j] = (int)(Math.random() * 9) + 40;
     }
  }
  
  
  
  // Introducimos la interfaz
  System.out.println("******BINGO IES MARTINEZ MONTAÑES******");
  System.out.println("            PREMIOS");
  System.out.println("          Linea: 100$");
  System.out.println("          BINGO: 500$");
  System.out.println("\n");
  String seguir;
  System.out.println("Pulse cualquier letra para continuar");
 try {
 seguir = teclado.nextLine();
 }
 catch(Exception e)
 {}
 
 
 

 

 
 // Imprimimos los cartones

 do {

  String carton="";
  System.out.println("----------------------");
  System.out.println("      Jugador 1");
  System.out.println("----------------------");

  for(int i = 0; i < 3; i++) {
     for(int j = 0; j < 5; j++) {
    	 if (bola == jug1[i][j]) {
    		 jug1[i][j]=0 ;
    		 cont1 = cont1 +1;
    	 }
    	 
     carton = carton +"|" + jug1[i][j]+"|";
     }
     carton = carton + "\n";
     
  }
 
  
  System.out.println(carton);
  if (cont1==15) {
		System.out.println("BINGO del jugador 1");
		din1 = din1 + 500;
  }
 
  
  String carton2="";
  System.out.println("----------------------");
  System.out.println("      Jugador 2");
  System.out.println("----------------------");
  for(int i = 0; i < 3; i++) {
     for(int j = 0; j < 5; j++) {
    	 if (bola == jug2[i][j]) {
    		 jug2[i][j]=0 ;
    		 cont2 = cont2 +1;
    	 }
     carton2 = carton2 +"|" + jug2[i][j]+"|";
     }
     carton2 = carton2 + "\n";
  }
  System.out.println(carton2);
  if (cont2==15) {
		System.out.println("BINGO del jugador 2");
		din2 = din2 + 500;
}
  

  System.out.println("Pulse cualquier letra para sacar bola");
 try {
 seguir = teclado.nextLine();
 }
 catch(Exception e)
 {}
 
 
 
 
 
 
 
 //Sacamos  una bola al azar
 bola = (int) (Math.random()*49+1);
 System.out.println(bola);
 
 
 
 // Observamos las lineas para ver si el jugador1 ha hecho linea 
 
 do {
 for(int i = 0; i < 1; i++) {
     for(int j = 0; j < 5; j++) {
    	 if (bola == jug1[0][j]) {
    		 contlinea1= contlinea1 +10;
    		
    	 }
     }
}

for(int i = 1; i < 2; i++) {
     for(int j = 0; j < 5; j++) {
if (bola == jug1[1][j]) {
	 contlinea2= contlinea2 + 5;
 	}
}
}
for(int i = 2; i < 3; i++) {
     for(int j = 0; j < 5; j++) {
if (bola == jug1[2][j]) {
	 contlinea3= contlinea3 + 2;
	}
}
}
if (linea ==0  && (contlinea1 == 50 || contlinea2 == 25 || contlinea3 == 10)) {
			  System.out.println("\n LINEA del jugador 1");
			  din1 = din1 + 100;
			  linea = linea +1;
}

 }while (contlinea1==50 || contlinea2==25 || contlinea3==10);
 

 
 
 
 // Observamos las lineas para ver si el jugador2 ha hecho linea 
 
 do {
	 for(int i = 0; i < 1; i++) {
	     for(int j = 0; j < 5; j++) {
	    	 if (bola == jug2[0][j]) {
	    		 cont2linea1= cont2linea1 +10;
	    		
	    	 }
	     }
	}

	for(int i = 1; i < 2; i++) {
	     for(int j = 0; j < 5; j++) {
	if (bola == jug2[1][j]) {
		 cont2linea2= cont2linea2 + 5;
	 	}
	}
	}
	for(int i = 2; i < 3; i++) {
	     for(int j = 0; j < 5; j++) {
	if (bola == jug2[2][j]) {
		 cont2linea3= cont2linea3 + 2;
		}
	}
	}
	if (linea ==0 && (cont2linea1 == 50 || cont2linea2 == 25||cont2linea3 == 10)) {
				  System.out.println("\n LINEA del jugador 2");
				  din2 = din2 + 100;
				  linea=linea +1;	
	}
	
 }while (cont2linea1==50 || cont2linea2==25 || cont2linea3==10);
	 

 

 }while(cont2<15 && cont1<15);


 // Elaboramos la Interfaz de los premios
 System.out.println("Dinero acumulado");
 System.out.println("--------------------");
 System.out.println("Jugador 1 : " +din1+ "$" );
 System.out.println("Jugador 2 : " +din2+ "$");
        }
     
}