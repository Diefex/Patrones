package datos;

import java.util.ArrayList;

public class BaseDeDatos {

	private static BaseDeDatos BD;
	public static ArrayList<Persona> personas;

	private BaseDeDatos() {
		personas = new ArrayList<Persona>();
		Persona diego = new Persona();
		diego.setNombres("Diego");
		diego.setApellido("Velez");
		diego.setDireccion("Bosa");
		diego.setTelefono("20172020075");
		personas.add(diego);
	}

	public static BaseDeDatos getBD() {
		if (BD == null) {
			BD = new BaseDeDatos();
		}
		return BD;
	}

	public static void agregarPersona(Persona persona) {

		personas.add(persona);
	}

	public static void quitarPersona(Persona persona) {

		personas.remove(persona);
	}

}
