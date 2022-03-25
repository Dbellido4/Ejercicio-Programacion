public class Vehiculo {
private String matricula = "LIBRE";
private String marca;
private String descripcion;
private String nombrePropietario;
private String dni;
private double precioDeVenta;
private int kilometros; 
private int dia;
private int mes;
private int anio;

public String getMarca() {
return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}

public String getMatricula() {
	return matricula;
}

public void setAutor(String matricula) {
	this.matricula = matricula;
}

public String getNombrePropietario() {
return nombrePropietario;
}

public void setNombrePropietario(String nombre) {
	this.nombrePropietario = nombre;
}

public String getDNIPropietario() {
return dni;
}

public void setDNIPropietario(String dni) {
	this.dni = dni;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public int getKilometros() {
	return kilometros;
}

public void setKilometros(int kilometros) {
	this.kilometros = kilometros;
}
public double getPrecioDeVenta() {
    return precioDeVenta;
  }

  public void setPrecioDeVenta(double precioDeVenta) {
    this.precioDeVenta = precioDeVenta;
  }
  public void setDia(int d) {
      dia = d;
  }

  public void setMes(int m) {
      mes = m;
  }

  public void setAnios(int a) {
      anio = a;
  }

  public int getDia() {
      return dia;
  }

  public int getMes() {
      return mes;
  }

  public int getAnios() {
      return anio;
  }
}
