package accesorios;

import vehiculos.Vehiculo;

public abstract class VehiculoAccesorio {

	protected Vehiculo vehiculo;

	public VehiculoAccesorio(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public abstract void instalarAccesorio();

	public abstract String verAccesorio();

	public String getMarca() {
		return vehiculo.getMarca();
	}

	public String getModelo() {
		return vehiculo.getModelo();
	}

	public String getColor() {
		return vehiculo.getColor();
	}

}
