package EjercicioCuentaAhorro;

public class PlazoFijo extends Cuenta{

	//1. atributos 
	public int plazo;
	public double interes;
	//definimos el constructor
	
	public PlazoFijo(String titular, float cantidad, int plazo, double interes) {
		super(titular, cantidad);
		this.plazo = plazo;
		this.interes = interes;
	}
	
	//2. metodo para calcular el importe del interees
	
	public double calculoInteres() {
		double totalInteres = (this.cantidad*this.interes)/100;
		return totalInteres;
	}
	
	//metodo para mostrar informacion
	public void mostrarInformacion() {
		System.out.println("Informacion de la cuenta Plazo Fijo");
		imprimirDatos();
		System.out.println("Plazo: "+ plazo);
		System.out.println("Interes: "+interes);
		System.out.println("Total de Interes: " + calculoInteres());
	}
	
}
