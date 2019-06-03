package fabricas;

import vehiculos.Camioneta;
import vehiculos.Coupe;
import vehiculos.Sedan;
import vehiculos.Vehiculo;

public class RollRoyceFactory extends VehiculoFactory {

	@Override
	public Vehiculo crearSedan() {
		Vehiculo sedan = new Sedan();
		sedan.setMarca("Roll Royce");
		sedan.setModelo("Phantom");
		return sedan;
	}

	@Override
	public Vehiculo crearCoupe() {
		Vehiculo coupe = new Coupe();
		coupe.setMarca("Roll Royce");
		coupe.setModelo("Wraith");
		return coupe;
	}

	@Override
	public Vehiculo crearCamioneta() {
		Vehiculo camioneta = new Camioneta();
		camioneta.setMarca("Roll Royce");
		camioneta.setModelo("Cullinam");
		return camioneta;
	}

}
