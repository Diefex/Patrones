package accesorios;

import vehiculos.Vehiculo;

public class Aleron extends Accesorio {

	@Override
	public void instalarEnVehiculo(Vehiculo vehiculo) {

		System.out.println("Aleron instalado en " + vehiculo.getModelo());

	}

	public void subirAleron() {
		System.out.println("aleron arriba");
	}

	public void bajarAleron() {
		System.out.println("aleron abajo");
	}

}
