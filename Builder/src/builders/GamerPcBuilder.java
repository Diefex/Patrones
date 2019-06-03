package builders;

public class GamerPcBuilder extends PcBuilder {

	public GamerPcBuilder() {
		super();
	}

	@Override
	public void montarBoard() {
		pc.setBoard("Gigabyte AM4 B450 GamingX");
	}

	@Override
	public void montarProcesador() {
		pc.setProcesador("AMD Ryzen 5 1600X");
	}

	@Override
	public void montarRam() {
		pc.setRam("Corssair Vengeance 8GB DDR4 2600mhz", 0);
		pc.setRam("Corssair Vengeance 8GB DDR4 2600mhz", 1);
	}

	@Override
	public void montarTargetas() {
		pc.setTargetas("Nvidia GeForce GTX 2080", 0);
	}

	@Override
	public void montarDisco() {
		pc.setDisco("Seagate SSD FireCuda 510 2TB");
	}

	@Override
	public void montarRefrigeracion() {
		pc.setRefrigeracion("CoolerMaster Liquid MI120I RGB");
	}

}
