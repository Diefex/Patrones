package main;

public class LogPeriodica implements Antena {

	public int Patron;
	public int SWR;
	public int Potencia;
	
	public LogPeriodica () {
		Patron = 2;
		SWR = 1;
		Potencia = 8;
	}
	
	@Override
	public String getTipoAntena() {
		return "Patron: "+Patron+"\nSWR: "+SWR+"\nPotencia: "+Potencia;
	}
	

}
