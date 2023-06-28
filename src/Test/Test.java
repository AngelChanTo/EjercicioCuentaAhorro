package Test;

import EjercicioCuentaAhorro.CajaAhorro;
import EjercicioCuentaAhorro.PlazoFijo;

public class Test {

	public static void main(String[] args) {
		
		CajaAhorro cuentaAhorro =  new CajaAhorro("Angel Chan",160.1f);
		PlazoFijo instancia2 = new PlazoFijo("Angel Chan", 2500f, 12, 5.0);
	
		
		
		cuentaAhorro.imprimirDatos();
		System.out.println("-------------------------\n");
		instancia2.mostrarInformacion();
	}

}
