package clientes;

public class Cliente {

	String numero;
	int segundos;

	public Cliente(String numero, int segundos) {
		this.numero = numero;
		this.segundos = segundos;
	}

	public String getNumero() {
		return numero;
	}

	public int getSegundos() {
		return segundos;
	}

}
