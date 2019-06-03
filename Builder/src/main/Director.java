package main;

import builders.Pc;
import builders.PcBuilder;

public class Director {

	public Pc armarPc(PcBuilder builder) {
		builder.montarBoard();
		builder.montarProcesador();
		builder.montarRam();
		builder.montarTargetas();
		builder.montarDisco();
		builder.montarRefrigeracion();

		return builder.getPc();
	}

}
