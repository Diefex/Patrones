package facturacion;

import datos.Cliente;
import datos.Transaccion;

public class Facturacion {

	private static Facturacion facturacion;

	private Facturacion() {

	}

	public Facturacion get() {
		if (facturacion == null) {
			facturacion = new Facturacion();
		}
		return facturacion;
	}

	public static String generarFactura(Cliente cliente, Transaccion pago) {
		String factura = "<html>";

		factura += "FACTURA " + pago.getFecha() + "<br>";
		factura += "<br> Cliente: " + cliente.getNombre();
		factura += "<br> Numero de Cuenta: " + "****.****.****." + cliente.getNumeroCuenta().substring(15);
		factura += "<br> Saldo $" + cliente.getSaldo();
		factura += "<br> " + pago.getDescripcion() + " por valor de $" + pago.getValor();

		factura += "</html>";
		return factura;
	}

}
