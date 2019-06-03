package main;

public class AntenaFactory implements Factory {

	public final static String Yagi = "Yagi";
	public final static String LogPeriodica = "LogPeriodica";
	public final static String MicroStrip = "MicroStrip";
	
	@Override
	public Antena crearAntena(String tipo) {
		
		if(tipo.equalsIgnoreCase(Yagi)) {
			return new Yagi();
		} else if(tipo.equalsIgnoreCase(LogPeriodica)) {
			return new LogPeriodica();
		} else if(tipo.equalsIgnoreCase(MicroStrip)) {
			return new MicroStrip();
		} else {
			return null;
		}
		
	}

}
