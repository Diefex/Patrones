package accesorios;

import vehiculos.Vehiculo;

public class Neon extends Accesorio {

	@Override
	public void instalarEnVehiculo(Vehiculo vehiculo) {

		System.out.println("Neon instalado en " + vehiculo.getModelo());

	}

	public void encender() {
		System.out.println("Neon encendido");
	}

	public void apagar() {
		System.out.println("Neon apagado");
	}

}
