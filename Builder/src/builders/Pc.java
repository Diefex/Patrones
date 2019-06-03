package builders;

import java.util.ArrayList;

public class Pc {

	private String Board;
	private String Procesador;
	private ArrayList<String> Ram;
	private ArrayList<String> Targetas;
	private String Disco;
	private String Refrigeracion;

	public Pc() {
		Board = "Ninguna";
		Procesador = "Nunguno";
		Ram = new ArrayList<String>();
		Targetas = new ArrayList<String>();
		Disco = "Ninguno";
		Refrigeracion = "Ninguno";
	}

	public String getBoard() {
		return Board;
	}

	public void setBoard(String board) {
		Board = board;
	}

	public String getProcesador() {
		return Procesador;
	}

	public void setProcesador(String procesador) {
		Procesador = procesador;
	}

	public ArrayList<String> getRam() {
		return Ram;
	}

	public void setRam(String ram, int i) {
		Ram.add(ram);
	}

	public ArrayList<String> getTargetas() {
		return Targetas;
	}

	public void setTargetas(String targetas, int i) {
		Targetas.add(targetas);
	}

	public String getDisco() {
		return Disco;
	}

	public void setDisco(String disco) {
		Disco = disco;
	}

	public String getRefrigeracion() {
		return Refrigeracion;
	}

	public void setRefrigeracion(String refrigeracion) {
		Refrigeracion = refrigeracion;
	}

}
