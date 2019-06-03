package main;

import java.util.Scanner;

public class GraficadorAntena {

	Scanner sc = new Scanner(System.in);
	
	Antena antena;
	AntenaFactory fabrica = new AntenaFactory();
	
	public void graficarAntena() {
		System.out.println("Que antena desea Graficar?");
		String tipo = sc.nextLine();
		antena = fabrica.crearAntena(tipo);
		if(antena != null) {
			System.out.println(antena.getTipoAntena());
		} else {
			System.out.println("La antena no esta en el sistema");
		}
	}
	
}
