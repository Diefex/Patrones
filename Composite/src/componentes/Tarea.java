package componentes;

public class Tarea implements ProyectoI {

	private String nombre;
	private String encargado;
	private int dias;

	public Tarea(String nombre, String encargado, int dias) {
		this.nombre = nombre;
		this.encargado = encargado;
		this.dias = dias;
	}

	@Override
	public void asignarEncargado(String nombre) {
		this.encargado = nombre;
	}

	@Override
	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
