package main;

public class Yagi implements Antena {

	public int Patron;
	public int SWR;
	public int Potencia;

	public Yagi () {
		Patron = 1;
		SWR = 2;
		Potencia = 3;
	}
	@Override
	public String getTipoAntena() {
		return "Patron: "+Patron+"\nSWR: "+SWR+"\nPotencia: "+Potencia;
	}
	
}
