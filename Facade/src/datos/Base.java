package datos;

import java.util.ArrayList;

public class Base {

	private static Base BaseDeDatos;

	private static ArrayList<Cliente> Clientes;

	private Base() {
		Clientes = new ArrayList<Cliente>();
		Clientes.add(new Cliente("Trabajo", "1234.4321.5678.8765", 1000000));
		Clientes.add(new Cliente("Banco", "7890.0987.1029.6574", 1000000000));
		Clientes.add(new Cliente("Diego", "1056.2947.3838.1234", 100000));
	}

	public static Base get() {
		if (BaseDeDatos == null) {
			BaseDeDatos = new Base();
		}
		return BaseDeDatos;
	}

	public void nuevoCliente(String nombre, String numero) {
		Clientes.add(new Cliente(nombre, numero));
	}

	public ArrayList<Cliente> getClientes() {
		return Clientes;
	}

}
