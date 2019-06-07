package pago;

import datos.Cliente;

public abstract class MedioPago {

	public abstract String pagar(long precio, Cliente cliente, Cliente destino);

}
