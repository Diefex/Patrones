package main;

public class MicroStrip implements Antena {

	public int Patron;
	public int SWR;
	public int Potencia;
	
	public MicroStrip () {
		Patron = 3;
		SWR = 0;
		Potencia = 16;
	}
	
	@Override
	public String getTipoAntena() {
		return "Patron: "+Patron+"\nSWR: "+SWR+"\nPotencia: "+Potencia;
	}
	

}
