package pago;

import datos.Cliente;
import datos.Transaccion;

public class PayPal extends MedioPago {

	@Override
	public String pagar(long precio, Cliente cliente, Cliente destino) {
		if (cliente.getSaldo() >= precio) {
			cliente.retirarSaldo(precio);
			cliente.getTransacciones().add(new Transaccion("Pago a " + destino.getNombre() + " vía PayPal", precio));
			destino.depositarSaldo(precio);
			destino.getTransacciones()
					.add(new Transaccion("consignación de " + cliente.getNombre() + " vía PayPal", precio));
			return "Usted pagó $" + precio + " a " + destino.getNombre() + " vía PayPal";
		} else {
			return "Usted no dispone de fondos suficientes para esta transacción";
		}
	}

}
