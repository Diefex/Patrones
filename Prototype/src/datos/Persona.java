package datos;

public class Persona {

	private String Nombre;
	private String Apellido;
	private String Direccion;
	private String Telefono;

	public Persona clonarDatos() {
		Persona persona = new Persona();

		persona.setApellido(this.Apellido);
		persona.setDireccion(this.Direccion);
		persona.setTelefono(this.Telefono);
		return persona;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombres(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

}
