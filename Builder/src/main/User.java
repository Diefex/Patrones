package main;

import java.util.Scanner;

import builders.GamerPcBuilder;
import builders.OficinaPcBuilder;
import builders.Pc;

public class User {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Que computador desea?");
		System.out.println("   1.Pc Oficina");
		System.out.println("   2.Pc Gamer");

		Director director = new Director();
		Pc pc;

		switch (sc.nextInt()) {

		case 1: {
			pc = director.armarPc(new OficinaPcBuilder());
			break;
		}

		case 2: {
			pc = director.armarPc(new GamerPcBuilder());
			break;
		}

		default: {
			pc = null;
			break;
		}

		}

		System.out.println("Su computador esta listo:");
		System.out.println("Procesador: " + pc.getProcesador());
		System.out.println("Ram: " + pc.getRam());
		System.out.println("Tarjetas: " + pc.getTargetas());
		System.out.println("Board: " + pc.getBoard());
		System.out.println("Disco: " + pc.getDisco());
		System.out.println("Refrigeracion: " + pc.getRefrigeracion());

	}

}
