package datos;

import java.util.ArrayList;

public class Cliente {

	private String Nombre;
	private String NumeroCuenta;
	private long Saldo;
	private ArrayList<Transaccion> transacciones;

	public Cliente(String nombre, String numero) {
		this.Nombre = nombre;
		this.NumeroCuenta = numero;
		this.Saldo = 0;
		this.transacciones = new ArrayList<Transaccion>();
	}

	public Cliente(String nombre, String numero, long saldo) {
		this.Nombre = nombre;
		this.NumeroCuenta = numero;
		this.Saldo = saldo;
		this.transacciones = new ArrayList<Transaccion>();
	}

	public String getNombre() {
		return Nombre;
	}

	public String getNumeroCuenta() {
		return NumeroCuenta;
	}

	public long getSaldo() {
		return Saldo;
	}

	public void depositarSaldo(long saldo) {
		Saldo += saldo;
	}

	public void retirarSaldo(long saldo) {
		Saldo -= saldo;
	}

	public ArrayList<Transaccion> getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(ArrayList<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}

	public Cliente clonar() {
		Cliente c = new Cliente(this.Nombre, this.NumeroCuenta);
		c.depositarSaldo(this.Saldo);
		c.setTransacciones(this.transacciones);
		return c;
	}

}
