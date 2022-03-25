public class PruebaContador {
	public static void main(String[] args) {
	
		Contador contador1=new Contador();
		contador1.setContador(5);
		System.out.println("EL valor de contador1 es:"+contador1.getContador());
		contador1.incrementar();
		

		System.out.println("EL valor incrementado del contador1 es:"+contador1.getContador());
		contador1.incrementar();
		contador1.incrementar();
		System.out.println("EL valor incrementado dos veces del contador1 es:"+contador1.getContador());
		contador1.decrementar();
		System.out.println("EL valor decrementado del contador1 es:"+contador1.getContador());
		
		Contador contador2=new Contador(10);
		contador2.incrementar();
		contador2.decrementar();
		System.out.println("EL valor incrementado y decrementado del contador2 es:"+contador2.getContador());
		
		Contador contador3=new Contador(contador2 );
	  
		System.out.println("EL valor del contador 3 es:"+contador3.getContador());
		
	
	
	}
	
	}

