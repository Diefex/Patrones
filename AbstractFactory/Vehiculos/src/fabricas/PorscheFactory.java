package fabricas;

import vehiculos.Camioneta;
import vehiculos.Coupe;
import vehiculos.Sedan;
import vehiculos.Vehiculo;

public class PorscheFactory extends VehiculoFactory {

	@Override
	public Vehiculo crearSedan() {
		Vehiculo sedan = new Sedan();
		sedan.setMarca("Porsche");
		sedan.setModelo("Panamera");
		return sedan;
	}

	@Override
	public Vehiculo crearCoupe() {
		Vehiculo coupe = new Coupe();
		coupe.setMarca("Porsche");
		coupe.setModelo("911");
		return coupe;
	}

	@Override
	public Vehiculo crearCamioneta() {
		Vehiculo camioneta = new Camioneta();
		camioneta.setMarca("Porsche");
		camioneta.setModelo("Cayenne");
		return camioneta;
	}

}
