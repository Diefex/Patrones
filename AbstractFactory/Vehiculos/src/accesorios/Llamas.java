package accesorios;

import vehiculos.Vehiculo;

public class Llamas extends VehiculoAccesorio {

	public Llamas(Vehiculo vehiculo) {
		super(vehiculo);
	}

	@Override
	public void instalarAccesorio() {

		System.out.println("El vehiculo " + vehiculo.getModelo() + " de color " + vehiculo.getColor()
				+ " ahora tiene llamas pintadas");

	}

	@Override
	public String verAccesorio() {
		return "Este " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " es de color " + vehiculo.getColor()
				+ " con llamas pintadas";
	}

}
