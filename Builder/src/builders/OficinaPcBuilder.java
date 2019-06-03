package builders;

public class OficinaPcBuilder extends PcBuilder {

	public OficinaPcBuilder() {
		super();
	}

	@Override
	public void montarBoard() {
		pc.setBoard("Intel LGA ATX");
	}

	@Override
	public void montarProcesador() {
		pc.setProcesador("Intel celeron n3060");
	}

	@Override
	public void montarRam() {
		pc.setRam("ADATA DDR3 2GB 1600mhz", 0);
	}

	@Override
	public void montarTargetas() {
		pc.setTargetas("MSI GTX 1050Ti", 0);
		pc.setTargetas("Tp-link  Pci Express Wifi N750mbps", 1);
		pc.setTargetas("Generico Adaptador Bluethoot 4.0 ", 2);
	}

	@Override
	public void montarDisco() {
		pc.setDisco("Seagate HDD Barracuda 210 1TB");
	}

	@Override
	public void montarRefrigeracion() {
		pc.setRefrigeracion("Arctic 33 110rpm");
	}

}
