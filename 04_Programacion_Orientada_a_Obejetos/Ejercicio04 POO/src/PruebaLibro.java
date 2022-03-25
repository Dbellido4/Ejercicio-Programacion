import java.util.Scanner;

public class PruebaLibro {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int ejemplares, prestados;
		String titulo, autor;
		
		Libro libro1= new Libro("El quijote","Cervantes",1,0);
		
		Libro libro2 = new Libro();
		
		
		System.out.println("Introduce los datos del libro 2");
		System.out.println("Introduce el título del libro 2");
		titulo=s.nextLine();
		
		System.out.println("Introduce el autor del libro");
		autor=s.nextLine();
		
		System.out.println("Introduce el número de ejemplares del libro");
		ejemplares=s.nextInt();
		
		System.out.println("Introduce el número de libros prestados");
		prestados=s.nextInt();
	
		libro2.setTitulo(titulo);
		libro2.setAutor(autor);
		libro2.setEjemplares(ejemplares);
		libro2.setPrestados(prestados);
		System.out.println(libro2);
		
	  
		
		System.out.println("Los datos del libro 1 son:");
		
		System.out.println(libro1);
		
		
		System.out.println("Vamos a prestar el libro 1. Sus datos antes de prestar son:");
		System.out.println(libro1);
		
		if(libro1.prestamoLibro()) {
			System.out.println("El libro 1 ha sido prestado con éxito");
			
			System.out.println(libro1);	
			
		}
		else
		{
			System.out.println("No se ha podido realizar el préstamo");
		}

		System.out.println("Vamos a delvolver el libro 1. Sus datos antes de devolver son: ");
		System.out.println(libro1);
		
		
		if(libro1.devolucionLibro()) {
			System.out.println("El libro 1 ha sido devuelto con éxito");
			
			System.out.println(libro1);	
			
		}
		else
		{
			System.out.println("No se ha podido realizar la devolución");
		}
		
		
		
		if(libro1.prestamoLibro()) {
			System.out.println("El libro 1 ha sido prestado con éxito");
			
			System.out.println(libro1);	
			
		}
		else
		{
			System.out.println("No se ha podido realizar el préstamo");
		}
	   
		
		
		

	}

}

	}

}
