package componentes;

import java.util.ArrayList;

public class Proyecto implements ProyectoI {

	private String nombre;
	private String encargado;
	private Proyecto padre;
	private ArrayList<ProyectoI> tareas;

	public Proyecto(String nombre, String encargado, Proyecto padre) {
		tareas = new ArrayList<ProyectoI>();
		this.nombre = nombre;
		this.encargado = encargado;
		this.padre = padre;
	}

	@Override
	public void asignarEncargado(String nombre) {
		this.encargado = nombre;
	}

	@Override
	public int getDias() {
		int dias = 0;
		for (ProyectoI tarea : tareas) {
			dias += tarea.getDias();
		}
		return dias;
	}

	public void nuevaTarea(ProyectoI tarea) {
		tareas.add(tarea);
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEncargado() {
		return encargado;
	}

	public ArrayList<ProyectoI> getTareas() {
		return tareas;
	}

	public Proyecto getPadre() {
		return padre;
	}

}
