package builders;

public abstract class PcBuilder {

	public Pc pc;

	public PcBuilder() {
		this.pc = new Pc();
	}

	public abstract void montarBoard();

	public abstract void montarProcesador();

	public abstract void montarRam();

	public abstract void montarTargetas();

	public abstract void montarDisco();

	public abstract void montarRefrigeracion();

	public Pc getPc() {
		return this.pc;
	}

}
