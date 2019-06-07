package pago;

import datos.Cliente;
import datos.Transaccion;

public class Pse extends MedioPago {

	@Override
	public String pagar(long precio, Cliente cliente, Cliente destino) {
		if (cliente.getSaldo() >= precio) {
			cliente.retirarSaldo(precio);
			cliente.getTransacciones().add(new Transaccion("Pago a " + destino.getNombre() + " vía Pse", precio));
			destino.depositarSaldo(precio);
			destino.getTransacciones()
					.add(new Transaccion("consignación de " + cliente.getNombre() + " vía Pse", precio));
			return "Usted pagó $" + precio + " a " + destino.getNombre() + " vía PSE";
		} else {
			return "Usted no dispone de fondos suficientes para esta transacción";
		}
	}

}
