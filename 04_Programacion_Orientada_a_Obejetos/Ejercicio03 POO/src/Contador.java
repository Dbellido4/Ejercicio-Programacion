public class Contador {
	private int contador;
		
	public Contador() {}
		
	public Contador(int cont) {
		if(cont<0) {
			this.contador=0;
		}else {
			this.contador=cont;
		}
	}
	
	
	public Contador(final Contador c) {
		contador=c.contador;
	}
	
	public void setContador(int cont) {
		if(cont<0) {
			this.contador=0;
		}else {
			
		this.contador=cont;
		}
	}
	
	public int getContador() {
		return contador;
	}
	
	public void incrementar() {
		contador++;
	}
	public void decrementar() {
		contador--;
		if (contador<0) {
			contador=0;
		}
	}
	
	

}
