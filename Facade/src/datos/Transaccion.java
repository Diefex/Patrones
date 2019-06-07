package datos;

import java.util.Date;

public class Transaccion {

	private String Descripcion;
	private long Valor;
	private String fecha;
	private boolean Ingreso;

	public Transaccion(String descripcion, long valor) {
		this.Descripcion = descripcion;
		this.Valor = valor;
		this.fecha = new Date().toString();
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public long getValor() {
		return Valor;
	}

	public String getFecha() {
		return fecha;
	}

	public boolean isIngreso() {
		return Ingreso;
	}

}
