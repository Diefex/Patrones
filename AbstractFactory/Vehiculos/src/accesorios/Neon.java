package accesorios;

import vehiculos.Vehiculo;

public class Neon extends VehiculoAccesorio {

	public Neon(Vehiculo vehiculo) {
		super(vehiculo);
	}

	@Override
	public void instalarAccesorio() {

		System.out.println("Neon instalado en " + vehiculo.getModelo());

	}

	public void encender() {
		System.out.println("Neon encendido");
	}

	public void apagar() {
		System.out.println("Neon apagado");
	}

	@Override
	public String verAccesorio() {
		return "Este " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " tiene un Neón";
	}

}
