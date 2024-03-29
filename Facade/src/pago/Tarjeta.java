package pago;

import datos.Cliente;
import datos.Transaccion;

public class Tarjeta extends MedioPago {

	@Override
	public String pagar(long precio, Cliente cliente, Cliente destino) {
		if (cliente.getSaldo() >= precio) {
			cliente.retirarSaldo(precio);
			cliente.getTransacciones()
					.add(new Transaccion("Pago a " + destino.getNombre() + " v�a Tarjeta de Credito", precio));
			destino.depositarSaldo(precio);
			destino.getTransacciones()
					.add(new Transaccion("consignaci�n de " + cliente.getNombre() + " v�a Tarjeta de Credito", precio));
			return "Usted pag� $" + precio + " a " + destino.getNombre() + " v�a Tarjeta de Credito";
		} else {
			return "Usted no dispone de fondos suficientes para esta transacci�n";
		}
	}

}
