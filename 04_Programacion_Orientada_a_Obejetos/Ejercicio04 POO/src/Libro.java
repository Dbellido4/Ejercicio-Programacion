
public class Libro {
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;
	
	public Libro() {} 
	public Libro (String titulo,String autor,int ejemplares,int prestados) {
		this.titulo=titulo;
		this.autor=autor;
		this.ejemplares=ejemplares;
		this.prestados=prestados;
		
	}

	public Libro( final Libro lib) {
		titulo=lib.titulo;
		autor=lib.autor;
		ejemplares=lib.ejemplares;
		prestados=lib.prestados;
		
	}
	

	public void setTitulo(String titulo) {
		this.titulo=titulo;
			}
	public String getTitulo() {
		return titulo;
	}
	public void setAutor( String autor) {
		this.autor=autor;
	}
	public String getAutor() {
		return autor;
	}
	public void setEjemplares(int ejemplares) {
		this.ejemplares=ejemplares;
	}
	public int getEjemplares() {
		return ejemplares;
	}
	public void setPrestados(int prestados) {
		this.prestados=prestados;
	}
	public int getPrestados() {
		return prestados;
	}
		
	
	public String toString() {
		String mensaje="Título: "+titulo+"\nAutor: "+autor+"\nEjemplares: "+ejemplares+"\nPrestados: "+prestados+"\n----------------\n";
		return mensaje;
		
	}

	public boolean prestamoLibro() {
		boolean prestamo=true;
		if (prestados<ejemplares)
		{
			prestados++;
			
		}
		else
		{
			prestamo=false;
		}
		return prestamo;
	}
		
			
	public boolean devolucionLibro() {
			boolean devuelto=true;
			if(prestados>0) {
				prestados--;
			}
			else
			{
				devuelto=false;
			}
			return devuelto;		
			
		}
	
}

