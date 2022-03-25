public class Vehiculo {
  private String matricula="LIBRE";
  private String marca;
  private String descripcion;
  private String nombrePropietario;
  private String dni;
  private double precioDeVenta;
  private String kilometros;
  
  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }
  public String getMatricula() {
	    return matricula;
	  }

	  public void setMatricula(String matricula) {
	    this.matricula = matricula;
	  }
  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }


  public double getPrecioDeVenta() {
    return precioDeVenta;
  }

  public void setPrecioDeVenta(double precioDeVenta) {
    this.precioDeVenta = precioDeVenta;
  }

  public String getKilometros() {
    return kilometros;
  }

  public String setKilometros(String kilometros) {
    return this.kilometros = kilometros;
  }
  public String getNombre() {
	    return nombrePropietario;
	  }

	  public void setNombre(String nombre) {
	    this.nombrePropietario = nombre;
	  }
	  
	  public String getDNI() {
		    return dni;
		  }

		  public void setDNI(String dni) {
		    this.dni = dni;
		  }

		  public String toString() {
			    String cadena = "------------------------------------------";
			    cadena += "\nMatricula: " + this.matricula;
			    cadena += "\nMarca: " + this.marca;
			    cadena += "\nKilometros: " + this.kilometros;
			    cadena += "\nDescripción: " + this.descripcion;
			    cadena += "\nPrecio: " + this.precioDeVenta;
			    cadena += "\nNombre: " + this.nombrePropietario;
			    cadena += "\nDNI: " + this.dni;
			    cadena += "\n------------------------------------------";
			    return cadena;
			  }
}