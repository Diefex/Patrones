package fabricas;

import vehiculos.Vehiculo;

public abstract class VehiculoFactory {

	public abstract Vehiculo crearSedan();

	public abstract Vehiculo crearCoupe();

	public abstract Vehiculo crearCamioneta();

}
