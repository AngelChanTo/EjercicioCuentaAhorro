package EjercicioCuentaAhorro;

public class CajaAhorro extends Cuenta{
	
	//2. metodo heredar los datos
	public CajaAhorro(String titular, float cantidad) {
		super(titular, cantidad);
	}//caja ahorro
	

	public void imprimirDatos() {
		System.out.println("Titular: " + titular );
		System.out.println("Cantidad: " + cantidad);
			
	}//imprimir datos


	@Override
	public String toString() {
		return "CajaAhorro [titular=" + titular + ", cantidad=" + cantidad + "]";
	}//toString

	
}// class cajaAhorro
