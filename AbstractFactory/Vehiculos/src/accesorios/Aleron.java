package accesorios;

import vehiculos.Vehiculo;

public class Aleron extends VehiculoAccesorio {

	public Aleron(Vehiculo vehiculo) {
		super(vehiculo);
	}

	@Override
	public void instalarAccesorio() {

		System.out.println("Aleron instalado en " + vehiculo.getModelo());

	}

	public void subirAleron() {
		System.out.println("aleron arriba");
	}

	public void bajarAleron() {
		System.out.println("aleron abajo");
	}

	@Override
	public String verAccesorio() {
		return "Este " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " tiene un Alerón";
	}

}
