package main;

import datos.Base;
import datos.Cliente;
import facturacion.Envio;
import facturacion.Facturacion;
import pago.MedioPago;

public class Fachada {

	private static Fachada fachada;
	private Base bd;
	private Envio envio;

	private Fachada() {
		bd = Base.get();
		envio = Envio.get();
	}

	public static Fachada get() {
		if (fachada == null) {
			fachada = new Fachada();
		}
		return fachada;
	}

	public String factura(String numCuenta) {
		Cliente cliente = null;
		for (Cliente c : bd.getClientes()) {
			if (c.getNumeroCuenta().contentEquals(numCuenta)) {
				cliente = c;
				break;
			}
		}
		if (cliente != null) {
			return Facturacion.generarFactura(cliente,
					cliente.getTransacciones().get(cliente.getTransacciones().size() - 1));
		} else {
			return "El numero de cuenta no existe o no es valido";
		}
	}

	public String saldo(String numCuenta) {
		Cliente cliente = null;
		for (Cliente c : bd.getClientes()) {
			if (c.getNumeroCuenta().contentEquals(numCuenta)) {
				cliente = c;
				break;
			}
		}
		if (cliente != null) {
			return "Apreciado cliente " + cliente.getNombre() + ", su saldo es: $" + cliente.getSaldo();
		} else {
			return "El numero de cuenta no existe o no es valido";
		}
	}

	public String pagar(String numCuentaCliente, String numCuentaDestino, MedioPago pago, long valor) {
		Cliente cliente = null;
		Cliente destino = null;
		for (Cliente c : bd.getClientes()) {
			if (c.getNumeroCuenta().contentEquals(numCuentaCliente)) {
				cliente = c;
				break;
			}
		}
		for (Cliente c : bd.getClientes()) {
			if (c.getNumeroCuenta().contentEquals(numCuentaDestino)) {
				destino = c;
				break;
			}
		}
		if (cliente != null && destino != null) {
			return pago.pagar(valor, cliente, destino);

		} else {
			return "El numero de cuenta no existe o no es valido";
		}

	}

	public void enviar(String factura) {
		envio.enviar(factura);
	}

}
