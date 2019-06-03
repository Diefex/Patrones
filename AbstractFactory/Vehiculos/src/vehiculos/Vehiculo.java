package vehiculos;

import java.awt.Color;

import accesorios.Accesorio;

public abstract class Vehiculo {

	protected String marca;
	protected String tipo;
	protected String modelo;
	protected Color color;

	protected String accesorio;

	public void instalarAccesorio(Accesorio accesorio) {
		accesorio.instalarEnVehiculo(this);
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getColor() {
		return "" + color.getRed() + color.getGreen() + color.getBlue();
	}

}
