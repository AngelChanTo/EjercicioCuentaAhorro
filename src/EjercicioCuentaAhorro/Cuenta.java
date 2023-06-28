package EjercicioCuentaAhorro;

public class Cuenta {

	//1. atributos
	
	private String titular;
	private float cantidad;
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	//constructor para pasarlo a las subclasses
	public Cuenta(String titular, float cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}//constructor
	
	//2. metodo para imprimir datos
	
	public void imprimirDatos() {
		System.out.println("Titular: " + titular );
		System.out.println("Cantidad: " + cantidad);
		
	}//imprimir datos
	
}//class cuenta
