package flyweight;

import clientes.Cliente;

public class Canal implements CanalFlyweight {

	int frecuencia;
	int numero;
	boolean ocupado;
	int segs = 0;
	int tiempo = 0;
	String comunicando;

	public Canal(int frecuencia, int numero) {
		this.frecuencia = frecuencia;
		this.numero = numero;
	}

	@Override
	public synchronized void comunicar(Cliente cliente) {
		comunicando = "Canal " + numero + " Comunicando a " + cliente.getNumero();
		segs = cliente.getSegundos();
		ocupado = true;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void tiempo() {
		tiempo++;
		if (tiempo >= segs) {
			ocupado = false;
			tiempo = 0;
			segs = 0;
		}
	}

	public int getNumero() {
		return numero;
	}

	public String getComunicando() {
		return comunicando;
	}

}
