package poo;

public class Cuenta {
	
	private String nombre_cliente;
	private String numero_cuenta;
	private Double interes;
	private Double saldo;

	public Cuenta(){
		
	}
	
	public Cuenta(String nombre, String numero_cliente, Double interes, Double saldo) {
		this.nombre_cliente= nombre_cliente;
		this.numero_cuenta=numero_cuenta;
		this.interes=interes;
		this.saldo=saldo;
		
	}
	
	 public Cuenta(final Cuenta c) {
	        nombre_cliente = c.nombre_cliente;
	        numero_cuenta = c.numero_cuenta;
	        interes = c.interes;
	        saldo = c.saldo;
	    }
	 public void setNombre(String s) {
	        nombre_cliente = s;
	    }

	    public void setNumeroCuenta(String s) {
	        numero_cuenta = s;
	    }

	    public void setTipoInteres(double n) {
	        interes = n;
	    }

	    public void setSaldo(double n) {
	        saldo = n;
	    }

	    public String getNombre() {
	        return nombre_cliente;
	    }

	    public String getNumeroCuenta() {
	        return numero_cuenta;
	    }

	    public double getTipoInteres() {
	        return interes;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public boolean ingreso(double n) {
	        boolean ingresoCorrecto = true;
	        if (n < 0) {
	            ingresoCorrecto = false;
	        } else {
	            saldo = saldo + n;
	        }
	        return ingresoCorrecto;
	    }

	    public boolean reintegro(double n) {
	        boolean reintegroCorrecto = true;                                                                         
	        if (n < 0) {
	            reintegroCorrecto = false;
	        } else if (saldo >= n) {
	            saldo -= n;
	        } else {
	            reintegroCorrecto = false;
	        }
	        return reintegroCorrecto;
	    }


	    public boolean transferencia(Cuenta c, double n) {
	        boolean correcto = true;
	        if (n < 0) {
	            correcto = false;
	        } else if (saldo >= n) {
	            reintegro(n);
	            c.ingreso(n);
	        } else {
	            correcto = false;
	        }
	        return correcto;
	    }
	
}

	   