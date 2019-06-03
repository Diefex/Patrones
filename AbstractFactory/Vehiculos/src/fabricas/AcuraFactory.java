package fabricas;

import vehiculos.Camioneta;
import vehiculos.Coupe;
import vehiculos.Sedan;
import vehiculos.Vehiculo;

public class AcuraFactory extends VehiculoFactory {

	@Override
	public Vehiculo crearSedan() {
		Vehiculo sedan = new Sedan();
		sedan.setMarca("Acura");
		sedan.setModelo("MDX Advance");
		return sedan;
	}

	@Override
	public Vehiculo crearCoupe() {
		Vehiculo coupe = new Coupe();
		coupe.setMarca("Acura");
		coupe.setModelo("NSX Charlotte");
		return coupe;
	}

	@Override
	public Vehiculo crearCamioneta() {
		Vehiculo camioneta = new Camioneta();
		camioneta.setMarca("Acura");
		camioneta.setModelo("LRX Luxury");
		return camioneta;
	}

}
